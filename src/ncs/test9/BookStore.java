package ncs.test9;

public class BookStore {
    public static void main(String[] args) {
        Book book = new Book("카테고리", "책이름", 9800, 10);
        System.out.println(book.toString());
        BookUpdate bookUpdate = new BookUpdate(book);
        bookUpdate.updataBookPrice(book);
        System.out.println("변경된 정보 : " +book.toString());

    }
}
