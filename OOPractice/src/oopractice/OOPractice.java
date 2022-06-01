
package oopractice;

/**
 *
 * @author 22brobdani
 */
public class OOPractice {

    public static void main(String[] args) {
        Car myBeemer = new Car(29); //29 miles per gallon 
        myBeemer.setName("Hyundai");
        System.out.println("Car Name: "+myBeemer.getName());
        myBeemer.addGas(20); //tank 20 gallons
        System.out.println("Gallons of gas added: "+myBeemer.getGas());
        myBeemer.drive(100);
        System.out.print("Driving "+myBeemer.getDistance());
        System.out.println(" Miles");
        System.out.println("------------------------------------------------");
        System.out.println(myBeemer.getGas());
        System.out.println(myBeemer.toString());
    }

}
