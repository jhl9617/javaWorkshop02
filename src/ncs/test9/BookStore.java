package ncs.test9;

public class BookStore {
    public static void main(String[] args) {
        Book book = new Book("ī�װ�", "å�̸�", 9800, 10);
        System.out.println(book.toString());
        BookUpdate bookUpdate = new BookUpdate(book);
        bookUpdate.updataBookPrice(book);
        System.out.println("����� ���� : " +book.toString());

    }
}
