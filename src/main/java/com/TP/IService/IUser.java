package com.TP.IService;

import com.TP.entity.UserEntity;

public interface IUser {
	UserEntity loadUserbyUsername(String username,int status);
	UserEntity findUserById(int id);
	boolean save(UserEntity UserEntity);
}
