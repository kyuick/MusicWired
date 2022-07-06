package com.icia.musicwired.service;

import java.util.List;

import com.icia.musicwired.dto.CartDTO;

public interface CartService {

	List<CartDTO> cartListAdd(CartDTO cart);

	List<CartDTO> cartListDelete(CartDTO cart);

	List<CartDTO> CartInCheck(CartDTO cart);

	List<CartDTO> ajaxCartList(String mId);

}
