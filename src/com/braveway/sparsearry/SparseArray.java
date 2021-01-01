package com.braveway.sparsearry;

/**
 * 稀疏数组 用于解决解决二维数组中大量值相同的情况 稀疏数组共有三列，第一行的第一列显示二维数组有多少行，
 * 第一行的第二列显示有多少列，第一行的第三列显示二维数组有多少非0数值的个数
 * （当然，也可以表示非1，非2，主要看哪个最多），下面展示如何将二维数组显示为稀疏数组 从第二行开始显示非0数值的位置和数组，即第几行第几列的数为多少。
 * 下面展示系数数组和二维数组的互转
 * 
 * @author Brave Way
 *
 */
public class SparseArray {

	public static void main(String[] args) {
		int[][] array = new int[6][7];
		array[0][3] = 22;
		array[0][6] = 15;
		array[1][1] = 11;
		array[1][5] = 17;
		array[2][3] = -6;
		array[3][5] = 39;
		array[4][0] = 91;
		array[2][5] = 28;

		System.out.println("原二维数组：");
		for (int i = 0; i < array.length; i++) {
			int[] arrTmp = array[i];
			for (int j = 0; j < arrTmp.length; j++) {
				System.out.printf("%d\t", arrTmp[j]);
			}
			System.out.println();
		}
		
		//将二维数组转为稀疏数组
		int rowNum = array.length;  //二维数组行数
		int colNum = 0;  //二维数组列数
		if(rowNum > 0 ) {
			colNum = array[0].length;
		}
		
		int[][] sparseArray = {};
		int count = 0;
		
		for(int i=0;i<rowNum;i++) {
			for(int j=0;j<colNum;j++) {
				if(array[i][j] != 0) {
					count ++;
				}
			}
		}
		
		sparseArray = new int[count+1][3];
		sparseArray[0][0] = rowNum;
		sparseArray[0][1] = colNum;
		sparseArray[0][2] = count;;
		
		int index = 0;
		for(int i=0;i<rowNum;i++) {
			for(int j=0;j<colNum;j++) {
				if(array[i][j] != 0) {
					index ++;
					sparseArray[index][0] = i;
					sparseArray[index][1] = j;
					sparseArray[index][2] = array[i][j];
				}
			}
		}
		
		
		
		System.out.println("转换后的稀疏数组为：");
		for (int i = 0; i < sparseArray.length; i++) {
			int[] arrTmp = sparseArray[i];
			for (int j = 0; j < arrTmp.length; j++) {
				System.out.printf("%d\t", arrTmp[j]);
			}
			System.out.println();
		}
		
		//将系数数组转换为二维数组
		int rowNumTmp = sparseArray[0][0];
		int colNumTmp = sparseArray[0][1];
		int[][] arrayTmp = new int[rowNumTmp][colNumTmp];
		for(int i=1;i<sparseArray.length;i++) {
			arrayTmp[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
		}
		
		System.out.println("转换后的二维数组：");
		for (int i = 0; i < arrayTmp.length; i++) {
			int[] arrTmp = array[i];
			for (int j = 0; j < arrTmp.length; j++) {
				System.out.printf("%d\t", arrTmp[j]);
			}
			System.out.println();
		}
		
	}
}
