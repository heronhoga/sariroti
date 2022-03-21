package com.example;

import java.util.Scanner;

public class Tugas2java_Kel35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Update percobaan lewat git");

        String[][] outfit = {{"Crewneck","Hoodie","Kemeja"},{"Chino","Jeans","Cargo"}};
        System.out.println("PROGRAM PILIH OUTFIT");
        System.out.println("=====Pilih Bajumu=====");
        for (int i=0; i<3; i++){
            System.out.println(i+": "+outfit[0][i]);
        }
        System.out.print("Pilih Bajumu 0-2: ");
        int x = sc.nextInt();
        System.out.println("Pilihan Bajumu: "+outfit[0][x]);

        System.out.println("\n=====Pilih Celanamu=====");
        for (int i=0; i<3; i++){
            System.out.println(i+": "+outfit[1][i]);
        }
        System.out.print("Pilih Celanamu 0-2: ");
        int y = sc.nextInt();
        System.out.println("Pilihan Celanamu: "+outfit[1][y]);

        System.out.println("Pilihan Outfitmu: "+outfit[0][x]+", "+outfit[1][y]);
    }
}
