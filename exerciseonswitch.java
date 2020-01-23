package com.flexon.javabasics;

import java.util.Scanner;

public class exerciseonswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner input = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
	    System.out.print("Enter a character: ");
	    char day= input.findInLine(".").charAt(0);
	    input.close();
	    switch(day){
	    case 'A':
	    case 'a':
	    	System.out.println("Apple");
	    	break;
	    case 'B':
	    case 'b':
	    	System.out.println("Banana");
	    	break;	
	    case 'C':
	    case 'c':
	    	System.out.println("Cherries");
	    	break;	
	    case 'D':
	    case 'd':
	      	System.out.println("Dragon Fruit");
	    	break;	
	    case 'E':
	    case 'e':
	    	System.out.println("Elder Berry");
	    	break;
	    default:
	    	System.out.println("Not in fruit basket");
	    	break;
	      }
	}

}
