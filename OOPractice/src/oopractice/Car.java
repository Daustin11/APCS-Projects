/**
* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
* S-h-e-n-e-n-d-e-h-o-w-a--H-i-g-h--S-c-h-o-o-l--T-e-c-h-n-o-l-o-g-y--D-e-p-t
* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
* FILE: Employee.java
* DATE: Dec 3, 2021
* AUTHOR: Daniel Broberg
* VERSION: 2.1
* PURPOSE: Create car object
*
* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*
11
* m-r-h-a-n-l-e-y-c-.c-o-m~~~~~~~~~~t-e-a-m-2-0-.-c-o-m~~~~~~~~~~~~~~~~~~~~~~
*/

package oopractice;

/**
 *
 * @author 22brobdani
 */
public class Car {
    //----------------------------------------------------------------
    //------ I N S T A N C E V A R I A B L E S / F I E L D S --------
    //----------------------------------------------------------------
    private double mpg;
    private String name;
    private double gas;
    private double distance;
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //++++++++++++    S T A T I C V A R I A B L E S   ++++++++++++++++
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public static double TotalDistance = 0;
    //////////////////////////////////////////////////////////////////
    ///////////////      C O N S T R U C T O R S       ///////////////
    //////////////////////////////////////////////////////////////////  
    public Car(){        
    }
    public Car(int f){
      gas=0;
      name=" ";
      mpg = f;
    }
    //MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
    //MMMMMMMMMMMMMMM M U T A T O R S MMMMMMMMMMMMMMMMMMMMMMMM
    //MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
    public void addGas(double g){
        gas = gas+g;
    }
    public void fuelEfficiency(double f){
        mpg = f;
    }
    public void setName(String str){
        name = str;
    }
    //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
    //AAAAAAAAAAAAAAAAAAAA A C C E S S O R S AAAAAAAAAAAAAAAAAAAAAAA
    //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
    public String getName (){
        return name;
    }
    public double getGas(){
        return gas;
    }
    public double getDistance(){
        return distance;
    }
    //MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
    //MMMMMMMMMMMMMMM M U T A T O R S MMMMMMMMMMMMMMMMMMMMMMMM
    //MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
    public void drive(double d){
        distance = d;
        gas = gas - distance/mpg;
    }
    public String toString(){
        return (" Name: "+name+" MPG: "+mpg+" Fuel: "+gas);
    }
}
