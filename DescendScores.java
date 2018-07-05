package Bubblesort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @File_Name:DescendScores.java
 * @Author:钟禄寿
 * @Date:2018-7-4
 * @Time:下午3:15:24
 */
//冒泡排序键盘输入的5名学员成绩
public class DescendScores {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] scores=new int[5];
		System.out.println("请输入5名学员的成绩：");
		for(int i=0;i<scores.length;i++){
			scores[i]=input.nextInt();
		}
		System.out.println("数组排序前是："+Arrays.toString(scores));
		//对数组进行降序排序
		for(int i=0;i<scores.length-1;i++){
			for(int j=0;j<scores.length-1-i;j++){
				if(scores[j]<scores[j+1]){
					int t=scores[j];
					scores[j]=scores[j+1];
					scores[j+1]=t;
				}
			}
		}
		System.out.print("降序排序后是："+Arrays.toString(scores));
	}
}
