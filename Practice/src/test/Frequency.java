package test;
import java.util.*;
public class Frequency {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size: ");
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
		}
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) {
				int temp=0;
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	int c=1;
	for(int i=0;i<a.length;i=i+c) {
		c=1;
		for(int j=0;j<a.length;j++) {
			if(a[i]==a[j]&&i!=j) {
				c++;
			}
		}
		System.out.println("no. of "+a[i]+" is: "+c);	
	}
	
}
}
