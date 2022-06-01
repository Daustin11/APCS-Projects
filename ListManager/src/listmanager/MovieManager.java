/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listmanager;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.Collections;
import java.util.StringTokenizer; 

/**
 *
 * @author Flash
 */
public class MovieManager {

    Scanner input = new Scanner(System.in);
    ArrayList<Movie> movieList = new ArrayList<Movie>();
    private boolean isChanged = false;
    private String title;
    private String director;
    private int year;
    private double visuals;
    private double rating;
    Movie se;
    Movie next;
    
    
    
    public static void main(String[] args) {
        MovieManager se = new MovieManager();
    }
    
    public MovieManager(){
        menu();
    }
    
    public void menu(){
        
        System.out.println("1 - Add Record");
        System.out.println("2 - Display List    ");
        System.out.println("3 - Sort List       ");
        System.out.println("4 - Edit a Record   ");
        System.out.println("5 - Remove a Record ");
        System.out.println("6 - Save List       ");
        System.out.println("7 - Archive List    ");
        System.out.println("8 - Load File       ");
        System.out.println("9 - Exit Program    ");
        System.out.println("");
        System.out.println("File is changed = "+isChanged);
        int select = input.nextInt();
        switch(select){
            case 1: addMovie();
                    menu();
                    break;
            case 2: display();
                    menu();
                    break;
            case 3: sort();
                    menu();
                    break;
            case 4: edit();
                    menu();
                    break;
            case 5: remove();
                    menu();
                    break;
            case 6: save();
                    menu();
                    break;
            case 7: archive();
                    menu();
                    break;
            case 8: load();
                    menu();
                    break;
            case 9: System.exit(0);
            
                 
    }                
    }
    public void addMovie(){            
            // Gather Inputs
            System.out.println("Please enter a Movie Title");
            input.nextLine(); //Eliminates error where console does not wait for an input to move on
            title = input.nextLine(); //Input is held in a global variable
            System.out.println("What Was the Name of the Director");  //Gather other inputs
            director = input.nextLine();
            System.out.println("What Year was this Movie Released?");
            year = input.nextInt();
            System.out.println("How Would You Rate The Visuals");
            visuals = input.nextDouble();
            System.out.println("What is Your Rating for This Movie");
            rating = input.nextDouble();
            movieList.add(new Movie(title, director, year, visuals, rating)); //Makes a new Movie object and adds it to my arraylist
            isChanged = true;//Marks that the info has been edited
        }
    
    public void display(){
        System.out.println(""); //Foirmating
        System.out.println("#" + "\t" + "Title" + "\t" +"\t"+ "Director" +"\t" + "Year" + "\t" + "Visuals" + "\t" + "Overall");
        
        for (int i = 0; i < movieList.size(); i++){    
            System.out.println(i+1 + "\t" + movieList.get(i));
        }
        System.out.println("");
    }
    
    public void edit(){
        isChanged = true;
        System.out.println("Which rating do you wish to edit (#)");
        int place = input.nextInt();
        int index = place - 1;
        se = movieList.get(index);
        System.out.println("What Field Do You Want To Change");
        input.nextLine();
        String field = input.nextLine();
        if(field.equalsIgnoreCase("Name")){
            System.out.println("What Is The New Name");
            input.nextLine();
            String temp = input.nextLine();
            se.setName(temp);
        }
        if(field.equalsIgnoreCase("Director")){
            System.out.println("Who is the new director");
            input.nextLine();
            String temp = input.nextLine();
            se.setDirector(temp);
        }
        if(field.equalsIgnoreCase("Year")){
            System.out.println("What Is The New Year");
            int temp = input.nextInt();
            se.setYear(temp);
        }
        if(field.equalsIgnoreCase("Visuals")){
            System.out.println("What Is The New Visuals Rating");
            double t = input.nextDouble();
            se.setVisuals(t);
        }
        if(field.equalsIgnoreCase("Overall")){
            System.out.println("What Is The New Overall Rating");
            double temp = input.nextDouble();
            se.setRating(temp);
        }
        else
            System.out.println("Not a Valid Response");
        movieList.set(index, se);
                 
    }
    
    public void remove(){
        isChanged = true;
        System.out.println("Which Rating do you want to remove");
        int out = input.nextInt();
        se = movieList.get(out-1);
        System.out.println(se.getName()+" Was removed");
        movieList.remove(out-1);
    }
        
    public void sort(){
        Collections.sort(movieList);
    }
    
    public void save(){
        try{
            FileWriter fw = new FileWriter("Movie.txt");
            PrintWriter pw = new PrintWriter(fw);
            for (int i = 0; i < movieList.size(); i++){
                se = movieList.get(i);
                String n = se.getName();
                String d = se.getDirector();
                int y = se.getYear();
                double v = se.getVisuals();
                double r = se.getRating();
                pw.println(n+"|"+d+"|"+y+"|"+v+"|"+r);
            }            

            pw.close();
        }catch(IOException e){
            System.out.println("File Was Not Found");
        }
    }
    
    public void quit(){
        if(isChanged == true){
            System.out.println("You Haven't Saved do You Want to Save (Yes or No)");
            String response = input.nextLine();
            if (response.equalsIgnoreCase("Yes")){
                save();
                System.out.println("List Was Saved");
                System.exit(0);
            }
            else if(response.equalsIgnoreCase("No"))
                System.exit(0);
            else{
                System.out.println("Not a valid response");
                quit();
            }
            
            
        }
    }
    
    public void archive(){
        try{
            FileWriter fw = new FileWriter("BackupMovie.txt");
            PrintWriter pw = new PrintWriter(fw);
            for (int i = 0; i < movieList.size(); i++){
                se = movieList.get(i);
                String n = se.getName();
                String d = se.getDirector();
                int y = se.getYear();
                double v = se.getVisuals();
                double r = se.getRating();
                pw.println(n+"|"+d+"|"+y+"|"+v+"|"+r);
            }            

            pw.close();
        }catch(IOException e){
            System.out.println("File Was Not Found");
        }
    }
    
    public void load(){
        try{
        BufferedReader input = new BufferedReader(new FileReader("Movie.txt"));
        String line;
        line = input.readLine();
        while (line != null) {//goes to the end of file
        StringTokenizer st = new StringTokenizer(line, "|"); 
        title = st.nextToken();
        director = st.nextToken();
        String y = st.nextToken();
        year = Integer.parseInt(y);
        String ir = st.nextToken();
        visuals = Double.parseDouble(ir);
        String r = st.nextToken();
        rating = Double.parseDouble(r);
        movieList.add(new Movie(title, director, year, visuals, rating));    
        line = input.readLine(); //must be at end so when no data
        }
        input.close();
        }catch(IOException e){
            System.out.println("File Was Not Found");
}
    
    }
}
