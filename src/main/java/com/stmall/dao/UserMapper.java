package com.stmall.dao;

import com.stmall.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int checkUsername(String username);

    int checkEmail(String email);

    User selectLogin(@Param("username")String username, @Param("password")String password);
    //因为一旦登陆了就要把用户信息返回给前端，所以返回值用User;mybatis传递多个参数时需要用到Param注解
    String seclecQestionByUsername(String username);

    int checkAnswer(@Param("username")String username,@Param("question")String question, @Param("answer")String answer);

    int updatePasswordByUsername(@Param("username")String username,@Param("passwordNew")String passwordNew);

    int checkPassword(@Param("password")String password,@Param("userId")Integer userId);

    int checkEmailByUserId(@Param(value="email")String email,@Param(value="userId")Integer userId);
}