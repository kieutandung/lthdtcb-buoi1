import java.util.Scanner;

public class th4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("nhập năm cần kiểm tra:");
        int year = input.nextInt();
        if (year % 4 == 0 && year % 100 != 0 && year % 400 == 0){
            System.out.println(year +" là năm nhuận");
                }
        else {
            System.out.println(year + " là năm không nhuận");
            }
        }
    }

