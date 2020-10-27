package fr.boucles;

public class ExerciesBouclesBase {
    public static void main(String[] args) {

        System.out.println("\nBoucle de 1 à 10\n");
        for(byte b =1;b<11;b++){
            System.out.println(b);
        }

        System.out.println("\n20 fois nom, prénom\n");
        for(byte b=0;b<20;b++){
            System.out.println(b+ "Baptiste Boursin");
        }

        System.out.println("\nPaire de 2 à 100\n");
        for(byte i =2;i<=100;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

        System.out.println("\nImpaire de 1 à 99\n");
        for(byte i =1;i<100;i++){
            if(i%2==1){
                System.out.println(i);
            }
        }

    }
}
