import java.util.Scanner;

class Book {
    String title, author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

class Fiction extends Book {
    public Fiction(String title, String author, double price) {
        super(title, author, price);
    }

    public void displayDetails() {
        System.out.println("Fiction Book Details:");
        super.displayDetails();
    }
}

class NonFiction extends Book {
    public NonFiction(String title, String author, double price) {
        super(title, author, price);
    }

    public void displayDetails() {
        System.out.println("Non-Fiction Book Details:");
        super.displayDetails();
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details for Fiction Book:");
        System.out.print("Title: ");
        String fictionTitle = sc.nextLine();
        System.out.print("Author: ");
        String fictionAuthor = sc.nextLine();
        System.out.print("Price: ");
        double fictionPrice = sc.nextDouble();
        sc.nextLine(); 

        System.out.println("Enter details for Non-Fiction Book:");
        System.out.print("Title: ");
        String nonFictionTitle = sc.nextLine();
        System.out.print("Author: ");
        String nonFictionAuthor = sc.nextLine();
        System.out.print("Price: ");
        double nonFictionPrice = sc.nextDouble();

        Fiction fictionBook = new Fiction(fictionTitle, fictionAuthor, fictionPrice);
        NonFiction nonFictionBook = new NonFiction(nonFictionTitle, nonFictionAuthor, nonFictionPrice);

        System.out.println();
        fictionBook.displayDetails();
        System.out.println();
        nonFictionBook.displayDetails();

        sc.close();
    }
}
