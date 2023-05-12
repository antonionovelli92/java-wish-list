package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> wishList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        boolean add = true;
        do {
            System.out.print("Inserisci un desiderio: ");
            String newWish = sc.nextLine();
            wishList.add(newWish);
            
            System.out.println("Lunghezza della lista dei desideri: " + wishList.size());
            
            System.out.print("Vuoi continuare ad inserire desideri? (S/N): ");
            String continua = sc.nextLine();
            add = continua.toLowerCase().equals("s");
        } while (add);
        System.out.println("Va bene, ecco la lista dei tuoi desideri:");
        for (String wish : wishList) {
            System.out.println("- " + wish);
        }
        sc.close();
   }
}
