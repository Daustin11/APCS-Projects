package arraylistpractice;

/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * S-h-e-n-e-n-d-e-h-o-w-a--H-i-g-h--S-c-h-o-o-l--T-e-c-h-n-o-l-o-g-y--D-e-p-t
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * FILE:        Employee.java
 * DATE:        Nov 3, 2014 Original
 * AUTHOR:      mr Hanley
 * VERSION:     2.1
 * PURPOSE:     Employee problem from Big Java
 *
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *
 * m-r-h-a-n-l-e-y-c-.c-o-m~~~~~~~~~~t-e-a-m-2-0-.-c-o-m~~~~~~~~~~~~~~~~~~~~~~
 */
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Employee {

    //----------------------------------------------------------------
    //-------------- I N S T A N C E  V A R I A B L E S --------------
    //----------------------------------------------------------------
    private double salary;
    private String name;

    ////////////////////////////////////////////////////////////////// 
    ///////////////////    C O N S T R U C T O R S   /////////////////   
    //////////////////////////////////////////////////////////////////
    public Employee() {
        name = "";
    }

    public Employee(String na, double sal) {
        name = na;
        salary = sal;
    }
    //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
    //AAAAAAAAAAAAAAAAA       A C C E S S O R S      AAAAAAAAAAAAAAAAA
    //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA

    public String getName() {
        return name != null ? name : "             ";
    }

    public double getSalary() {
        return salary;
    }
    ////<M><M><M><M><M><M><M><M><M><M><M><M><M><M><M><M><M><M><M><M><M>
    ////<M><M><M><M><M>        M U T A T O R S          <M><M><M><M><M>
    ////<M><M><M><M><M><M><M><M><M><M><M><M><M><M><M><M><M><M><M><M><M>
    public void setName(String n) {
        name = n;
    }

    /**
     * setSalary preconditions: sal >0
     *
     * @param sal salary which must be 0 or positive
     *
     */
    public void setSalary(double sal) {
        if (sal >= 0) {
            salary = sal;
        }
    }
    /**
     *
     * @param byPercent a number > 0 which represents the raise to annual salary
     */
    public void raise(double byPercent) {
        salary += salary * byPercent / 100;
    }
    public String toString(){
        return name + "\t" + salary;
    }
}
