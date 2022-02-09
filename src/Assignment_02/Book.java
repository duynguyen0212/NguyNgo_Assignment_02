/*
    Name: Ngoc Duy Nguyen
    Date: 2/3/2022
    Description: Simple Library
* */
package Assignment_02;
public class Book {
    private String title;
    private boolean borrowed;

    public Book(String title) {
        this.title = title;
        borrowed = false;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void borrowed(){
        this.borrowed = true;
    }
    public void returned(){
        this.borrowed = false;
    }

    public boolean isBorrowed(){
        return borrowed;
    }
}

