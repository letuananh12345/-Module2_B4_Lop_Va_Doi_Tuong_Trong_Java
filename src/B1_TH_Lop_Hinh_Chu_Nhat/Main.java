package B1_TH_Lop_Hinh_Chu_Nhat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập chiều cao :");
        double height = sc.nextDouble();
        System.out.println("Nhập chiều rộng :");
        double weidth = sc.nextDouble();
        HCN hcn = new HCN(weidth, height);
        System.out.println(hcn.toString());
        System.out.println(" diện tích hình chữ nhật là " + hcn.getArea());
        System.out.println(" diện tích hình chữ nhật là " + hcn.getPerimeter());


        hcn.disPlay();
    }

}
