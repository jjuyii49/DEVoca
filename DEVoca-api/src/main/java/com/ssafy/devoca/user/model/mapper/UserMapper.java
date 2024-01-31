package com.ssafy.devoca.user.model.mapper;

import com.ssafy.devoca.user.model.UserDTO;
import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;

@Mapper
public interface UserMapper {

    public void joinUser(UserDTO userDTO) throws SQLException;
}
