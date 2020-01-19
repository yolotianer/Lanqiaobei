package 基础练习;

import java.util.Scanner;

/**
 * @author yolo
 * @date 2020/1/18-12:15
 */
public class MainBASIC18 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        for (int i = num1; i <num2; i++) {
            if(isPrime(i)){
                System.out.println(i+"="+i);
            }
        }
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i <n/2 ; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

}
