package test;

import java.util.Scanner;

public class RemoveDuplicateCharcter {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
    s=s.toLowerCase();
    char []ch=s.toCharArray();
    char temp=0;
  
        for(int i=0;i<ch.length;i++) {
    	for(int j=i+1;j<ch.length;j++) {
			if(ch[i]>ch[j]) {
				temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
			}
		}} 
        for(int i=0;i<ch.length;i++) {
        	for(int j=i+1;j<ch.length;j++) {
    			if(ch[i]==ch[j]) {
    				ch[i]='0';
    			}
    		}
        	}
       for(int i=0;i<ch.length;i++) { 
    	   if(ch[i]!='0')
       System.out.print(ch[i]);
       }
        
	}    
}
