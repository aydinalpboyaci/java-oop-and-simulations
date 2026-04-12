public class Book {
    private String title, author;
    private int isbn;
    private boolean isAvailable;

    Book(String title, String author, int isbn, boolean isAvailable){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = isAvailable;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
    public void borrowBook(){
        isAvailable = false;
    }
    public void returnBook(){
        isAvailable = true;
    }

    @Override
    public String toString() {
        return "Title:" + title + "\nAuthor:"+ author +
                "\nISBN:"+ isbn + "\nisAvailable:" + isAvailable;
    }
}
