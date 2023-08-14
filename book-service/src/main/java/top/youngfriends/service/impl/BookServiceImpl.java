package top.youngfriends.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.youngfriends.mapper.BookMapper;
import top.youngfriends.po.Book;
import top.youngfriends.service.BookService;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookMapper bookMapper;

    @Override
    public Book getBookByBid(int bid) {
        return bookMapper.getBookById(bid);
    }
}
