package com.github.otusHW.homework.HW.task1;

import java.util.Base64;
import java.util.Scanner;


public class test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String fullName = sc.nextLine();
        String encodedFullName = Base64.getEncoder().encodeToString(fullName.getBytes());
        System.out.println("RESULT: " + encodedFullName);


    }
}
