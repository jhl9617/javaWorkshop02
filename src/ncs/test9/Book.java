package ncs.test9;

public class Book {
    private String category;
    private String name;
    private double price;
    private double bookDiscountRate;

    public Book() {
    }

    public Book(String category, String name, double price, double bookDiscountRate) {
        this.category = category;
        this.name = name;
        this.price = price;
        this.bookDiscountRate = bookDiscountRate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getBookDiscountRate() {
        return bookDiscountRate;
    }

    public void setBookDiscountRate(double bookDiscountRate) {
        this.bookDiscountRate = bookDiscountRate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", bookDiscountRate=" + bookDiscountRate +
                '}';
    }
}
