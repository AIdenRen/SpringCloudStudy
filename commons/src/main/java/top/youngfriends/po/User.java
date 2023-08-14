package top.youngfriends.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author pap
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    Integer uid;
    String name;
    String sex;
}
