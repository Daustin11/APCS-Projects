/**
* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
* S-h-e-n-e-n-d-e-h-o-w-a--H-i-g-h--S-c-h-o-o-l--T-e-c-h-n-o-l-o-g-y--D-e-p-t
* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
* FILE: Employee.java
* DATE: Dec 3, 2021
* AUTHOR: Daniel Broberg
* VERSION: 2.1
* PURPOSE: Create planet object
*
* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*
11
* m-r-h-a-n-l-e-y-c-.c-o-m~~~~~~~~~~t-e-a-m-2-0-.-c-o-m~~~~~~~~~~~~~~~~~~~~~~
*/
package oopractice;


public class Planet {
    //----------------------------------------------------------------
    //------ I N S T A N C E V A R I A B L E S / F I E L D S --------
    //----------------------------------------------------------------
    private double year;
    private String name;
    private double days;
    private int orbits;
    //////////////////////////////////////////////////////////////////
    ///////////////      C O N S T R U C T O R S       ///////////////
    //////////////////////////////////////////////////////////////////
    public Planet(){        
    }
    
    public Planet(String ne,double f){
      year = f;
      name=ne;
    }
    //MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
    //MMMMMMMMMMMMMMM M U T A T O R S MMMMMMMMMMMMMMMMMMMMMMMM
    //MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
    public void addDays(double g){
        days = days + g;
    }
    //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
    //AAAAAAAAAAAAAAAAAAAA A C C E S S O R S AAAAAAAAAAAAAAAAAAAAAAA
    //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
    public double getDays(){
        return days;
    }
    public int getNumOrbits(){
        if (year > days){
            orbits = 0;
        }
        else{
            while (days >= year){
                days = days - year;
                orbits++;
            }
        }
        return orbits;
    }
    public double getDaysTowardNext(){
        return days;
    }
    
        
}
