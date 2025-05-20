package in28minutes.oopsConcepts;


public class BookLibrary {
    public static void main(String[] args){
        Book artOfComputerProgramming = new Book();
        Book effectiveJava = new Book();
        Book cleanCode = new Book();

        effectiveJava.read();
        artOfComputerProgramming.narating();
        cleanCode.write();

        effectiveJava.setNumberOfCopies(89);
        artOfComputerProgramming.setNumberOfCopies(12);
        cleanCode.setNumberOfCopies(124);
    }
}
