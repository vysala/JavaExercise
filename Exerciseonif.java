package com.flexon.javabasics;

public class Exerciseonif {

 public static void main(String[] args) {
		// TODO Auto-generated method stub
  
   double a=20, b=80, sum=0,rem=0;
   sum= (a+b)*25;
   System.out.println(sum);
   rem=sum%40;
   System.out.println(rem);
   if(rem<=20)
  	   System.out.println("Total was over the limit");
   else
	   System.out.println("Total is not over the limit");
	}

}
