package B1_TH_Lop_Hinh_Chu_Nhat;

public class HCN {
    double heidth;
    double wight;

    public HCN() {
    }

    public HCN(double heidth, double wight) {
        this.heidth = heidth;
        this.wight = wight;
    }
    double getArea(){
        return wight *heidth;
    }
    double getPerimeter(){
        return (wight + heidth) /2;
    }
    String disPlay(){
        return "Rectangle{" + "width=" + wight + ", height=" + heidth + "}";
    }

    @Override
    public String toString() {
        return "HCN{" +
                "heidth=" + heidth +
                ", wight=" + wight +
                '}';
    }
}
