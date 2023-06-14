package test;

public class ComputeString {
public static void main(String[] args) {
	String s="1,2,3,-3,7,*10,/5";
	String[] str=s.split(",");
	int ans=0;
	
	for(int i=0;i<str.length;i++) {
		char sign=str[i].charAt(0);
		if((sign>48 && sign<57) && sign!='-' && sign !='*' && sign!='/') {
			sign='+';
		}
		if(sign=='*') {
			ans *= Integer.parseInt(str[i].substring(1));
		}
		else if(sign=='/') {
			ans /= Integer.parseInt(str[i].substring(1));
		}
		
		else {
			ans +=Integer.parseInt(str[i]);
		}
	
	}
	System.out.println(ans);
	
}
}
