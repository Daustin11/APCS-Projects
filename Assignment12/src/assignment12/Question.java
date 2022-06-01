/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment12;

/**
 *
 * @author Flash
 */
public class Question {
    public String question;
    public String answer;
    
    public Question(String q, String a){
        question = q;
        answer = a;        
    }
    
    public boolean evaluateAnswer(String a){
        if (answer.equalsIgnoreCase(a))
            return true;
        return false;
    }
    
    @Override
    public String toString(){
        return question;
    }        

}
