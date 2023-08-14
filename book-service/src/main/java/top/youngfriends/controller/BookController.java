package top.youngfriends.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.youngfriends.po.Book;
import top.youngfriends.service.BookService;

/**
 * @author pap
 */
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping("/{bid}")
    public Book getBookById(@PathVariable("bid") int bid) {
        return bookService.getBookByBid(bid);
    }
}
