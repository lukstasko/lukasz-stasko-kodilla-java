package com.kodilla.exception.io;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
public class FileReaderTestSuite {

    @Test
    void testReadFile(){
        //Given
        FileReader fileReader=new FileReader();

        //when & then
        assertDoesNotThrow(()->fileReader.readFile());
    }
    @Test
    void whenFileDosentExistsReadFileShouldThrowException(){
        //given
        FileReader fileReader=new FileReader();
        String filName="nie_ma_takiego_pliku.txt";
        //when & then
        assertThrows(FileReaderException.class,()->fileReader.readFile(filName));
    }
    @Test
    public void testReadFileWithName() {
        // given
        FileReader fileReader = new FileReader();
        // when & then
        assertAll(
                ()->assertThrows(FileReaderException.class,()->fileReader.readFile("nie_MA_TAKIEGO_PLIKU.txt")),
                ()->assertThrows(FileReaderException.class,()->fileReader.readFile(null)),
                ()->assertDoesNotThrow(()->fileReader.readFile("names.txt"))
        );
    }
}
