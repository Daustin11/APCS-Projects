package oopractice;

public class PlanetTest {

    public static void main(String[] args) {
        Planet p1 = new Planet("Earth", 365.26);
        Planet p2 = new Planet("Mars", 686.98);
        p1.addDays(500);
        p2.addDays(500);
        System.out.print("Earth Progress is " +p1.getNumOrbits());
        System.out.print(" Orbits "+p1.getDaysTowardNext());
        System.out.println(" Days Towards Next Orbit");
        System.out.print("Earth Progress is " +p2.getNumOrbits());
        System.out.print(" Orbits "+p2.getDaysTowardNext());
        System.out.println(" Days Towards Next Orbit");
        
        
          
    }
    
}
