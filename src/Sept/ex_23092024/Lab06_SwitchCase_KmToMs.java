package Sept.ex_23092024;

import java.util.Scanner;
import  java.lang.Math;

public class Lab06_SwitchCase_KmToMs {
    //Write a program that converts between different units
    // (e.g., kilometers to miles, Celsius to Fahrenheit)
    // based on user selection using a switch statement.
    //Input. -
    //choice - 1 - km → m, km → 1km
    //choice - 2 - f → c, f → c

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose unit {Km,m,F,C}");
        String unit = sc.next();

        System.out.println("Please enter unit value");
        Double unitValue = sc.nextDouble();
        sc.close();

        switch(unit)
        {
            case "km" :
                Double meterValue = unitValue * 0.621371;
                System.out.printf("%fKm --> m = %f%n",unitValue,meterValue);
                break;
            case "m":
                Double kmValue = unitValue * 1.60934;
                System.out.printf("%fm --> km = %f%n",unitValue,kmValue);
                break;
            case "F" :
                Double celsiusValue = ((unitValue*9/5)+32);
                System.out.printf("%f°F --> °C = %f%n",unitValue,celsiusValue);
                break;
            case "C":
                Double fahrenheitValue = ((unitValue*9/5)+32);
                System.out.printf("%f°C --> °F = %f%n",unitValue,fahrenheitValue);
                break;
            default: System.out.println("Your are providing wrong unit"+unit);
        }
    }

}
