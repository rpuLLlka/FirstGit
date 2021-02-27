package Java.Firstitub;

import java.util.Scanner;

public class Descending {
    static class Numb {
        int numb[]; //         initializated of array
        int putloc, getloc;    // initializing indices for inserting and retrieving elements from an array

        Numb(int size) {
            numb = new int[size + 1];
            putloc = getloc = 0;
        }

        void put(int p) {
            if (putloc == numb.length - 1) {
                System.out.println("queue is full");
                return;
            }
            putloc++;
            numb[putloc] = p;
        }

        int get() {
            if (getloc == putloc) {
                System.out.println("queue is empty");
                return 0;
            }
            getloc++;
            return numb[getloc];
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int quant;
        System.out.println("Enter the number of numbers to sort of descending order:");
        if (scnr.hasNextInt()) quant = scnr.nextInt();
        else {
            System.out.println("you entered not a number!");
            return;
        }
        System.out.println("enter " + quant + " numbers one by one");
        Numb array = new Numb(quant);
        for (int i = 0; i < quant; i++) {
            if (scnr.hasNextInt()) array.put(scnr.nextInt());
            else {
                System.out.println("you entered not a number!");
                return;
            }
        }

    }
}
