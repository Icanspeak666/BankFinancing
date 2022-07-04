package com.gec.mapper;

import com.gec.bean.UserFundProduct;
import com.gec.bean.UserFundProductExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserFundProductMapper {
    int countByExample(UserFundProductExample example);

    int deleteByExample(UserFundProductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserFundProduct record);

    int insertSelective(UserFundProduct record);

    List<UserFundProduct> selectByExample(UserFundProductExample example);

    UserFundProduct selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserFundProduct record, @Param("example") UserFundProductExample example);

    int updateByExample(@Param("record") UserFundProduct record, @Param("example") UserFundProductExample example);

    int updateByPrimaryKeySelective(UserFundProduct record);

    int updateByPrimaryKey(UserFundProduct record);
}