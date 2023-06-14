package test;

public class MaxSubarrayLen {
	public static void main(String[] args) {
		
		int nums1[]= {1,2,3,2,1};
		int nums2[]= {3,2,1,4,7};
	        int m = nums1.length;
	        int n = nums2.length;
	    
	        
	        int[][] dp = new int[m + 1][n + 1];
	        int max = 0;

	        for (int i = m - 1; i >= 0; i--) {
	            for (int j = n - 1; j >= 0; j--) {
	                if (nums1[i] == nums2[j]) {
	                    dp[i][j] = dp[i+1][j+1] + 1;
						max = Math.max(max, dp[i][j]);
	                }
	            }
	        }
	      System.out.println("length: "+max);
	
}
}
