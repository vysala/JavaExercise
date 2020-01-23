package com.flexon.javabasics;
import java.util.*;
public class conversionusingscanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	    System.out.print("Enter a number: ");
	    double pounds= input.nextDouble();
	    input.close();
	    double kilograms=pounds*0.45;
	    System.out.println(kilograms);
	    
	}

}
