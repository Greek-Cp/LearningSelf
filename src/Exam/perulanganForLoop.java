package Exam;

import java.util.Scanner;

public class perulanganForLoop {
    public static void main(String[]args){


        int angka_ganjil_1 = 1;
        int angka_genap_2 = 2;


        for(int height = 0; height <= 10; height++){
            for(int kolom = 0; kolom <= height; kolom++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
