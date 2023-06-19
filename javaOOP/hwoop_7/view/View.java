package view;

import java.util.Scanner;

import model.ComplexNumber;

public class View {
    Scanner in = new Scanner(System.in);

    public double getValue(String title) {
        System.out.printf("%s", title);
        return in.nextDouble();
    }

    public void print(ComplexNumber number, String str) {
        //System.out.printf("%s %d\n", title, number);
        if (number.getImage() >= 0) {
            System.out.println("\n" + str + number.getReal() + " + " + number.getImage() + "i");
        } else {
            System.out.println("\n" + str + number.getReal() + " - " + Math.abs(number.getImage()) + "i");
        }

    }
}
