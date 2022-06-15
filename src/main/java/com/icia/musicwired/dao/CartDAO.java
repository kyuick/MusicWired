package com.icia.musicwired.dao;

import org.apache.ibatis.annotations.Mapper;

import com.icia.musicwired.dto.CartDTO;

@Mapper
public interface CartDAO {

	int cartListAdd(CartDTO cart);

	int cartListDelete(CartDTO cart);

}
