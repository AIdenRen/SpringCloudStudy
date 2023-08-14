package top.youngfriends.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.youngfriends.dto.UserBorrowDetails;
import top.youngfriends.po.Borrow;
import top.youngfriends.service.BorrowService;

/**
 * @author pap
 */
@RestController
@RequestMapping("/borrow")
public class BorrowController {

    @Autowired
    BorrowService borrowService;

    @RequestMapping("/{id}")
    public Borrow getBorrow(@PathVariable("id") int id) {
        return borrowService.getBorrowById(id);
    }

    @RequestMapping("/details-user/{uid}")
    UserBorrowDetails getUserBorrowDetails(@PathVariable("uid") int uid) {
        return borrowService.getUsrBorrowDetailsByUid(uid);
    }
}
