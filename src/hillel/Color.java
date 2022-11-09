package hillel;

import java.util.Scanner;

public class Color {
    public void printColor(){

        Scanner scr = new Scanner(System.in);
        System.out.println("Write number:");
        int value = scr.nextInt();

        if(value <= 0){
            System.out.println("Red");
        } else if (value > 0 && value <= 100){
            System.out.println("Yellow");
        }else
            System.out.println("Green");

    }
}
