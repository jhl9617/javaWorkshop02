package ncs.test10;

public class Book {
    private String title;
    private String author;
    private int price;
    private String publisher;
    private double discountRate;

    public Book() {
    }

    public Book(String title, String author, int price, String publisher, double discountRate) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
        this.discountRate = discountRate;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public String getPublisher() {
        return publisher;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "제목='" + title + '\'' +
                ", 저자='" + author + '\'' +
                ", 가격=" + price +
                ", 출판사='" + publisher + '\'' +
                ", 할인된 가격=" + (int)(price * (100 - discountRate) / 100) +
                '}';
    }
}
