/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minesweeper;

import java.util.Random;

/**
 *
 * @author Flash
 */
public class MineSweeperModel {

    static Random r = new Random();
    public int tiles[][];
    public boolean revealed[][];
    public int height;
    public int width;
    public int mines;
    public boolean flagged[][];

    public MineSweeperModel(int y, int x) { //Costructor
        height = y; 
        width = x;
        tiles = new int[height][width];
        revealed = new boolean[height][width];
        flagged = new boolean[height][width];
    }

    public int PlantMines(int b, int y, int x) { //Self explanitory
        mines = b;
        for (int f = 0; f < y; f++) 
            for (int s = 0; s < x; s++)
                revealed[f][s] = false;
        for (int i = 0; i < mines;) { 
            int num1 = r.nextInt(height);//identify random space
            int num2 = r.nextInt(width);
            if (num1 == y && num2 == x) { //makes it so you cant plant a mine in the inital space or any adjacent space
            }else if(num1 == y+1 && num2 == x){                
            }else if(num1 == y+1 && num2 == x-1){                
            }else if(num1 == y+1 && num2 == x+1){                
            }else if(num1 == y-1 && num2 == x){                
            }else if(num1 == y-1 && num2 == x+1){                
            }else if(num1 == y-1 && num2 == x-1){                
            }else if(num1 == y && num2 == x+1){                
            }else if(num1 == y && num2 == x-1){                
            }
            else if (tiles[num1][num2] == 0) {
                tiles[num1][num2] += 10; //10 means the space is a mine
                i++;
            }
        }
        AssignValues(); 
        return 0;
    }

    public void AssignValues() {
        for (int r = 0; r < height; r++) { //loops through each tile in the array
            for (int c = 0; c < width; c++) {
                //following method checks if any adjacent tile contains a mine and adds to tatal if it does
                if (tiles[r][c] == 0) {
                    if (inBounds(r + 1, c - 1) && isBomb(r + 1, c - 1)) {
                        tiles[r][c] += 1;
                    }
                    if (inBounds(r + 1, c) && isBomb(r + 1, c)) {
                        tiles[r][c] += 1;
                    }
                    if (inBounds(r + 1, c + 1) && isBomb(r + 1, c + 1)) {
                        tiles[r][c] += 1;
                    }
                    if (inBounds(r, c - 1) && isBomb(r, c - 1)) {
                        tiles[r][c] += 1;
                    }
                    if (inBounds(r - 1, c - 1) && isBomb(r - 1, c - 1)) {
                        tiles[r][c] += 1;
                    }
                    if (inBounds(r - 1, c) && isBomb(r - 1, c)) {
                        tiles[r][c] += 1;
                    }
                    if (inBounds(r, c + 1) && isBomb(r, c + 1)) {
                        tiles[r][c] += 1;
                    }
                    if (inBounds(r - 1, c + 1) && isBomb(r - 1, c + 1)) {
                        tiles[r][c] += 1;
                    }

                }

            }
        }
    }

    public int getValue(int y, int x) { //getter
        int a = tiles[y][x];
        return a;
    }

    public void revealSpaces(int y, int x) {
        if (x < 0 || y < 0 || x == width || y == height)
            return;
        if (tiles[y][x] == 0 && isRevealed(y, x) == false) { //if the selevted til is equal to 0 recerse through all adjacent tiles
                revealed[y][x] = true;
                revealSpaces(y + 1, x);
                revealSpaces(y - 1, x);
                revealSpaces(y + 1, x - 1);
                revealSpaces(y + 1, x + 1);
                revealSpaces(y - 1, x + 1);
                revealSpaces(y - 1, x - 1);
                revealSpaces(y, x + 1);
                revealSpaces(y, x - 1);
            }
            if (tiles [y][x] > 0 && isRevealed(y,x) == false) //reveals individual tile if not 0
                if(tiles[y][x] < 10)
                revealed[y][x] = true;
        }

    

    public boolean inBounds(int y, int x) {  
        if (y >= height || y < 0) {
            return false;
        } else if (x >= width || x < 0) {
            return false;
        }
        return true;
    }

    public boolean isBomb(int y, int x) {
        if (inBounds(y, x)) {
            if (tiles[y][x] == 10) {
                return true;
            }
        }
        return false;
    }

    public boolean isRevealed(int y, int x) {
        boolean t = revealed[y][x];
        return t;
    }

    public void reset(){
        for (int r = 0; r < height; r++) {
            for (int c = 0; c < width; c++) {
                revealed[r][c] = false;
                tiles[r][c] = 0;
            }
        }
    }

    public boolean notBomb(int y, int x) {
        if (inBounds(y, x)) {
            if (tiles[y][x] == 10) {
                return false;
            }

        }
        return true;
    }

}
