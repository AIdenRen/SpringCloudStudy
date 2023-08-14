package top.youngfriends.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import top.youngfriends.dto.UserBorrowDetails;
import top.youngfriends.mapper.BorrowMapper;
import top.youngfriends.po.Book;
import top.youngfriends.po.Borrow;
import top.youngfriends.po.User;
import top.youngfriends.service.BorrowService;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author pap
 */
@Service
public class BorrowServiceImpl implements BorrowService {
    @Autowired
    BorrowMapper borrowMapper;

    @Autowired
    RestTemplate restTemplate;

    @Override
    public Borrow getBorrowById(int id) {
        return borrowMapper.getBorrowById(id);
    }

    @Override
    public List<Borrow> getBorrowByUid(int uid) {
        return borrowMapper.getBorrowByUid(uid);
    }

    @Override
    public List<Borrow> getBorrowByBid(int bid) {
        return borrowMapper.getBorrowByBid(bid);
    }

    @Override
    public List<Borrow> getBorrowByUidAndBid(int uid, int bid) {
        return borrowMapper.getBorrowByUidAndBid(uid, bid);
    }

    @Override
    public UserBorrowDetails getUsrBorrowDetailsByUid(int uid) {
        List<Borrow> borrows = borrowMapper.getBorrowByUid(uid);
        User user = restTemplate.getForObject("http://userService/user/" + uid, User.class);
        List<Book> books = borrows.stream()
                .map(borrow -> restTemplate.getForObject("http://bookService/book/" + borrow.getBid(), Book.class))
                .collect(Collectors.toList());
        return new UserBorrowDetails(user, books);
    }
}
