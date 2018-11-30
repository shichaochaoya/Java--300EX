public class BookTest {
    public static void main(String[] args) {
        Book book=new Book("老王的书","老王","55元");
        System.out.println(book.getName()+"\n"+book.getAuthor()+"\n"+book.getPrice());
    }
}
