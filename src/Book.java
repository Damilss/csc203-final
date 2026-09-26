import java.util.Comparator;
import java.util.List;


/**
 * Book class represents book for main.
 * @param title 
 * @param author
 * @param year
 * @param pageCount
 */
public class Book implements Comparable<Book>{
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
    /**
     * getTitle getter method for title.
     * @return
     */
    public String getTitle()  { return title; }

    /**
     * getAuthor method for author
     * @return
     */
    public String getAuthor() { return author; }

    /**
     * getYear method for year
     * @return
     */
    public int getYear()      { return year; }

    /**
     * getPageCount method for pageCount
     * @return
     */
    public int getPageCount() { return pageCount; }

    /**
     * 
     * @return
     */
    public String toString() {
        return year + "  " + title + " — " + author + " (" + pageCount + "p)";
    }

    @Override
    public int compareTo(Book o1){
        return this.year - o1.year;
    } 

    /**
     * Comparator to compare books by pageCount
     */
    Comparator<Book> byPageCount  = Comparator.comparing(Book::getPageCount);

    /**
     * Comparator to compare by author that breaks ties by year
     */
    Comparator<Book> byAuthor = Comparator.comparing(Book::toString).thenComparing(Book::getYear);

    /**
     * 
     */

    public void printAuthors(List<Book> books, String author){
        Predicate<Book> getBookAuthor = (Book myBook) -> ...author

        books.stream()
            .filter(getBookAuthor)
            .forEach(null);
    }


/**
 * byPage is object type of Comparator interface, meaning that it inherits it's default methods for Comparator<Book>
 * By this logic we can cal to byPage.compare(Book o1, Book o2); which allows us to compare two books manually.
 */

}