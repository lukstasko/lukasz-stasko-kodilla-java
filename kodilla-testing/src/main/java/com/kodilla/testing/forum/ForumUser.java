package com.kodilla.testing.forum;

import java.util.*;

public class ForumUser {
    private final String name;
    private final String realName;
    private final List<ForumPost> posts=new ArrayList<>();
    private final List<ForumComment> coments=new LinkedList<>();

    public ForumUser(String name, String realName) {
        //name visible on forum
        this.name = name;
        //real name of the user
        this.realName = realName;
    }
    public void addPost(String author, String postBody){
        ForumPost thePost=new ForumPost(postBody,author);
        posts.add(thePost);

    }

    public void  addComment(ForumPost thePost,String author, String commentBody){
        ForumComment theComment=new ForumComment(thePost,commentBody,author);
        coments.add(theComment);
    }

    public int getPostsQuantity(){
        return posts.size();
    }

    public int getCommentsQuantityy() {
            return coments.size();
    }
    public ForumPost getPost(int postNumber){
        if (postNumber>=0 && postNumber<posts.size()){
            return posts.get(postNumber);
        }
        return null;
    }

    public ForumComment getComment(int commentNumber){
        if(commentNumber>=0 && commentNumber<coments.size()){
            return coments.get(commentNumber);
        }
        return null;
    }
    public boolean removePost(ForumPost thePost){
        boolean result=false;
        if(posts.contains(thePost)) {
            posts.remove(thePost);
            result=true;
        }
        return result;
    }

    public boolean removeComment(ForumComment theComment){
        boolean result=false;
        if(coments.contains(theComment)){
            coments.remove(theComment);
            result = true;
        }
        return result;
    }


    public String getName(){
        return name;
    }
    public String getRealName(){
        return realName;
    }

}
