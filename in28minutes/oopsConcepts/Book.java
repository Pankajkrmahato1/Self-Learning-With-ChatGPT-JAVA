package in28minutes.oopsConcepts;

public class Book {
    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    private int numberOfCopies;
    public void read() {
        System.out.println("Reading book");
    }
    public void write(){
        System.out.println("Writing in a book");
    }
    public void narating(){
        System.out.println("Narating a book");
    }
}
