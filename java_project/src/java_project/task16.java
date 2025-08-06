package java_project;

class Book {
    String title;
    int pages;

    Book() {
        title = "Unknown";
        pages = 0;
    }

    Book(String t, int p) {
        title = t;
        pages = p;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Pages: " + pages);
    }
    
public class task16 {
 public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Basics", 300);
        b1.display();
        b2.display();
     }
 }
}