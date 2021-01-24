package com.braveway.search;
/**
 * ¶þ·Ö²éÕÒ
 * @author YEJUN
 *
 */
public class BinarySearch {

	public static void main(String[] args) {
		int[] array = {1,3,4,6,7,8,12,15,17,23,24,25,67,89,99};
		int k = search(array,0,array.length-1,16);
		System.out.println(k);
	}
	
	public static int search(int[] array,int left,int right,int findVal) {
		System.out.println("-------");
		if(left > right || findVal < array[left] || findVal > array[right]) {
			return -1;
		}
		int mid = (left + right)/2;
		if(findVal == array[mid]) {
			return mid;
		}else if(findVal < array[mid]) {
			return search(array,left,mid,findVal);
		}else {
			return search(array,mid+1,right,findVal);
		}
		
	}

}
