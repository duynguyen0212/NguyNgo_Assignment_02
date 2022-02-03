package Assignment_02;

import java.util.ArrayList;

public class Book {
    private String title;
    private boolean borrowed;

    public Book(String title) {
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void borrowBook(){
        this.borrowed = true;
    }
    public void returnBook(){
        this.borrowed = false;
    }

    public static void main(String args[]){

    }
}

