
public class Library {
    void issueBook(){
        String  bookName[]={"java , database,  python"};
        System.out.println("Issuing a book form libray");
    }
void returnBook(){
    String bookName[]={"java"};
    System.out.println("Returning a book to library");
}
void bookDetails(){
    System.out.println("Book details are displayed");
}
 public static void main(String[] args) {
    Library lib=new Library();
    lib.issueBook();
    lib.returnBook();
    lib.bookDetails();
    
}
void showBooks(){
    String bookName[]={"java , database,  python"};
    System.out.println("Books available in library are:");
    for(String b:bookName){
        System.out.println(b);
    }
}
void addBook(){
    String bookName="c++";
    System.out.println("Adding a book to library: "+bookName);
}
Library(){
    System.out.println("Library is created");
}
class Member{
    public static void main(String[] args) {
        Library lib=new Library();
        lib.showBooks();
        lib.addBook();
        lib.issueBook();
        lib.returnBook();
        lib.bookDetails();

    }
}}