import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    Library(){
        books = new ArrayList<>();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    void addBook(Book book){
        books.add(book);
    }

    void borrowBook(int isbn){
        for (Book book : books) {
            if (book.getIsbn() == isbn) {
                if (book.isAvailable()) {
                    book.borrowBook();
                    System.out.println("Book borrowed successfully!\n");
                } else {
                    System.out.println("This book is already borrowed by someone!\n");
                }
            }
        }
        System.out.println("Book not found!\n");

    }

    void returnBook(int isbn){
        for (Book book : books) {
            if (book.getIsbn() == isbn) {
                if(!book.isAvailable()){
                    book.returnBook();
                    System.out.println("Book successfully returned!\n");
                }
                else{
                    System.out.println("Book is already available!\n");
                }
            }
        }
        System.out.println("Book not found!");
    }

    void listAvailableBooks(){
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book);
            }
        }
    }

    void removeBook(int isbn){
        for(int i = 0; i < books.size(); i++){
            if (books.get(i).getIsbn() == isbn){
                books.remove(i);
                System.out.println("Book removed successfully!\n");
            }
        }
        System.out.println("There is not such book!\n");
    }

}
