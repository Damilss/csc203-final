
import java.nio.channels.OverlappingFileLockException;
import java.util.Comparator;


public class Book implements Comparable<Book>, Comparator<Book> {
    private String title;
    private String author;
    private int year;
    private int pageCount;

    public Book(String title, String author, int year, int pageCount) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pageCount = pageCount;
    }

    public String getTitle()  { return title; }
    public String getAuthor() { return author; }
    public int getYear()      { return year; }
    public int getPageCount() { return pageCount; }

    public String toString() {
        return year + "  " + title + " — " + author + " (" + pageCount + "p)";
    }

    @Override
    public int compareTo(Book o1){
        return this.year - o1.year;
    } 

    Comparator<Book> byPage = Comparator.comparing(Book::getPageCount);
/**
 * byPage is object type of Comparator interface, meaning that it inherits it's default methods for Comparator<Book>
 * By this logic we can cal to byPage.compare(Book o1, Book o2); which allows us to compare two books manually.
 */

}