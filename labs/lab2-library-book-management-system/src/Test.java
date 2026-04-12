public class Test {
    public static void main(String[] args) {
        Book b1 = new  Book("Nutuk","Mustafa Kemal Atatürk", 999,true);
        Book b2 = new Book("Anna Karenina","Lev Tolstoy",1000,true);
        Book b3 = new Book("1984","George Orwell",1001,true);
        Library lib = new Library();
        lib.addBook(b1);
        lib.addBook(b2);
        lib.addBook(b3);
        System.out.println("\n=== BORROW BOOK (ISBN: 1000) ===");
        lib.borrowBook(1000);

        System.out.println("\n=== AVAILABLE BOOKS ===");
        lib.listAvailableBooks();

        System.out.println("\n=== TRY TO BORROW SAME BOOK AGAIN ===");
        lib.borrowBook(1000);

        System.out.println("\n=== RETURN BOOK (ISBN: 1000) ===");
        lib.returnBook(1000);

        System.out.println("\n=== AVAILABLE BOOKS AFTER RETURN ===");
        lib.listAvailableBooks();

        System.out.println("\n=== REMOVE BOOK (ISBN: 1001) ===");
        lib.removeBook(1001);

        System.out.println("\n=== FINAL AVAILABLE BOOKS ===");
        lib.listAvailableBooks();
    }
}
