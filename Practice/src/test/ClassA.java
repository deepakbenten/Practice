package test;

public class ClassA {
	public static void main(String[] args) {
		String s="my name is deepak kumar";
		String res="";
		String[] str=s.split(" ");
		for(String word : str) {
			String temp="";
			for(int i=0; i<word.length(); i++) {
				 if(i==0) {
					 temp+=(word.charAt(i)+"").toUpperCase();
				}else {
					temp+=(word.charAt(i)+"").toLowerCase();
				}
				
			}
			res+=temp+" ";
		}
		System.out.println(res);
	}
}
