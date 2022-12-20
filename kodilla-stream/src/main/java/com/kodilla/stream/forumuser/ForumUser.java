package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int id;
    private final String username;
    private final char sex;
    private final LocalDate birthday;
    private final int quantityOfPost;

    public ForumUser(final int id, final String username, final char sex,final LocalDate birthday,final int quantityOfPost) {
        this.id = id;
        this.username = username;
        this.sex = sex;
        this.birthday = birthday;
        this.quantityOfPost = quantityOfPost;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getQuantityOfPost() {
        return quantityOfPost;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", quantityOfPost=" + quantityOfPost +
                '}';
    }
}
