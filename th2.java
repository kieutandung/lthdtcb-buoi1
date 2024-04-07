import java.util.Scanner;

public class th2 {
    public static void main(String[] args) {
        float chieudai;
        float chieucao;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập chiều dài");
        chieudai= scanner.nextFloat();
        System.out.println("nhập chiều cao");
        chieucao= scanner.nextFloat();
        float area = chieucao * chieudai;
        System.out.println("area là:" + area);
    }
}
