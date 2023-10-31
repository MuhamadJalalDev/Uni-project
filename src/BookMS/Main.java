
package BookMS;





public class Main {
   
    public static void main(String[] args) {
       Book myBook = new Book("xyz", 123, "ex.jack", "abc");

       
        myBook.displayBook();
        myBook.setBookName("DeepWork");
        myBook.setIsbn(32);
        myBook.setAuthorName("calNewport");
        myBook.setPublisher("self improvement.inc" );
        
        myBook.displayBook();
     
     
    }
}
