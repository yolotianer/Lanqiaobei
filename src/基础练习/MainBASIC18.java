package 基础练习;

import java.util.Scanner;

/**
 * @author yolo
 * @date 2020/1/19-13:46
 * 矩形面积
 * 问题描述
 * 　　平面上有两个矩形，它们的边平行于直角坐标系的X轴或Y轴。对于每个矩形，我们给出它的一对相对顶点的坐标，请你编程算出两个矩形的交的面积。
 * 输入格式
 * 　　输入仅包含两行，每行描述一个矩形。
 * 　　在每行中，给出矩形的一对相对顶点的坐标，每个点的坐标都用两个绝对值不超过10^7的实数表示。
 * 输出格式
 * 　　输出仅包含一个实数，为交的面积，保留到小数后两位。
 * 样例输入
 * 1 1 3 3
 * 2 2 4 4
 * 样例输出
 * 1.00
 */
public class MainBASIC18 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double x1=input.nextDouble(),y1=input.nextDouble(),x2=input.nextDouble(),y2=input.nextDouble();
        double x3=input.nextDouble(),y3=input.nextDouble(),x4=input.nextDouble(),y4=input.nextDouble();
        double maxX1=Math.max(x1,x2);
        double minX1=Math.min(x1,x2);
        double maxY1=Math.max(y1,y2);
        double minY1=Math.max(y1,y2);

        double maxX2=Math.max(x3,x4);
        double minX2=Math.min(x3,x4);
        double maxY2=Math.max(y3,y4);
        double minY2=Math.min(y3,y4);

        if(minX2>maxX1||minX1>maxX2||maxY1<minY2||minY1>maxY2){
            System.out.println("0.00");
        }else {
            double length=Math.abs(minX2-maxX1);
            double hight=Math.abs(minY2-maxY1);

            System.out.printf("%.2f",length*hight);
        }
    }
}
//38937745994.07
//312660026120.76