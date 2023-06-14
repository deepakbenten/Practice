package test;
import java.util.*;
public class StringSort{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String: ");
	String s=sc.nextLine();
	String s1=s.toLowerCase();
	char[]ch=s1.toCharArray();
	char temp=0;
	System.out.println("Sorted characters: ");
	for(int i=0;i<ch.length;i++) {
		for(int j=i+1;j<ch.length;j++) {
			if(ch[i]>ch[j]) {
				temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
			}
		}
	}
	System.out.println(ch);
}
}
