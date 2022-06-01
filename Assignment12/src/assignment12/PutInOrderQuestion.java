/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment12;

/**
 *
 * @author Flash
 */
public class PutInOrderQuestion extends Question{
    
    public String first;
    public String second;
    public String third;
    public String answer;
   
    
    public PutInOrderQuestion (String q, String first, String second, String third){
        super(q,first+", "+second+", "+third); //Sends question and correct answer (i.e correct sequence of words to super class
    }

}
