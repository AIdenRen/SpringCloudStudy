package top.youngfriends.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import top.youngfriends.po.Book;
import top.youngfriends.po.User;

import java.util.List;

/**
 * @author pap
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserBorrowDetails {
    User user;
    List<Book> bookList;
}
