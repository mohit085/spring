package com.bookapp.util;

import com.bookapp.model.Book;
import java.util.*;

import org.springframework.stereotype.Component;

@Component
public class BookDetails {
    public List<Book> showBooks(){
        return Arrays.asList(
          new Book("Java in action","John David","Tech",1,900.90),
          new Book("5 am club","Robin Sharma","Selfhelp",2,300.68),
          new Book("HTML for Dumies","Ben John","Tech",3,456.25),
          new Book("Diary of the Anne frank","Anne frank","English",4,456.25),
          new Book("Geometry","NCERT","Math",5,789.36)
        );
    }
}
