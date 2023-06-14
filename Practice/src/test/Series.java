package test;
import java.util.*;
public class Series {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String: ");
	String input=sc.nextLine();
	
	String output="";
	
	for(int i=0;i<input.length();i=i+2){
		char ch=input.charAt(i);
		int num=((int)input.charAt(i+1))-48;
		while(num-->0) {
			output+=ch;
		}
	}
	System.out.println("Ans:"+output);
}
}
