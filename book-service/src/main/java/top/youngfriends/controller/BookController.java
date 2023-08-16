package top.youngfriends.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Book getBookById(@PathVariable("bid") int bid, HttpServletRequest request) {
        System.out.println(request.getHeader("Test"));
        return bookService.getBookByBid(bid);
    }
}
