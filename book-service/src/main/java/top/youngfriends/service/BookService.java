package top.youngfriends.service;

import org.springframework.beans.factory.annotation.Autowired;
import top.youngfriends.mapper.BookMapper;
import top.youngfriends.po.Book;

public interface BookService {
    Book getBookByBid(int bid);
}
