import java.util.*;

public class Main { 
    public static void main (String[] args){
        ArrayList <Book> books = new ArrayList<>();

        books.add(new Book("The Glass Forest", "Mara Ellison", 2018, 342));
        books.add(new Book("Tidewater",        "Mara Ellison", 2021, 298));
        books.add(new Book("Quiet Machines",   "David Oketch", 2015, 511));
        books.add(new Book("Northbound",       "Priya Raman",  2020, 224)); 

        /**
         * Prints each book out to the user
         */
        for ( Book book : books){
            System.out.println(book.toString());
        }
    }
}
 