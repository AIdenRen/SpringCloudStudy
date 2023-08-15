package top.youngfriends.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.youngfriends.dto.UserBorrowDetails;
import top.youngfriends.po.Borrow;
import top.youngfriends.service.BorrowService;

import java.util.Collections;

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
    @HystrixCommand(fallbackMethod = "onError")
    UserBorrowDetails getUserBorrowDetails(@PathVariable("uid") int uid) {
        return borrowService.getUsrBorrowDetailsByUid(uid);
    }

    UserBorrowDetails onError(int uid) {
        return new UserBorrowDetails(null, Collections.emptyList());
    }


}
