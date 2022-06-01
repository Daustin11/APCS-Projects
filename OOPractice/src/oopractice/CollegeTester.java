/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopractice;

/**
 *
 * @author 22brobdani
 */
public class CollegeTester {
       public static void main(String[] args) {
       College c1 = new College("Penn State");
       c1.setInState(.50);
       c1.setOutState(.35);
       c1.setTuition(35000);
       System.out.println("In-State Admission: "+c1.getInStateAdmission());
       System.out.println("Out-State Admission: "+c1.getOutStateAdmission());
       System.out.println("In-State Tuition: "+c1.getInTuition());
       System.out.println("Out-State Tuition: "+c1.getOutTuition());              
   }

}
