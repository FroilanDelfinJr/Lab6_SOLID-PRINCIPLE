public class Book implements Borrowable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void borrow() {
        System.out.println("Book Title: " + title);
    }
}