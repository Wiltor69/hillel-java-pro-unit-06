package hillel;

import java.util.Scanner;

public class SumSing {
    public void checkSumSing(){
        Scanner scr = new Scanner(System.in);
        System.out.println("Write first number:");
        int a = scr.nextInt();
        System.out.println("Write second number:");
        int b = scr.nextInt();
        if ((a + b) >= 0){
            System.out.println("The sum " + a + " + " + b + " is positive");
        } else
            System.out.println("The sum " + a + " + " + b + " is negative");
    }
}
