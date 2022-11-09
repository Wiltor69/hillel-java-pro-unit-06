package hillel;

import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.println("------------------Point number two-------------");
        ThreeWords tw = new ThreeWords();
        tw.printThreeWords();

        System.out.println("-------------Point number three------------------");
        SumSing ss = new SumSing();
        ss.checkSumSing();

        System.out.println("-------------Point number four------------------");
        Color color = new Color();
        color.printColor();

        System.out.println("-------------Point number fife------------------");
        Number num = new Number();
        num.compareNumber();

        System.out.println("-------------Point number six------------------");
        Bool bl = new Bool();
        System.out.println("Write first number:");
        int a = scr.nextInt();
        System.out.println("Write second number:");
        int b = scr.nextInt();
        System.out.println(bl.verifyBool(a, b));

        System.out.println("-------------Point number seven------------------");
        NewNumber nn = new NewNumber();
        System.out.println("Write number:");
        int val = scr.nextInt();
        nn.definitionNumber(val);

        System.out.println("-------------Point number eight------------------");
        NewBoolean nb = new NewBoolean();
        System.out.println("Write number:");
        int nummer = scr.nextInt();
        System.out.println(nb.definitionBool(nummer));

        System.out.println("-------------Point number nine------------------");
        TextNumber tn = new TextNumber();
        System.out.println("Write small text:");
        String str = scr.next();
        System.out.println("Write number:");
        int amount = scr.nextInt();
        tn.amountTextNumber(str, amount);

        System.out.println("-------------Point number ten------------------");
        LeapYear lp = new LeapYear();
        System.out.println("Write year:");
        int year = scr.nextInt();
        lp.definitionLeapYear(year);
    }


}
