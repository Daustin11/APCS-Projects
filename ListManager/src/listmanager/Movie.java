/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listmanager;

public class Movie implements Comparable{
    public String name;
    public String director;
    public int year;
    public double rating;
    public double visuals;
    
    public Movie(){
        name = "";
        director = "";
        year = 0;
        rating = 0;
        visuals = 0;                
    }
    
    public Movie(String n, String d, int y, double r, double i){
        name = n;
        director = d;
        year = y;
        rating = r;
        visuals = i;                        
    }
    
    public String getName(){
        return name;
    }
    public String getDirector(){
        return director;
    }
    public int getYear(){
        return year;
    }
    public double getRating(){
        return rating;
    }
    public double getVisuals(){
        return visuals;
    }
    public void setName(String n){
        name = n;
    }
    public void setDirector(String n){
        director = n;
    }
    public void setYear(int n){
        year = n;
    }
    public void setVisuals(double n){
        visuals = n;
    }
    public void setRating(double n){
        rating = n;
    }
    
    @Override
    public String toString(){
        return name + "\t" + director + "\t" +  year + "\t" + visuals + "\t" + rating;  
    }

    @Override
    public int compareTo(Object o) {
        Movie other = (Movie)o; //Casting object
        if(year == other.year)
        //If the release years of two movies are the same then compare names
            return name.compareTo(other.name); 
        else
            return other.year - year;
        //checks which year is greater to help with sorting
    }
            
}
