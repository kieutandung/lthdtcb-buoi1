import java.util.Scanner;

public class th2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng tiền cho vay: ");
        double tienVay = sc.nextDouble();

        System.out.print("Nhập tỉ lệ lãi suất theo tháng (%): ");
        double laiSuat = sc.nextDouble();

        System.out.print("Nhập số tháng cho vay: ");
        int soThang = sc.nextInt();

        double tongTien = tinhTienLai(tienVay, laiSuat, soThang);
        System.out.printf("Tổng số tiền có được khi hết thời hạn cho vay là: %.2f", tongTien);

        sc.close();
    }

    public static double tinhTienLai(double tienVay, double laiSuat, int soThang) {
        for (int thang = 1; thang <= soThang; thang++) {
            double tienLai = tienVay * (laiSuat / 100);
            tienVay += tienLai;
        }
        return tienVay;
    }
}
