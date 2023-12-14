package com.example.mybatis.mapper;

import com.example.mybatis.pojo.MyApple;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AppleMapper {
    @Select("select * from appledetail where appledetail.id=#{id}")
    public MyApple selectAppleById(@Param("id") Integer id);

    @Select("select * from appledetail")
    public List<MyApple> selectAllApple();
    @Insert("insert into appledetail (name, color, price, time) values (#{name}, #{color}, #{price}, #{time})")
    public int addMyApple(MyApple apple);
    @Update("update appledetail set name=#{name}, color=#{color}, price=#{price}, time=#{time} where id = #{id}")
    public int updateApple(MyApple apple);
    @Delete("delete from appledetail where id=#{id}")
    public int deleteApple(@Param("id") Integer id);

    @Select("select * from appledetail order by time DESC limit 1")
    public MyApple selectLeastApple();
}
