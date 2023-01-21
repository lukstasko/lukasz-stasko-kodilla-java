package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {
    @Test
    void testGetBooks(){
        //Given
        Library library=new Library("Library 1");
        IntStream.iterate(1, n->n+1)
                .limit(10)
                .forEach(n->library.getBooks().add(new Book("Title number "+n ,
                                                            "Author number "+n,
                                                             LocalDate.of(2020-n,5,30-n))));

        Library clonedLibrary=null;
        try{
            clonedLibrary=library.shallowCopy();
            clonedLibrary.setName("Library 2");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        Library deepClonedLibrary=null;
        try{
            deepClonedLibrary=library.deepCopy();
            deepClonedLibrary.setName("Library 3");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //When
        Book book1=new Book("Title number "+11 ,
                "Author number "+11,
                LocalDate.of(2021,5,20));
        library.getBooks().add(book1);

        //Then
        System.out.println(library.getName()+":");
        for (Book books:library.getBooks()) {
            System.out.println("     "+books);
        }
        System.out.println(clonedLibrary.getName()+":");
        for (Book books:clonedLibrary.getBooks()) {
            System.out.println("     "+books);
        }
        System.out.println(deepClonedLibrary.getName()+":");
        for (Book books:deepClonedLibrary.getBooks()) {
            System.out.println("     "+books);
        }
        assertEquals(11,library.getBooks().size());
        assertEquals(11,clonedLibrary.getBooks().size());
        assertEquals(10,deepClonedLibrary.getBooks().size());
        assertEquals(clonedLibrary.getBooks(), library.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
