package org.example;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // adding books to the library
        Book book1 = new Book("The Stranger", "Albert Camus", "9780679720201", 1989);
        Book book2 = new Book("The Trial", "Franz Kafka", "9786171500983", 1925);
        Book book3 = new Book("Schindler's Ark", "Thomas Keneally", "9780340606513", 1982 );
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        // searching books with isbn
        String searchIsbn = "9780340606513";
        Book foundBook = library.findBook(searchIsbn);
        if (foundBook != null) {
            System.out.println("Book found: " + foundBook);
        } else {
            System.out.println("Book with ISBN " + searchIsbn + " not found in the library.");
        }
        //trying to delete non-existing book
        String nonExistentIsbn = "11111111111";
        library.removeBook(nonExistentIsbn);

        for (Book book : library.books) {
            System.out.println(book);
        }
    }
}
