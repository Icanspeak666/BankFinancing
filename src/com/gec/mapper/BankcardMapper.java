package com.gec.mapper;

import com.gec.bean.Bankcard;
import com.gec.bean.BankcardExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BankcardMapper {
    int countByExample(BankcardExample example);

    int deleteByExample(BankcardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Bankcard record);

    int insertSelective(Bankcard record);

    List<Bankcard> selectByExample(BankcardExample example);

    Bankcard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Bankcard record, @Param("example") BankcardExample example);

    int updateByExample(@Param("record") Bankcard record, @Param("example") BankcardExample example);

    int updateByPrimaryKeySelective(Bankcard record);

    int updateByPrimaryKey(Bankcard record);
}