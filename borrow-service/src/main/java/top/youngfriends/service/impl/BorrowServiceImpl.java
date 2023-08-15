package top.youngfriends.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import top.youngfriends.dto.UserBorrowDetails;
import top.youngfriends.mapper.BorrowMapper;
import top.youngfriends.po.Book;
import top.youngfriends.po.Borrow;
import top.youngfriends.po.User;
import top.youngfriends.service.BookClient;
import top.youngfriends.service.BorrowService;
import top.youngfriends.service.UserClient;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author pap
 */
@Service
public class BorrowServiceImpl implements BorrowService {
    @Autowired
    BorrowMapper borrowMapper;

//    @Autowired
//    RestTemplate restTemplate;

    @Autowired
    BookClient bookClient;

    @Autowired
    UserClient userClient;

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
        User user = userClient.findUserById(uid);
        List<Book> books = borrows.stream()
                .map(b -> bookClient.findBookById(b.getBid()))
                .collect(Collectors.toList());
        return new UserBorrowDetails(user, books);
    }
}
