package ncs.test5;

import java.util.Scanner;

public class CalcTest {
    public static void main(String[] args) {

        Calculate calc = new Calculate();
        Scanner scanner = new Scanner(System.in);
        System.out.println("ù��° ���� : ");
        int a = scanner.nextInt();
        if(a < 1 || a > 9){
            System.out.println("�ٽ� �Է��ϼ���.");
            return;
        }
        System.out.println("�ι�° ���� : ");
        int b = scanner.nextInt();
        if(b < 1 || b > 9){
            System.out.println("�ٽ� �Է��ϼ���.");
            return;
        }

        System.out.println(calc.sum(a, b));
        System.out.println(calc.subtract(a, b));
        System.out.println(calc.multiply(a, b));
        System.out.println(calc.divide(a, b));

    }
}
