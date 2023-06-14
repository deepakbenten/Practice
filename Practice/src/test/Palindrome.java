package test;

public class Palindrome {
public static void main(String[] args) {
	String s="kanika";
	String rev="";
	
	for(int i=s.length()-1;i>=0;i--) {
		rev+=s.charAt(i);
	}
	if(s.equals(rev)) {
		System.out.println("palindrome");
	}
	else
		System.out.println("not palindrrome");
}
}
