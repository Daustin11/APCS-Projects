/**
* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
* S-h-e-n-e-n-d-e-h-o-w-a--H-i-g-h--S-c-h-o-o-l--T-e-c-h-n-o-l-o-g-y--D-e-p-t
* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
* FILE: Employee.java
* DATE: Dec 3, 2021
* AUTHOR: Daniel Broberg
* VERSION: 2.1
* PURPOSE: Create student object
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
public class Student {
    //----------------------------------------------------------------
    //------ I N S T A N C E V A R I A B L E S / F I E L D S --------
    //----------------------------------------------------------------
    private double quiz;
    private String name;
    private double average;
    private double total;
    //////////////////////////////////////////////////////////////////
    ///////////////      C O N S T R U C T O R S       ///////////////
    //////////////////////////////////////////////////////////////////
    public Student(){        
    }
    
    public Student(String str){
      average=0;
      name=str;
      quiz = 0;
    }
    //MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
    //MMMMMMMMMMMMMMM M U T A T O R S MMMMMMMMMMMMMMMMMMMMMMMM
    //MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
    public void addQuiz(double g){
        quiz = quiz + g;
        total++;
    }
    public void clear(){
        quiz = 0;
        average = -1;
    }
    //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
    //AAAAAAAAAAAAAAAAAAAA A C C E S S O R S AAAAAAAAAAAAAAAAAAAAAAA
    //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
    public double getTotalPoints(){
        return quiz;
    }
    public double getAverage (){
        if (average == -1){
            return average;
        }
        else {
            average = Math.round(quiz/total);
        }
        return average;
    }
    public String toString (){
        return ("");
        
    }
}
