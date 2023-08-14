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
public class Book {

  private Integer bid;
  private String title;
  private String desc;

}
