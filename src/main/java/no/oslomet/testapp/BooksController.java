package no.oslomet.testapp;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BooksController {


    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return Arrays.asList(
                new Book(1l, "Tsun Zu 1", "Some Chinese geeral"),
                new Book(2l, "Harry Potter", "J.K.Rowling"));
    }

}
