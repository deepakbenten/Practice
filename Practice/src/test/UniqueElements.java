package test;

import java.util.Scanner;

public class UniqueElements {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int a[]=new int[n];
	for(int i=0;i<a.length;i++) {
		a[i]=s.nextInt();
	}
	
	for(int i=0;i<a.length;i++) {
		int j;
		for(j=0;j<a.length;j++) {
			if(a[i]==a[j]) 
			break;
		}
		if(i==j) {
			System.out.println(a[i]+" ");
		}
	}
}
}
