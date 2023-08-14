package top.youngfriends.service;

import org.apache.ibatis.annotations.Param;
import top.youngfriends.dto.UserBorrowDetails;
import top.youngfriends.po.Borrow;

import java.util.List;

/**
 * @author pap
 */
public interface BorrowService {

    Borrow getBorrowById(int id);

    List<Borrow> getBorrowByUid(int uid);

    List<Borrow> getBorrowByBid(int bid);

    List<Borrow> getBorrowByUidAndBid(int uid, int bid);

    UserBorrowDetails getUsrBorrowDetailsByUid(int  uid);
}
