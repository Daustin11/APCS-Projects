
public class Car {
    private double mpg;
    private String name;
    private double gas;
    private double distance;
    public Car(){        
    }
    
    public Car(int f){
      gas=0;
      name=" ";
      mpg = f;
    }
    public void addGas(double g){
        gas = gas+g;
    }
    public void fuelEfficiency(double f){
        mpg = f;
    }
    public void setName(String str){
        name = str;
    }
    public double getGas(){
        return gas;
    }
    public void drive(double d){
        distance = d;
        gas = gas - distance/mpg;
    }   
}
