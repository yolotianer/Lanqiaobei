package 基础练习;

import java.util.Scanner;

/**
 * @author yolo
 * @date 2020/1/22-11:11
 * 问题描述
 * 　　回文串，是一种特殊的字符串，它从左往右读和从右往左读是一样的。小龙龙认为回文串才是完美的。现在给你一个串，它不一定是回文的，请你计算最少的交换次数使得该串变成一个完美的回文串。
 * 　　交换的定义是：交换两个相邻的字符
 * 　　例如mamad
 * 　　第一次交换 ad : mamda
 * 　　第二次交换 md : madma
 * 　　第三次交换 ma : madam (回文！完美！)
 * 输入格式
 * 　　第一行是一个整数N，表示接下来的字符串的长度(N <= 8000)
 * 　　第二行是一个字符串，长度为N.只包含小写字母
 * 输出格式
 * 　　如果可能，输出最少的交换次数。
 * 　　否则输出Impossible
 * 样例输入
 * 5
 * mamad
 * 样例输出
 * 3
 */
public class MainBASIC19 {
    public static void main(String[] args) {
        // TODO 自动生成的方法存根
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String s = input.next();
        char[] cs = s.toCharArray();
        boolean flag = false;//如果n是基数，用flag判断找到了一个单个字的

        int count = 0;
        int end = n-1;
        //从0到倒数第二遍历，再倒着找一样的
        for(int i = 0; i < n - 1 ; i++ ) {
            for (int j = end; j > i; j--) {

                if (j==i) {
                    //没找到
                    if (n % 2 == 0 || flag) {//不存在的两种情况
                        System.out.println("Impossible");
                        System.exit(0);
                    }
                    else {
                        //把这个字符放到中间去
                        flag = true;
                        char tmp = cs[i];
                        cs[i] = cs[n/2];
                        cs[n/2] = tmp;
                        count += n / 2 - i;
                        break;
                    }
                }

                else if (cs[i] == cs[j]) {
                    for (int k = j; k < end; k++) {
                        char tmp = cs[k];
                        cs[k] = cs[k+1];
                        cs[k+1] = tmp;
                        count++;
                    }
                    end--;
                    break;
                }
            }
        }
        if (isHuiWen(cs)) {
            System.out.println(count);
        }
        else {
            System.out.println("Impossible");
        }
    }
    public static boolean isHuiWen(char[] s) {
        String a = String.valueOf(s);
        String b = new StringBuffer(a).reverse().toString();
        return a.equals(b);
    }
}
