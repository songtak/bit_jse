package com.jse.app;

import java.util.Scanner;

public class calculator {
       public static void main(String[] args) {
    	   System.out.println("첫번째 수 입력");
    	   Scanner scanner = new Scanner (System.in);
    	   int a = scanner.nextInt();
    	   System.out.println("두번째 수 입력");
    	   Scanner scanner2 = new Scanner (System.in);
    	   int b = scanner2.nextInt();
    	   int c = a + b;
    	   System.out.println("둘의 합은 "+ c);
	   
}
}
