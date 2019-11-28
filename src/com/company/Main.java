package com.company;

import java.util.Arrays;



public class Main {

    public static void main(String... args) {


        print(args);
        print("Java");
        print("this", "is", "my", "string", "array");
        print("variable", "arguments", "are", "nice", "and", "useful", "feature");


        print(1,new String[]{"Java"});
        print(1, new String[]{"this", "is", "my", "string", "array"});
        print(1, new String[]{"variable", "arguments", "are", "nice", "and", "useful", "feature"});

    }

    public static void print(int x, String[] args){
        System.out.println("using String[]");
        System.out.println(args.length);
        System.out.println(Arrays.toString(args));
        ln();
    }

    public static void print(String... args){
        System.out.println("using String...");
        System.out.println(args.length);
        System.out.println(Arrays.toString(args));
        ln();
    }

    public static void ln(){
        System.out.println();

        for (int i = 0; i < 50; i++) {
            System.out.print("*");
        }

        System.out.println();

        for (int i = 0; i < 50; i++) {
            System.out.print("*");
        }

        System.out.println();

        for (int i = 0; i < 50; i++) {
            System.out.print("*");
        }

        System.out.println();

    }
}
