package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private int quantityOfUsers;
    private int quantityOfPosts;
    private int quantityOfComments;

    private double averagePostPerUser;
    private double averageCommentPerUser;
    private double averageCommentPerPost;
    public ForumStatistics(){
        this.quantityOfUsers = 0;
        this.quantityOfPosts = 0;
        this.quantityOfComments = 0;
        this.averagePostPerUser=0.0;
        this.averageCommentPerPost=0.0;
        this.averageCommentPerUser=0.0;
    }
    public ForumStatistics(int quantityOfUsers, int quantityOfPosts, int quantityOfComments) {
        this.quantityOfUsers = quantityOfUsers;
        this.quantityOfPosts = quantityOfPosts;
        this.quantityOfComments = quantityOfComments;
    }

    public int getQuantityOfUsers() {
        return quantityOfUsers;
    }

    public void setQuantityOfUsers(int quantityOfUsers) {
        this.quantityOfUsers = quantityOfUsers;
    }

    public int getQuantityOfPosts() {
        return quantityOfPosts;
    }

    public void setQuantityOfPosts(int quantityOfPosts) {
        this.quantityOfPosts = quantityOfPosts;
    }

    public int getQuantityOfComment() {
        return quantityOfComments;
    }

    public void setQuantityOfComment(int quantityOfComments) {
        this.quantityOfComments = quantityOfComments;
    }

    public double getAveragePostPerUser() {
        return averagePostPerUser;
    }

    public double getAverageCommentPerUser() {
        return averageCommentPerUser;
    }

    public double getAverageCommentPerPost() {
        return averageCommentPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        this.quantityOfUsers = statistics.usersNames().size();
        this.quantityOfPosts = statistics.postsCount();
        this.quantityOfComments = statistics.commentsCount();
        if (quantityOfPosts == 0 || quantityOfUsers == 0) {
            averagePostPerUser = 0.0;
        } else {
            averagePostPerUser = ((double) quantityOfPosts / (double) quantityOfUsers);
        }

        if (quantityOfPosts == 0 || quantityOfComments == 0) {
            averageCommentPerPost = 0.0;
        } else {
            averageCommentPerPost = ((double) quantityOfComments / (double) quantityOfPosts);
        }

        if (quantityOfUsers == 0 || quantityOfComments == 0) {
            averageCommentPerUser = 0.0;
        } else {
            averageCommentPerUser = ((double) quantityOfComments / (double) quantityOfUsers);
        }
    }

    public String showStatistics(){
        return "ForumStatistics{" +
                "quantityOfUsers=" + quantityOfUsers +
                ", quantityOfPosts=" + quantityOfPosts +
                ", quantityOfComments=" + quantityOfComments +
                ", averagePostPerUser=" + averagePostPerUser +
                ", averageCommentPerUser=" + averageCommentPerUser +
                ", averageCommentPerPost=" + averageCommentPerPost +
                '}';
    }
}
