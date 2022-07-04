package com.gec.mapper;

import com.gec.bean.FundProduct;
import com.gec.bean.FundProductExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FundProductMapper {
    int countByExample(FundProductExample example);

    int deleteByExample(FundProductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FundProduct record);

    int insertSelective(FundProduct record);

    List<FundProduct> selectByExample(FundProductExample example);

    FundProduct selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FundProduct record, @Param("example") FundProductExample example);

    int updateByExample(@Param("record") FundProduct record, @Param("example") FundProductExample example);

    int updateByPrimaryKeySelective(FundProduct record);

    int updateByPrimaryKey(FundProduct record);
}