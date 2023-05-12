package org.java.myset;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MainSet {
    public static void main(String[] args) {
        Set<Integer> numbersSet = new HashSet<>();
        Random random = new Random();

        while (numbersSet.size() < 5) {
            int randomNumber = random.nextInt(11) + 2;
            numbersSet.add(randomNumber);
        }

        System.out.println("Numeri casuali generati:");
        for (int number : numbersSet) {
            System.out.println(number);
        }
    }
}
