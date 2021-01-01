package com.braveway.sparsearry;

/**
 * ϡ������ ���ڽ�������ά�����д���ֵ��ͬ����� ϡ�����鹲�����У���һ�еĵ�һ����ʾ��ά�����ж����У�
 * ��һ�еĵڶ�����ʾ�ж����У���һ�еĵ�������ʾ��ά�����ж��ٷ�0��ֵ�ĸ���
 * ����Ȼ��Ҳ���Ա�ʾ��1����2����Ҫ���ĸ���ࣩ������չʾ��ν���ά������ʾΪϡ������ �ӵڶ��п�ʼ��ʾ��0��ֵ��λ�ú����飬���ڼ��еڼ��е���Ϊ���١�
 * ����չʾϵ������Ͷ�ά����Ļ�ת
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

		System.out.println("ԭ��ά���飺");
		for (int i = 0; i < array.length; i++) {
			int[] arrTmp = array[i];
			for (int j = 0; j < arrTmp.length; j++) {
				System.out.printf("%d\t", arrTmp[j]);
			}
			System.out.println();
		}
		
		//����ά����תΪϡ������
		int rowNum = array.length;  //��ά��������
		int colNum = 0;  //��ά��������
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
		
		
		
		System.out.println("ת�����ϡ������Ϊ��");
		for (int i = 0; i < sparseArray.length; i++) {
			int[] arrTmp = sparseArray[i];
			for (int j = 0; j < arrTmp.length; j++) {
				System.out.printf("%d\t", arrTmp[j]);
			}
			System.out.println();
		}
		
		//��ϵ������ת��Ϊ��ά����
		int rowNumTmp = sparseArray[0][0];
		int colNumTmp = sparseArray[0][1];
		int[][] arrayTmp = new int[rowNumTmp][colNumTmp];
		for(int i=1;i<sparseArray.length;i++) {
			arrayTmp[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
		}
		
		System.out.println("ת����Ķ�ά���飺");
		for (int i = 0; i < arrayTmp.length; i++) {
			int[] arrTmp = array[i];
			for (int j = 0; j < arrTmp.length; j++) {
				System.out.printf("%d\t", arrTmp[j]);
			}
			System.out.println();
		}
		
	}
}
