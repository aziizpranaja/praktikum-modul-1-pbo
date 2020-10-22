package com.tutorial;

import java.util.Scanner;

public class input
{
    double angka;
    Scanner scan = new Scanner(System.in);

    input()
    {
        System.out.print("Masukkan Angka : ");
        angka=scan.nextInt();
    }    
    void Angka()
    {
        if(angka % 2 == 0){
        System.out.println(angka + " adalah bilangan genap");
            if (angka < 0)
            System.out.println(angka + " adalah bilangan genap negative");
            else
            System.out.println(angka + " adalah bilangan genap positive");
        }
        else{
        System.out.println(angka + " adalah bilangan ganjil");
        if (angka < 0)
            System.out.println(angka + " adalah bilangan ganjil negative");
            else
            System.out.println(angka + " adalah bilangan ganjil positive");
        }

    }   
 }