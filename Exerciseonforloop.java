package com.flexon.javabasics;

import java.util.Scanner;
import java.lang.Exception;
public class Exerciseonforloop {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		double sum=0;
		Scanner input = new Scanner(System.in);
	    System.out.print("Enter the first number(lower range): ");
	    int firstnumber= input.nextInt();
	    System.out.print("Enter the second number(upper range): ");
	    int secondnumber= input.nextInt();
	    input.close();
	    if(firstnumber>secondnumber){
	    throw new Exception("The first number should be less than second number");
	  	    }
	    System. out. println("The Odd Numbers are:");
	    for (int i = firstnumber+1; i <=secondnumber-1 ; i++) {
	    if (i % 2 != 0) {
	    	System.out.println(i);
	    	sum=sum+i;
	   	    }
	    }
	    System. out. println("The even Numbers are:");
	    for (int j = firstnumber+1; j <=secondnumber-1 ; j++) {
		    if (j % 2 == 0){
		    	System.out.println(j);	
		    	sum=sum+j;
		    }
	       }
	    System.out.println("Adding up the even and odd numbers: " +sum);
		
		}
	
	
	}

	    


