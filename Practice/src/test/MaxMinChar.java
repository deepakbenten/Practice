package test;
import java.util.Scanner;
public class MaxMinChar{
public static void main(String[] args) {  
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String: ");
    String str = sc.nextLine();    
    int[] freq = new int[str.length()];    
    char minChar = str.charAt(0), maxChar = str.charAt(0);    
    int min, max;             
    char ch[] = str.toCharArray();        
    for(int i = 0; i <ch.length; i++) {    
        freq[i] = 1;    
        for(int j = i+1; j < ch.length; j++) {    
            if(ch[i] == ch[j] &&ch[i] != ' ' &&ch[i] != '0') {    
                freq[i]++;    
      
                ch[j] = '0';    
            }    
        }    
    }    
    
    min = max = freq[0];    
    for(int i = 0; i <freq.length; i++) {    
      if(min > freq[i] && freq[i] != '0') {    
            min = freq[i];    
            minChar = ch[i];    
        }    
         if(max < freq[i]) {    
            max = freq[i];    
            maxChar = ch[i];    
        }    
    }    
        
    System.out.println("Minimum occurring character: " + minChar);    
    System.out.println("Maximum occurring character: " + maxChar);    
}    
}