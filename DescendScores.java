package Bubblesort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @File_Name:DescendScores.java
 * @Author:��»��
 * @Date:2018-7-4
 * @Time:����3:15:24
 */
//ð��������������5��ѧԱ�ɼ�
public class DescendScores {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] scores=new int[5];
		System.out.println("������5��ѧԱ�ĳɼ���");
		for(int i=0;i<scores.length;i++){
			scores[i]=input.nextInt();
		}
		System.out.println("��������ǰ�ǣ�"+Arrays.toString(scores));
		//��������н�������
		for(int i=0;i<scores.length-1;i++){
			for(int j=0;j<scores.length-1-i;j++){
				if(scores[j]<scores[j+1]){
					int t=scores[j];
					scores[j]=scores[j+1];
					scores[j+1]=t;
				}
			}
		}
		System.out.print("����������ǣ�"+Arrays.toString(scores));
	}
}
