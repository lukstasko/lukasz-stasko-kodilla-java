package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CalculateAdvStatisticsTestSuite {
    @Mock
    private Statistics statistics;

    private static List<String> usernameList=new ArrayList<>();
    @BeforeAll
    static void beforeAll(){
        usernameList.add("User1");
        usernameList.add("User2");
    }
    private static int postCountMock;
    private static int commentsCountMock;
    @BeforeEach
    void beforeEach(){
        postCountMock=10;
        commentsCountMock=20;
    }
    @Test
    void testCalculateAdvStatisticsTestSuite0Post(){
        //Given
        postCountMock=0;
       ForumStatistics forumStatistics= new ForumStatistics ();
       when(statistics.usersNames()).thenReturn(usernameList);
        when(statistics.postsCount()).thenReturn(postCountMock);
        when(statistics.commentsCount()).thenReturn(commentsCountMock);

       //When
        forumStatistics.calculateAdvStatistics(statistics);
        String expectedResult="ForumStatistics{quantityOfUsers=2, quantityOfPosts=0, quantityOfComments=20, averagePostPerUser=0.0, averageCommentPerUser=10.0, averageCommentPerPost=0.0}";

        //Then
        Assertions.assertEquals(expectedResult,forumStatistics.showStatistics());
    }
    @Test
    void testCalculateAdvStatisticsTestSuite1000Post(){
        //Given
        postCountMock=1000;
        ForumStatistics forumStatistics= new ForumStatistics ();
        when(statistics.usersNames()).thenReturn(usernameList);
        when(statistics.postsCount()).thenReturn(postCountMock);
        when(statistics.commentsCount()).thenReturn(commentsCountMock);

        //When
        forumStatistics.calculateAdvStatistics(statistics);
        String expectedResult="ForumStatistics{quantityOfUsers=2, quantityOfPosts=1000, quantityOfComments=20, averagePostPerUser=500.0, averageCommentPerUser=10.0, averageCommentPerPost=0.02}";

        //Then
        Assertions.assertEquals(expectedResult,forumStatistics.showStatistics());
    }
    @Test
    void testCalculateAdvStatisticsTestSuite0Comments(){
        //Given
        commentsCountMock=0;
        ForumStatistics forumStatistics= new ForumStatistics ();
        when(statistics.usersNames()).thenReturn(usernameList);
        when(statistics.postsCount()).thenReturn(postCountMock);
        when(statistics.commentsCount()).thenReturn(commentsCountMock);

        //When
        forumStatistics.calculateAdvStatistics(statistics);
        String expectedResult="ForumStatistics{quantityOfUsers=2, quantityOfPosts=10, quantityOfComments=0, averagePostPerUser=5.0, averageCommentPerUser=0.0, averageCommentPerPost=0.0}";

        //Then
        Assertions.assertEquals(expectedResult,forumStatistics.showStatistics());
    }
    @Test
    void testCalculateAdvStatisticsTestSuite1000Comments(){
        //Given
        commentsCountMock=1000;
        ForumStatistics forumStatistics= new ForumStatistics ();
        when(statistics.usersNames()).thenReturn(usernameList);
        when(statistics.postsCount()).thenReturn(postCountMock);
        when(statistics.commentsCount()).thenReturn(commentsCountMock);

        //When
        forumStatistics.calculateAdvStatistics(statistics);
        String expectedResult="ForumStatistics{quantityOfUsers=2, quantityOfPosts=10, quantityOfComments=1000, averagePostPerUser=5.0, averageCommentPerUser=500.0, averageCommentPerPost=100.0}";

        //Then
        Assertions.assertEquals(expectedResult,forumStatistics.showStatistics());
    }

    @Test
    void testCalculateAdvStatisticsTestSuite0Users(){
        //Given
        List<String> usernameList1=new ArrayList<>();
        ForumStatistics forumStatistics= new ForumStatistics ();
        when(statistics.usersNames()).thenReturn(usernameList1);
        when(statistics.postsCount()).thenReturn(postCountMock);
        when(statistics.commentsCount()).thenReturn(commentsCountMock);

        //When
        forumStatistics.calculateAdvStatistics(statistics);
        String expectedResult="ForumStatistics{quantityOfUsers=0, quantityOfPosts=10, quantityOfComments=20, averagePostPerUser=0.0, averageCommentPerUser=0.0, averageCommentPerPost=2.0}";

        //Then
        Assertions.assertEquals(expectedResult,forumStatistics.showStatistics());
    }
    @Test
    void testCalculateAdvStatisticsTestSuite100Users(){
        //Given
        List<String> usernameList1=new ArrayList<>();
        for (int n=0 ;n<100;n++){
            usernameList1.add("User"+n);
        }
        ForumStatistics forumStatistics= new ForumStatistics ();
        when(statistics.usersNames()).thenReturn(usernameList1);
        when(statistics.postsCount()).thenReturn(postCountMock);
        when(statistics.commentsCount()).thenReturn(commentsCountMock);

        //When
        forumStatistics.calculateAdvStatistics(statistics);
        String expectedResult="ForumStatistics{quantityOfUsers=100, quantityOfPosts=10, quantityOfComments=20, averagePostPerUser=0.1, averageCommentPerUser=0.2, averageCommentPerPost=2.0}";

        //Then
        Assertions.assertEquals(expectedResult,forumStatistics.showStatistics());
    }


}
