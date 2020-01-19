package 基础练习;

import java.util.Scanner;


/**
 * @author yolo
 * @date 2020/1/19-12:18
 * 问题描述
 * 　　给定一个N阶矩阵A，输出A的M次幂（M是非负整数）
 * 　　例如：
 * 　　A =
 * 　　1 2
 * 　　3 4
 * 　　A的2次幂
 * 　　7 10
 * 　　15 22
 * 输入格式
 * 　　第一行是一个正整数N、M（1<=N<=30, 0<=M<=5），表示矩阵A的阶数和要求的幂数
 * 　　接下来N行，每行N个绝对值不超过10的非负整数，描述矩阵A的值
 * 输出格式
 * 　　输出共N行，每行N个整数，表示A的M次幂所对应的矩阵。相邻的数之间用一个空格隔开
 * 样例输入
 * 2 2
 * 1 2
 * 3 4
 * 样例输出
 * 7 10
 * 15 22
 *
 * 注意：矩阵的O次方
 */
public class MainBASIC17 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int N=input.nextInt();
        int M=input.nextInt();
        int[][]A=new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <N ; j++) {
                A[i][j]=input.nextInt();
            }
        }
        int[][]result=new int[N][N];
        if(M==0){
            for (int i = 0; i <N ; i++) {
                result[i][i]=1;
            }
            printf(N, result);
        }else {
            result=A;
            while (M-->1){
                result=method(A,result);
            }
            printf(N, result);
        }
    }

    private static void printf(int n, int[][] result) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j!= n -1){
                    System.out.print(result[i][j]+" ");
                }else {
                    System.out.println(result[i][j]);
                }
            }
        }
    }

    private static int[][] method(int[][] a, int[][]b) {
        int len=a.length;
        int[][]result=new int[len][len];
        for (int i = 0; i <len ; i++) {
            for (int k = 0; k <len ; k++) {
                for (int j = 0; j <len ; j++) {
                    result[i][k]+=a[i][j]*b[j][k];
                }
            }
        }
        return result;
    }
}
