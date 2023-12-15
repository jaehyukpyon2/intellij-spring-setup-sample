package org.zerock.springex.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TimeMapper {

    @Select(value = "SELECT NOW()")
    String getTime();

    String getTime2();
}
