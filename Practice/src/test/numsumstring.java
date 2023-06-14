package test;

public class numsumstring {
	 
public static void main(String[] args) {
	String s="3b6cdd1";
	
	int sum=0;
	String temp="0";
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(Character.isDigit(ch)) 
			temp+=ch;
	        sum+=Integer.parseInt(temp);
			temp="0";
	}
	System.out.println("result: "+sum);
	/*for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
	if(ch>='0' && ch<='9') {
		sum+=(ch-'0');
}
}
	System.out.println("result:"+sum);
}*/}}
