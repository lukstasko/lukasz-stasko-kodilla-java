package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theForumUserList=new ArrayList<>();
    public Forum(){
        theForumUserList.add(new ForumUser(1,"User1",'M', LocalDate.of(1990,05,30),2));
        theForumUserList.add(new ForumUser(2,"User2",'M', LocalDate.of(2002,12,19),1));
        theForumUserList.add(new ForumUser(3,"User3",'F', LocalDate.of(2004,12,15),1));
        theForumUserList.add(new ForumUser(4,"User4",'F', LocalDate.of(2001,3,9),2));
        theForumUserList.add(new ForumUser(5,"User5",'M', LocalDate.of(2001,2,15),0));

}
    public List<ForumUser> getTheForumUserList(){

        return new ArrayList<>(theForumUserList);
    }
}
