package practicearray;

import java.util.*;

public class Array {
	 static int search(int[]a,int l, int x) {
		for(int i=0; i<l; i++) {
			if(a[i]  == x ) {
				return i;
			}
			
		}
		return -1;
	}
	
//	static int recsearch(int[]a,int l, int x){
//		
//		if()
//		
//		return recsearch(a,  l, x);
//	}
	 static int large(int[] arr) {
		 int max = arr[0];
		 
		 for(int i=1; i<arr.length; i++) {
			 if(arr[i] > max ) {
				 max = arr[i];
			 }
			 
		 }
		 return max;
	 }
	 
	 static void bigThree(int[] array) {
		 
		 Arrays.sort(array);
		 int c=0,cnt=1;int n=array.length;
		 
		 for(int i=0; i<=n; i++ ) {
			 
		 }
		 
		 
	 }
	public static void main(String[] args) {
		int[] a = {10,20,30,140,50,60};
		int len = a.length;
		int x=50;
		
		//int index = search(a, len, x);
		//int index = recsearch(a, len, x);
		//int lar=large( a);
		//System.out.print(lar);
		
		int lar=large( a);
		System.out.print(lar);
		
		//System.out.print("The element is at "+ index +" index");
	}
}

