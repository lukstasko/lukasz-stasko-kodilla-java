package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest(){
        //Given
        Set<Book> books=new HashSet<>();
        books.add(new Book("Dylan Murphy", "Wolf of the mountains", 2003,"0001"));
        books.add(new Book("Phoebe Pearson", "Slaves of dreams", 2012,"0002"));
        books.add(new Book("Morgan Walsh", "Obliteration of heaven", 2001,"0003"));
        books.add(new Book("Aimee Murphy", "Rejecting the night", 2015,"0004"));
        books.add(new Book("Ryan Talley", "Gangsters and kings", 2007,"0005"));
        books.add(new Book("Madelynn Carson", "Unity without duty", 2007,"0006"));
        books.add(new Book("Giancarlo Guerrero", "Enemies of eternity", 2009,"0007"));
        MedianAdapter medianAdapter=new MedianAdapter();
        //When
        //Then
        assertEquals(2007,medianAdapter.publicationYearMedian(books));
    }
}
