package test;
import java.util.*;
public class RemoveDuplicateElement{
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter no of elements: ");
	int n=s.nextInt();
	System.out.println("Input elements: ");
	int a[]=new int[n];
	for(int i=0;i<a.length;i++) {
		a[i]=s.nextInt();
	}
	for(int i=0;i<a.length;i++){
        for(int j=i+1;j<a.length;j++){
            if(a[i]==a[j]){
                a[i]='0';
            }
        }
    }
   for(int i=0;i<a.length;i++){
       if(a[i]!='0'){
       System.out.println(a[i]+" ");
   }}
} 

}


