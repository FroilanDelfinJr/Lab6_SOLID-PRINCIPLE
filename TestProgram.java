public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 123456);

        ResourceBorrower borrower = new ResourceBorrower(student);

        Borrowable book = new Book("Introduction to Java");
        borrower.borrowResource(book);
    }
}