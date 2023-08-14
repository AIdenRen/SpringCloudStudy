package top.youngfriends.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import top.youngfriends.po.Borrow;

import java.util.List;

/**
 * @author pap
 */
@Mapper
public interface BorrowMapper {
    @Select("select * from db_borrow where id = #{id}")
    Borrow getBorrowById(@Param("id") int id);

    @Select("select * from db_borrow where uid = #{uid}")
    List<Borrow> getBorrowByUid(int uid);

    @Select("select * from db_borrow where bid = #{bid}")
    List<Borrow> getBorrowByBid(int bid);

    @Select("selet * from db_borrow where uid = #{uid} and bid = #{bid}")
    List<Borrow> getBorrowByUidAndBid(@Param("uid") int uid, @Param("bid") int bid);
}
