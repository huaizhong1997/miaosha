package com.miaosha.dao;

import com.miaosha.dataobject.UserDO;

import java.util.List;

public interface UserDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Wed Nov 25 12:22:16 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Wed Nov 25 12:22:16 CST 2020
     */
    int insert(UserDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Wed Nov 25 12:22:16 CST 2020
     */
    int insertSelective(UserDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Wed Nov 25 12:22:16 CST 2020
     */
    UserDO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Wed Nov 25 12:22:16 CST 2020
     */
    int updateByPrimaryKeySelective(UserDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Wed Nov 25 12:22:16 CST 2020
     */
    int updateByPrimaryKey(UserDO record);
    UserDO selectByTelephone(String telephone);
    List<UserDO> selectByName(String name);
}