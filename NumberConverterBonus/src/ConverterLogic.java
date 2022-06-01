/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Flash
 */
import java.math.BigInteger;

public class ConverterLogic {

    public ConverterLogic() {
    }

    public static String DecToBinary(String a) {
        BigInteger d = new BigInteger(a);
        BigInteger div = new BigInteger("2");
        BigInteger constant = new BigInteger("0");
        String b = "";
        while (true) {
            BigInteger rem = d.remainder(div);
            d = d.divide(div);
            String temp = rem.toString();
            b = temp + b;
            if (d.equals(constant) == true) {
                break;
            }
        }
        return b;
    }

    public static String DecToHex(String a) {
        BigInteger d = new BigInteger(a);
        BigInteger div = new BigInteger("16");
        BigInteger rem = new BigInteger("0");
        BigInteger constant = new BigInteger("0");
        BigInteger ten = new BigInteger("10");
        BigInteger eleven = new BigInteger("11");
        BigInteger twelve = new BigInteger("12");
        BigInteger thirteen = new BigInteger("13");
        BigInteger fourteen = new BigInteger("14");
        BigInteger fifteen = new BigInteger("15");
        
        String str = "";
        while (true){
            rem = d.remainder(div);
            d = d.divide(div);
            int dif = rem.compareTo(ten);
            if (rem.equals(ten)== true)
                str = "a" + str;
            if (rem.equals(eleven)== true)
                str = "b" + str;
            if (rem.equals(twelve)== true)
                str = "c" + str;
            if (rem.equals(thirteen)== true)
                str = "d" + str;
            if (rem.equals(fourteen)== true)
                str = "e" + str;
            if (rem.equals(fifteen)== true)
                str = "f" + str;
            else if (dif == -1)
                str = rem.toString() + str;
            if(d.equals(constant)== true)
                break;
        }
        
        return str;
    }

    public static String BinaryToDec(String a) {
        BigInteger d = new BigInteger(a);
        BigInteger div = new BigInteger("10");
        BigInteger r = new BigInteger("2");
        BigInteger one = new BigInteger("1");        
        BigInteger b = new BigInteger("0");  
        String str = "";
        int length = a.length();
        int i = 0;
        while (length > i) {
            BigInteger rem = d.remainder(r);
            d = d.divide(div);
            if (rem.equals(one) == true){
                BigInteger result = r.pow(i);
                b = b.add(result);
            }
            i++;          
        }
        str = b.toString();
        
        return str;
    }

    public static String BinaryToHex(String a) {
        String b = BinaryToDec(a);
        String c = DecToHex(b);
        return c;
    }

    public static String HexToDec(String a) {
        String hexnum = a;
        BigInteger d = new BigInteger("16");
        BigInteger sixteen = new BigInteger("16");
        BigInteger total = new BigInteger("0");               
        String b = "";
        int length = hexnum.length();
        for (int i = 0; i < length; i++) {
            String tempa = hexnum.substring(length-i-1, length-i);
            String tempb = "";
            if(tempa.equalsIgnoreCase("a"))
               tempb = "10";
            else if(tempa.equalsIgnoreCase("b"))
               tempb = "11";
            else if(tempa.equalsIgnoreCase("c"))
               tempb = "12";
            else if(tempa.equalsIgnoreCase("d"))
               tempb = "13";
            else if(tempa.equalsIgnoreCase("e"))
               tempb = "14";
            else if(tempa.equalsIgnoreCase("f"))
               tempb = "15";           
            else if(tempa.compareTo("9")<=0){
                tempb = tempa;
            }
            BigInteger x = new BigInteger(tempb);
            BigInteger exponent = sixteen.pow(i);
            BigInteger result = x.multiply(exponent);
            System.out.println(result);
            total = total.add(result);            
            }
        b = total.toString();
        return b;
    }

    public static String HexToBinary(String a) {
        String b = HexToDec(a);
        String c = DecToBinary(b);
        return c;
    }

}
