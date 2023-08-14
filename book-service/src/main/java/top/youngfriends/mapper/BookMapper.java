package top.youngfriends.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import top.youngfriends.po.Book;

/**
 * @author pap
 */
@Mapper
public interface BookMapper {
    @Select("select * from db_book where bid = #{bid}")
    Book getBookById(@Param("bid") int bid);
}
