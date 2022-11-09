package hillel;

import java.util.Scanner;

public class Number {

    public  void compareNumber(){
        Scanner scr = new Scanner(System.in);
        System.out.println("Write first number:");
        int a = scr.nextInt();
        System.out.println("Write second number:");
        int b = scr.nextInt();

        if(a >= b) {
            System.out.println("a >= b");
        }else
        System.out.println("a < b");
    }
}
