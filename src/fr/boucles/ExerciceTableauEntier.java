package fr.boucles;


public class ExerciceTableauEntier {
    public static void main(String[] args) {
        int[] tab = new int[10];
        System.out.println(tab.length);

        for(int i=0;i<10;i++){
            tab[i] = i+1;
            System.out.println(tab[i]);
        }

        for(int i=9;i>=0;i--){
            System.out.println("\n"+tab[i]);
        }

        System.out.println(tab[tab.length -1]);
        tab[4]=8;
        System.out.println(tab[4]);

    }

}
