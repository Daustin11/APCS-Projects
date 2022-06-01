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
public class STester {

    public static void main(String[] args) {
        Student s = new Student("Billy");
        s.addQuiz(70);
        s.addQuiz(84);
        s.addQuiz(100);
        System.out.println("Total Score: "+s.getTotalPoints()); //prints 254
        System.out.println("Average: "+s.getAverage()); //prints 85
        s.clear();
        System.out.println(s.getTotalPoints()); //prints 0
        double avg = s.getAverage(); 
        if(avg == -1){
            System.out.println("THERE ARE NO QUIZZES AVAILABLE");
        }
    }
}
