package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies(){
        //Given
        User john=new Millenials("John");
        User steven=new YGeneration("Steven");
        User anthony=new ZGeneration("Anthony");
        //When
        String johnSocialPublisher=john.sharePost();
        System.out.println( "John : "+ johnSocialPublisher);
        String stevenSocialPublisher=steven.sharePost();
        System.out.println( "Steven : "+ stevenSocialPublisher);
        String anthonySocialPublisher=anthony.sharePost();
        System.out.println( "Anthony : "+ anthonySocialPublisher);
        //Then
        assertEquals("Share to Facebook",johnSocialPublisher);
        assertEquals("Share to Twitter",stevenSocialPublisher);
        assertEquals("Share to Snapchat",anthonySocialPublisher);
    }

    @Test
    void testIndividualSharingStrategy(){
        //Given
        User john=new Millenials("John");

        //When
        String socialPublisher= john.sharePost();
        System.out.println( "John : "+socialPublisher);
        john.setSocialPublisher(new SnapchatPublischer());
        socialPublisher= john.sharePost();
        System.out.println( "John now: "+socialPublisher);

        //Then
        assertEquals("Share to Snapchat",socialPublisher);
    }
}
