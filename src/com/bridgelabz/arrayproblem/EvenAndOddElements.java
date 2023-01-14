package com.bridgelabz.arrayproblem;
import java.util.Scanner;
public class EvenAndOddElements {

	public static void main(String[] args) {
    Scanner numbers = new Scanner(System.in);
    System.out.println("enter size of array:");
     
    int size = numbers.nextInt();
    int Numbers_Array[] = new int[size];
    System.out.println("enter "+size+" elements of array");
    int max = Numbers_Array[0];
    for(int i = 0;i<size;i++) {
    	Numbers_Array[i] = numbers.nextInt();
    }for(int i = 0;i<Numbers_Array.length;i++) {
    	if(max<Numbers_Array[i]) {
    		max = Numbers_Array[i];
    	}
    }    int min = Numbers_Array[0];

    for(int j = 0;j<Numbers_Array.length;j++) {
    	if(min>Numbers_Array[j]) {
    		min = Numbers_Array[j];
    	}
    }System.out.println(max+" is largest number in array:");
     System.out.println(min+" is smallest number in array:");

	}

}
