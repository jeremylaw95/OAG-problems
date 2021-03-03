package com.jeremy.Hello;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(helloName());
        System.out.println(sum(2,4));
        System.out.println(reverse("The quick brown fox"));
        System.out.println(inputProduct());
    }

    public static String helloName() {
        return "Hello\nJeremy Law";
    }

    public static int sum(int a, int b) {
        return(a + b);
    }

    public static String reverse(String str) {
        String[] str2 = str.split("");
        String result = "";
        for(int i=str2.length-1;i>=0;i--){
            result += str2[i];
        }
        return result;
    }

    public static String inputProduct() {
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input1.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter second number: ");
        int num2 = input2.nextInt();
        return (String.format("%d x %d = ",num1,num2) + num1 * num2);
    }

}

