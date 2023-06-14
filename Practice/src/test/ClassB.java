package test;

import java.util.Scanner;

public class ClassB
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the no :");	
		int n=sc.nextInt();
		int a[]=new int[n];
		int high=a[0];
		int low=a[0];
		System.out.println("enter the element : ");
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0; i<a.length; i++) {
			if(a[i]>high) {
				high=a[i];
			}if(a[i]<low) {
				low=a[i];
			}
		}
		System.out.println("high no :"+high);
		System.out.println("low no :"+low);
	}

}
