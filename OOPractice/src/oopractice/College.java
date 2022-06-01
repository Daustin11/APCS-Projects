/**
* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
* S-h-e-n-e-n-d-e-h-o-w-a--H-i-g-h--S-c-h-o-o-l--T-e-c-h-n-o-l-o-g-y--D-e-p-t
* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
* FILE: Employee.java
* DATE: Dec 3, 2021
* AUTHOR: Daniel Broberg
* VERSION: 2.1
* PURPOSE: Create College object
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
public class College {
    //----------------------------------------------------------------
    //------ I N S T A N C E V A R I A B L E S / F I E L D S --------
    //----------------------------------------------------------------
   private double inAdd;
   private double inTuition;   
   private String name;
   private double outAdd;
   private double outTuition;
   private double Tuition;
    //////////////////////////////////////////////////////////////////
    ///////////////      C O N S T R U C T O R S       ///////////////
    //////////////////////////////////////////////////////////////////
   public College(){       
   }
   
   public College(String ne){
     name=ne;
   }
   //MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
   //MMMMMMMMMMMMMMM M U T A T O R S MMMMMMMMMMMMMMMMMMMMMMMM
   //MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
   public void setInState(double a){
       inAdd = a;
   }
   public void setOutState(double a){
       inAdd = a;
   }
   public void setTuition(double f){
       inTuition = f;
       outTuition = inTuition * 1.25;
   }
   //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
   //AAAAAAAAAAAAAAAAAAAA A C C E S S O R S AAAAAAAAAAAAAAAAAAAAAAA
   //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
   public double getInStateAdmission(){
       return inAdd;
   }
   public double getOutStateAdmission(){
       return outAdd;
   }
   public double getInTuition(){
     return inTuition;
   }
   public double getOutTuition(){
     return outTuition;
   }
 
}

