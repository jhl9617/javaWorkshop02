package ncs.test8;

import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Product product = new Product();
        System.out.println("��ǰ�� : ");
        product.setName(scanner.next());
        System.out.println("���� : ");
        product.setPrice(scanner.nextInt());
        System.out.println("���� : ");
        product.setQuantity(scanner.nextInt());
        System.out.println(product.information());



    }
}
