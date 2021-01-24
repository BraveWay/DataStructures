package com.braveway.search;
/**
 * ²åÖµ
 * @author YEJUN
 *
 */
public class InterpolationSearch {

	public static void main(String[] args) {
		int[] array = {1,3,4,6,7,8,12,15,17,23,24,25,67,89,99};
		int k = search(array,0,array.length-1,67);
		System.out.println(k);
	}
	
	public static int search(int[] array,int left,int right,int findVal) {
		System.out.println("-------");
		if(left > right || findVal < array[left] || findVal > array[right]) {
			return -1;
		}
		int mid=left+(findVal-array[left])/(array[right]-array[left])*(right-left);
		if(findVal == array[mid]) {
			return mid;
		}else if(findVal < array[mid]) {
			return search(array,left,mid,findVal);
		}else {
			return search(array,mid+1,right,findVal);
		}
		
	}

}
