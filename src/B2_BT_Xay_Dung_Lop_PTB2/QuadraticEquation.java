package B2_BT_Xay_Dung_Lop_PTB2;

import java.util.Scanner;

public class QuadraticEquation {
    private int a, b, c;


    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        return (-b + Math.pow(getDiscriminant(),0.5)) / (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.pow(getDiscriminant(),0.5)) / (2 * a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a :");
        int a= sc.nextInt();
        System.out.println("Nhập số b :");
        int b = sc.nextInt();
        System.out.println("Nhập số c :");
        int c = sc.nextInt();
        QuadraticEquation qe=new QuadraticEquation(a,b,c);
        if(qe.getDiscriminant() >0){
            System.out.println(" phương trình có 2 nghiệm: x1: " + qe.getRoot1()+ " và x2: "+ qe.getRoot2());
        }else if (qe.getDiscriminant() ==0){
            System.out.println(" phương trình có nghiệm : " + (-b/2*a) );
        }else {
            System.out.println("phương trình vô nghiệm ");
        }
    }
}
