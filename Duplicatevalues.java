package com.jspider.p11;

public class Duplicatevalues {
public static void main(String[] args) {
	int[]a= {4,1,2,2,1,5,4,1};
	duplicate(a);
	
}
 public static void duplicate(int[] a) {
	 for(int i=0;i<=a.length-1;i++) {
		 int count=0;
		 for(int j=i+1;j<=a.length-1;j++) {
			 if(a[i]==a[j]) {
				 count++;
				 a[j]=-1;
			 }
			
		 } if(a[i]!=-1&&count>0) {
			  System.out.print(a[i]+" ");
		 }
	 }
 }
}
