
package arraylistpractice;

/**
 *
 * @author 22BrobDani
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        ArrayList emps = new ArrayList();
        emps.add(new Employee("Jo Rogan", 8.47));
        emps.add(new Employee("James Zion", 10000000));
        for(int i=0; i < emps.size(); i++){
            System.out.println(emps.get(i));
        }
        System.out.println("-----------------------------");
        emps.add(1, new Employee("Shmunkey Venus", 1000000101));
        for(int i=0; i < emps.size(); i++){
            System.out.println(emps.get(i));
        }
        System.out.println("------------------------------");
        emps.remove(0);
        for(int i=0; i < emps.size(); i++){
            System.out.println(emps.get(i));
        }
        emps.set(0, new Employee("Paul Kane", 15000));
        for(int i=0; i < emps.size(); i++){
            System.out.println(emps.get(i));
        }        
        System.out.println("-------------------------------");
        Employee t1 = (Employee) emps.get(0);
        Employee t2 = (Employee) emps.get(1);
        if(t1.getSalary() > t2.getSalary())
            System.out.println(t1.getName()+ "\t"+"Makes More");
        else
            System.out.println(t2.getName()+ "\t"+"Makes More");
        int x = emps.size();
        for (int i =0; i < x; i++)
            emps.remove(i);        
    }
    
}
