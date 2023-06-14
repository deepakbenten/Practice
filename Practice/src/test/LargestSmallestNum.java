package test;

import java.util.Scanner;
public class LargestSmallestNum {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Size: ");
	int n=s.nextInt();
	System.out.println("Elements are: ");
	int a[]=new int[n];
	for(int i=0;i<a.length;i++) {
		a[i]=s.nextInt();
	}
	int largest=a[0],smallest=a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]>largest) {
			largest=a[i];
		}
		if(a[i]<smallest) {
			smallest=a[i];
		}
	}
	System.out.println("largest number is: "+largest);
	System.out.println("smallest number is: "+smallest);
}
}
