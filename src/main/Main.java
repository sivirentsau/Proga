/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import milk2.Milk2;

public class Main {
public static void main(String[] args) 
{
Milk2 m[] = new Milk2[4]; 
m[0] =new Milk2(); // создание объекта с помощью конструктора по умолчанию
m[1]=new Milk2 ("Bellakt",2,true); // создание объекта с помощью конструктора с полным набором параметров
m[2]=new Milk2 ("Savushkin",false); // создание объекта с помощью конструктора с неполным набором параметров
m[3]= new Milk2 (m[0]); // создание объекта с помощью конструктора копирования

for(int i=0;i<4;i++)
    {
            m[i].print();
        }
        System.out.println("\nTotal quantity of fat: " + Milk2.quantity(m));
        System.out.println("Total quantity in stock: " + Milk2.instock(m));
}
}

