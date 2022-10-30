package com.amey;
// . is for sub packages 

// javac -d . *.java is to consider all the packages for the java files with the package name 

public class AmeyC {
        public int x = 5;
     protected int y = 45;
     int z = 6;
     private int a = 34;
//refer the access modifier table.
    public void method1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
        public static void main(String[] args) {
                System.out.println("I am a class from amey main method.");
        }
}
