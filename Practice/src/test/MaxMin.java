package test;
import java.util.Scanner;
public class MaxMin {
	public void find() {
		int max,min;
		
	    Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the number of elements:");
		int num= sc.nextInt();
		int arr[]=new int[num];
		 
		System.out.println("Enter the elements");
		 for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
	    }
	    int temp=0;
		for(int i=0;i<arr.length;i++) {
		 for(int j=0;j<arr.length;j++) {
		  if(arr[i]<arr[j]) {
					 temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
				    }
			}
			 
		 }
		 System.out.println("sorted  elements");
			 for(int i=0;i<arr.length;i++) {
			 System.out.print(arr[i]+" ");
			 }	
	     System.out.println();
	     System.out.println("Max: "+arr[arr.length-1]);
         System.out.println("Min: "+arr[0]); 
			 
	   }

	 public static void main(String[] args) {
		new MaxMin().find();

	}

}
