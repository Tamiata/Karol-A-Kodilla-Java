package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.person.People;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        Forum theForum = new Forum();

        Map<String, ForumUser> theResultListOfUsers = theForum.getUserList().stream()
                .filter(forumuser -> forumuser.getSex() == 'M')
                .filter(forumuser -> forumuser.getDateOfBirth().getYear() > 2001)
                .filter(forumuser -> forumuser.getNumberOfPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getID,forumuser -> forumuser));


        System.out.println(theResultListOfUsers.size());

        theResultListOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + " " + entry.getValue())
                .forEach(System.out::println);
    }
}


//       BookDirectory theBookDirectory = new BookDirectory();
//
//       Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
//              .filter(book -> book.getYearOfPublication() > 2005)
//              .collect(Collectors.toMap(Book::getSignature, book -> book));
//
//       System.out.println("# elements: " + theResultMapOfBooks.size());
//
//       theResultMapOfBooks.entrySet().stream()
//              .map(entry -> entry.getKey() + ": " + entry.getValue())
//              .forEach(System.out::println);

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


//        BookDirectory theBookDirectory = new BookDirectory();
//
//        String theResultStringOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .map(Book::toString)
//                .collect(Collectors.joining(",\n","<<",">>"));
//
//        System.out.println(theResultStringOfBooks);
