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
    public void addBook(Book book){
        collection.add(book);
    }

    public static void openingHours(){
        System.out.println("Open from 9AM - 5PM");
    }
    public String toString(){
        return "Library address: " + address;

    }
    public static void printAvailableBook(ArrayList<Book> collection){
        for(int i=0; i<collection.size(); i++){
            System.out.println(collection.get(i));

        }
    }
    public static void main(String args[]){
        //Two libraries
        Library firstLibrary = new Library("120 Queen St.");
        Library secondLibrary = new Library("228 College St.");

        System.out.println(firstLibrary);
        System.out.println(secondLibrary);
        openingHours();
        firstLibrary.addBook(new Book("The Lord of the Rings"));
        firstLibrary.addBook(new Book("The DaVinci Code"));
        firstLibrary.addBook(new Book("A tale of Two Cities"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.printAvailableBook(firstLibrary.collection);
        secondLibrary.printAvailableBook(secondLibrary.collection);

    }
}
