package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWitchoutHandling;

public class ExceptionModuleRunner {
    public static void main(String[] args) {
        FileReader fileReader=new FileReader();

        try{
            fileReader.readFile("zła_nazwa_pliku");
        }catch(FileReaderException e){
            System.out.println("Problem while reading a file!");
        }


    }
}