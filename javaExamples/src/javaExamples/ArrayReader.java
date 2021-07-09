package javaExamples;

import java.util.Scanner;

public class ArrayReader {
   
	public static void main(String[] args) {
    	Scanner scnr = new Scanner(System.in);
    	float prices[] = new float[5];
    	
    for(int index = 0; index<prices.length;index++) {
    	System.out.println(prices[index]);
    }
    	
    	for(int index = 0; index<prices.length;index++) {
    		System.out.println("enter value of prices["+ index + "]");   
    }
    	
    	for(int index = 0; index<prices.length;index++) {
    		System.out.println(prices[index]);
}
    	
    	scnr.close();
	}
}