package top.youngfriends.service.impl;

import org.springframework.stereotype.Component;
import top.youngfriends.po.Book;
import top.youngfriends.service.BookClient;

/**
 * @author pap
 */
@Component
public class BookClientImpl implements BookClient {
    @Override
    public Book findBookById(int bid) {
        return new Book();
    }
}
