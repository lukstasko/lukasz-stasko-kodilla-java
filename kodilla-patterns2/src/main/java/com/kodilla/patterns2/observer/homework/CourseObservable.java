package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.Observer;

public interface CourseObservable {
    void registerObserver(CourseObserver observer);
    void notifyObservers();
    void removeObserver(CourseObserver observer);
}

