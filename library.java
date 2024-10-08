class Book {
    static int totalnoofBooks;

    String author;
    String title;
    String isbn;

    boolean isborrowed;
    static{
        totalnoofBooks = 0;
    }
    {
        totalnoofBooks++;
    }

    // Constructor
    Book( String author ,String title ,String isbn){
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }

    // enforce isbn is must
    Book(String isbn){
        this("unknown" , "unknown" , isbn);
    }

    static int gettotalNoofBooks(){
        return totalnoofBooks;
    }

    void borrowBook(){
        if(isborrowed){
            System.out.println("Book is already borrowed");
        }
        else{
            // If anyone want to borrow the book
            this.isborrowed = true;
            System.out.println("Enjoy the Book");
        }
    }

    void returnBook(){
        if(isborrowed){
            this.isborrowed = false;
            System.out.println("Hope ou enjoyed the borrowed book");
        }
        else{
            System.out.println("This book is already in the library");
        }
    }

    public static void main(String[] args) {
        Book designOfThings = new Book("Author" , "Design" , "1");
        Book myBook = new Book("2");
        System.out.println(Book.gettotalNoofBooks());
        designOfThings.borrowBook();
        myBook.borrowBook();
        designOfThings.borrowBook();
        designOfThings.returnBook();
        designOfThings.returnBook();
    }
}
