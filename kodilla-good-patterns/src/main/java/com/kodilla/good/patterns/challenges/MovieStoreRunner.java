package com.kodilla.good.patterns.challenges;

import java.util.stream.*;
public final  class MovieStoreRunner {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        String theResultTitles=movieStore.getMovies().entrySet().stream()
                .flatMap(entry->entry.getValue().stream())
                .collect(Collectors.joining("!","Titles: ","."));
        System.out.println(theResultTitles);
    }
}

