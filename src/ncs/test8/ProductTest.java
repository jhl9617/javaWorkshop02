package ncs.test8;

import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Product product = new Product();
        System.out.println("상품명 : ");
        product.setName(scanner.next());
        System.out.println("가격 : ");
        product.setPrice(scanner.nextInt());
        System.out.println("수량 : ");
        product.setQuantity(scanner.nextInt());
        System.out.println(product.information());



    }
}
