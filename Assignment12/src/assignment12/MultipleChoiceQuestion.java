/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment12;

/**
 *
 * @author Flash
 */
public class MultipleChoiceQuestion extends Question {

    public String a;
    public String b;
    public String c;
    public String d;

    public MultipleChoiceQuestion(String q, String ans, String a, String b, String c, String d) {
        super(q, ans);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public boolean evaluateAnswer(String ans) {
        if (ans.equalsIgnoreCase("A")) { //Translates letter response to the full reponse
            ans = a;
        }
        if (ans.equalsIgnoreCase("B")) {
            ans = b;
        }
        if (ans.equalsIgnoreCase("C")) {
            ans = c;
        }
        if (ans.equalsIgnoreCase("D")) {
            ans = d;
        }
        return super.evaluateAnswer(ans);
    }

}
