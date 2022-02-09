/*
    Name: Ngoc Duy Nguyen
    Date: 2/3/2022
    Description: Simple Library
* */
package Assignment_02;
import java.util.ArrayList;
public class Library {
    private ArrayList<Book> collection;
    private String address;
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public Library(String address){
        this.address = address;
        collection = new ArrayList<Book>();
    }
    public ArrayList<Book> getCollection(){
        return collection;
    }
    public void setCollection(ArrayList<Book> book){
        this.collection = collection;
    }
    /**
     * Add book to the library
     * */
    public void addBook(Book book){
        collection.add(book);
    }
    /**Print opening hours*/
    public static void openingHours(){
        System.out.println("Hours of operation:");
        System.out.println("Open everyday from 9AM - 5PM\n");
    }
    /**Print library's address*/
    public void printAddress(){
        System.out.println("Library address: " + address);
    }
    /**Borrow books from library*/
    public void borrowBook(String title){
        for(int i=0; i<collection.size(); i++)
            if(collection.get(i).getTitle().equals(title))
                if(collection.get(i).isBorrowed()){
                    System.out.println(title + " is already borrowed.");
                    return;
                }
            else{
                System.out.println("Successfully borrowed " + title);
                collection.get(i).borrowed();
                return;
                }
        System.out.println("Sorry, this book is out of stock.");
    }
    /**Return book*/
    public void returnBook(String title){
        for(int i=0; i<collection.size(); i++)
            if(collection.get(i).getTitle().equals(title))
                if(collection.get(i).isBorrowed()){
                    System.out.println("Successfully returned " + title);
                    collection.get(i).returned();
                    return;
                }
                else{
                    System.out.println("This book was not borrowed");
                    return;
                }
        System.out.println("Sorry, this book is out of stock.");
    }
    /**Print available books*/
    public static void printAvailableBook(ArrayList<Book> collection){
        if(collection.size()==0)
            System.out.println("This library has no book");
        else {
            for (int i = 0; i < collection.size(); i++)
                if (!collection.get(i).isBorrowed())
                    System.out.println(collection.get(i).getTitle());
        }
    }
    /**Main function*/
    public static void main(String args[]){
        //Two libraries
        Library queenLibrary = new Library("120 Queen St.");
        Library collegeLibrary = new Library("228 College St.");

        //Print opening hours and addresses
        queenLibrary.printAddress();
        openingHours();
        collegeLibrary.printAddress();
        openingHours();

        //Add Books to Queen library
        queenLibrary.addBook(new Book("The Lord of the Rings"));
        queenLibrary.addBook(new Book("The DaVinci Code"));
        queenLibrary.addBook(new Book("A tale of Two Cities"));
        queenLibrary.addBook(new Book("Le Petit Prince"));

        //Try to borrow a book and borrow it again
        System.out.println("Borrow a book and re-borrow it...");
        System.out.println("Queen Library:");
        queenLibrary.borrowBook("The Lord of the Rings");
        queenLibrary.borrowBook("The Lord of the Rings");

        //Borrow same book but from College library which have 0 book
        System.out.println("College Library:");
        collegeLibrary.borrowBook("The Lord of the Rings");

        //Print available book at library
        System.out.println("\nAvailable books at two library: ");
        System.out.println("Queen Library:");
        printAvailableBook(queenLibrary.collection);
        System.out.println("\nCollege Library:");
        printAvailableBook(collegeLibrary.collection);

        System.out.print("\nReturning The Lord of the Rings to Queen: ");
        queenLibrary.returnBook("The Lord of the Rings");

        System.out.println("\nRe-print available books at two library: ");
        System.out.println("Queen Library:");
        printAvailableBook(queenLibrary.collection);
        System.out.println("\nCollege Library:");
        printAvailableBook(collegeLibrary.collection);
    }
}
