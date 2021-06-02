package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> listOfForumUsers = new ArrayList<>();

    public Forum() {

        listOfForumUsers.add(new ForumUser("001", "Ricky", 'M', LocalDate.of(1985, 5, 4), 4));
        listOfForumUsers.add(new ForumUser("002", "Martin", 'M', LocalDate.of(1980, 3, 28), 70));
        listOfForumUsers.add(new ForumUser("003", "Christina", 'F', LocalDate.of(1992, 12, 12), 0));
        listOfForumUsers.add(new ForumUser("004", "Mick", 'M', LocalDate.of(2004, 7, 18), 254));
        listOfForumUsers.add(new ForumUser("005", "Anna", 'F', LocalDate.of(1995, 7, 1), 53));
        listOfForumUsers.add(new ForumUser("006", "Sharon", 'F', LocalDate.of(2000, 3, 24), 82));

    }

    public List<ForumUser> getUserList(){
        return new ArrayList<>(listOfForumUsers);
    }

}
