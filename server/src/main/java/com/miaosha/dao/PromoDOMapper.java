package com.miaosha.dao;

import com.miaosha.dataobject.PromoDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PromoDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Fri Nov 27 16:40:13 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Fri Nov 27 16:40:13 CST 2020
     */
    int insert(PromoDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Fri Nov 27 16:40:13 CST 2020
     */
    int insertSelective(PromoDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Fri Nov 27 16:40:13 CST 2020
     */
    PromoDO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Fri Nov 27 16:40:13 CST 2020
     */
    int updateByPrimaryKeySelective(PromoDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Fri Nov 27 16:40:13 CST 2020
     */
    int updateByPrimaryKey(PromoDO record);

    PromoDO selectByItemId(Integer itemId);

    List<PromoDO> selectByName(@Param(value = "name") String name);
}