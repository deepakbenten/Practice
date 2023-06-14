package test;
import java.util.*;
public class DuplicateChar {
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
 
  System.out.println("Enter String1: ");
  String s=sc.nextLine();
  int count; 
  System.out.println("Enter String2: ");
  String s1=sc.nextLine();
  String s2=s+s1;
  char str[]=s2.toCharArray();
  for(int i=0;i<str.length;i++) {
	  count=1;
	  for(int j=i+1;j<str.length;j++) {
		  if(str[i]==str[j]&&str[i]!=' ') { 
			  count++;
			  str[j]='0';
		  }
	  }
	  if(count>1&&str[i]!='0') {
		  System.out.println(str[i]);
	  }
  }
  /*char string[]=s.toCharArray();
  for(int i=0;i<string.length;i++) {
	  count=1;
	  for(int j=i+1;j<string.length;j++) {
		  if(string[i]==string[j]&&string[i]!=' ') {
			  count++;
			  string[j]='0';
		  }
	  }
	  if(count>1&&string[i]!='0') {
		  System.out.println(string[i]);
	  }
  }*/
  
}
}
