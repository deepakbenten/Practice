package test;
import java.util.*;
public class FrequencyOfChar {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String:");
	String s=sc.nextLine();
	String s1=s.toLowerCase();
	char ch[]=new char[s1.length()];
	int freq=1;
	for(int i=0;i<s1.length();i++) {
		ch[i]=s1.charAt(i);
	}
	
	System.out.println("Sorted characters: ");
	for(int i=0;i<ch.length;i++) {
		for(int j=i+1;j<ch.length;j++) {
			if(ch[i]>ch[j]) {
				char temp=0;
				temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
			}
		}
		}
	
	for(int i=0;i<ch.length;i=i+freq) {
		freq=1;
		for(int j=0;j<ch.length;j++) {
			if((ch[i]==ch[j])&&i!=j) {
				freq++;
			}
		}
		System.out.println(ch[i]+"-->"+freq);
	}
	
	
}
}
