package ncs.test9;

import java.util.Scanner;

public class BookUpdate {

    Scanner scanner = new Scanner(System.in);
    public BookUpdate() {}
    public BookUpdate(Book book) {

    }

    public Book getBookData(Book book){
        return book;
    }

    public void updataBookPrice(Book book) {
        System.out.println("�ٲ� ������ �Է��ϼ��� :");
        book.setPrice(scanner.nextInt());

    }
}
