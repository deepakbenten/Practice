package test;

public class SecLargest {

	public static void main(String[] args) {
		int arr[]={8,6,12,4,2,11,7};	
		int l=arr.length;
		System.out.print("Sorted array is: ");
		for(int i=0;i<l;i++) {
			for(int j=i+1;j<l;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
			System.out.print(" "+arr[i]);
		}
		System.out.println();
			System.out.println("Second largest number is: "+arr[l-2]);	
		}
}
