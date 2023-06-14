package test;
import java.util.Arrays;
public class FindDuplicate {
public static void main(String[] args) {
	int []a=new int[]{1, 8, 8, 8, 8, 8, 8,9,9,9,11,11,118};
	System.out.println("Sorted elements are: ");
	for(int i=0;i<a.length;i++) {
		for (int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) {
				int temp=0;
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
		}
		System.out.print(a[i]+" ");

	}
	System.out.println();
	System.out.println("Duplicate ele are: ");
		int  count=1;
	for(int i=0;i<a.length;i=i+count) {
		count=1;
		for(int j=0;j<a.length;j++) {
			if(a[i]==a[j]&&(i!=j)) {
				count++;   
				
			}
		}
		if(count>1) {
			System.out.println("no of "+a[i]+" is "+count);

		}
	}
}
}
