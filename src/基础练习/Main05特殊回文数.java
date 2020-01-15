package 基础练习;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author yolo
 * @date 2020/1/15-13:37
 */
public class Main05特殊回文数 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        List<Integer>result=new ArrayList<>();
        int temp=0,sum=0;
        String s="";
        for (int i = 10000; i < 999999; i++) {
            temp=i;
            s="";
            sum=0;
            while (temp>0){
                sum+=temp%10;
                s+=temp%10;
                temp/=10;
            }
            if(sum==n){
                if(isPalindrom(s)){
                    result.add(i);
                }
            }
        }
        for (Integer integer : result) {
            System.out.println(integer);
        }
    }

    private static boolean isPalindrom(String s) {
        int len=s.length();
        for (int index = 0; index <= len/2-1; index++) {
            if(s.charAt(index)!=s.charAt(len-index-1)){
                return false;
            }
        }
        return true;
    }
}
