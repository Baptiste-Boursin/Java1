package fr.declaration.variable;

import java.util.Scanner;

public class Moyenne {
    public static void main(String[] args) {
        float f1,f2;
        Scanner sc = new Scanner(System.in);// entrée du clavier
        System.out.println("Bienvenue");
        System.out.println("Entrer f1");
        f1 = sc.nextFloat();
        sc.nextLine();
        System.out.println("Entrer f2");
        f2 = sc.nextFloat();
        sc.nextLine();
        System.out.println((f1+f2)/2);

    }
}
