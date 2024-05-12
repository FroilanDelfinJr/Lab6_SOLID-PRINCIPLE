public class ResourceBorrower {
    private Student student;

    public ResourceBorrower(Student student) {
        this.student = student;
    }

    public void borrowResource(Borrowable resource) {
        System.out.println("Borrower Name: " + student.getName());
        System.out.println("Borrower ID: " + student.getStudentId());
        resource.borrow();
    }
}
