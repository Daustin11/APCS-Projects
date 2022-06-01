/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perfect.number.decider;

/**
 *
 * @author 22brobdani
 */
import java.util.Scanner;

public class PerfectNumberDecider {
public static void main(String[] args) {
    System.out.println("Please Enter a Number");
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    int sum = 0;
    sum = divisorSum(num, sum);
    System.out.println("Sum is " +sum);
    if (sum == num){
       System.out.println("This Number is Perfect");
    }
    if (sum > num){
       System.out.println("This Number is Abundant");
    }
    if (num > sum){
       System.out.println("This Number is Deficient");
    }
  }

  public static int divisorSum(int num, int sum){
    int div = 1;
    while (num > div){       
       boolean isTrue = isDivisor(num, div);
       if (isTrue){
         sum = sum + div;
       }
      div++;
    }
    return sum;     
  }

  public static boolean isDivisor(int num, int div) {
    if (num % div == 0){
      return true;          
    }
    return false;    
  }      
}
