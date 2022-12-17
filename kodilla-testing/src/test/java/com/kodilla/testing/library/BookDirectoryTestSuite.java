package com.kodilla.testing.library;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class BookDirectoryTestSuite {
    @Mock
    private LibraryDatabase libraryDatabaseMock;

    private List<Book> generateListOfNBooks(int booksQuantity){////////////////////////////////<<<<<<<<<<<<<<<<<<<<<
        List<Book> resultList=new ArrayList<>();
        for(int n=1;n<=booksQuantity;n++){
         Book theBook=new Book("Title "+n,"Author "+n,1970+n);
         resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    void testListBooksWithConditionsReturnList(){
        //Given
        BookLibrary bookLibrary=new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks=new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        //When
        List<Book> theListOfBooks=bookLibrary.listBooksWithCondition("Secret");

        //Then
        assertEquals(4,theListOfBooks.size());
    }

    @Test
    void testListBooksConditionMoreThen20(){
        //Given
        BookLibrary bookLibrary=new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books=new ArrayList<>();
        List<Book> resultListOf15Books=generateListOfNBooks(15);
        List<Book>resultListOf40Books=generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks")).thenReturn(resultListOf40Books);

        //When
        List<Book> theListOfBooks0=bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15=bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40=bookLibrary.listBooksWithCondition("FortyBooks");

        //Then
        assertEquals(0,theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size()) ;
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    void testListBooksWithConditionFragmentShorterThen3(){
        //Given
        LibraryDatabase libraryDatabaseMock=mock(LibraryDatabase.class);
        BookLibrary bookLibrary=new BookLibrary(libraryDatabaseMock);

        //When
        List<Book> theListOfBooks10=bookLibrary.listBooksWithCondition("An");

        //Then
        assertEquals(0,theListOfBooks10.size());
        verify(libraryDatabaseMock,times(0)).listBooksWithCondition(anyString());
    }

    @Test
    void testListBooksInHandsOf(){
        //Given
        BookLibrary bookLibrary=new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser0Books=new LibraryUser ("Name1","Lastname1","90081125057");
        LibraryUser libraryUser1Books=new LibraryUser ("Name2","Lastname2","91081125057");
        LibraryUser libraryUser5Books=new LibraryUser ("Name3","Lastname3","92081125057");
        List<Book> resultListOf0Books=new ArrayList<>();
        List<Book> resultListOf1Books=generateListOfNBooks(1);
        List<Book> resultListOf5Books=generateListOfNBooks(5);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser0Books)).thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser1Books)).thenReturn(resultListOf1Books);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser5Books)).thenReturn(resultListOf5Books);

        //When
        List<Book> theListOfBooks0=bookLibrary.listBooksInHandsOf(libraryUser0Books);
        List<Book> theListOfBooks1=bookLibrary.listBooksInHandsOf(libraryUser1Books);
        List<Book> theListOfBooks5=bookLibrary.listBooksInHandsOf(libraryUser5Books);

        //Then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(1, theListOfBooks1.size());
        assertEquals(5, theListOfBooks5.size());
    }
}
