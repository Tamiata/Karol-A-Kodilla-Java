package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final String ID;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int numberOfPosts;

    public ForumUser(final String ID,final String userName,final char sex,final LocalDate dateOfBirth,final int numberOfPosts) {
        this.ID = ID;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.numberOfPosts = numberOfPosts;
    }

    public String getID() {
        return ID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }



    @Override
    public String toString() {
        return "ForumUser {" +
                "ID: " + ID +
                ", userName: " + userName +
                ", sex: " + sex +
                ", dateOfBirth: " + dateOfBirth +
                ", numberOfPosts: " + numberOfPosts +
                '}';
    }
}
