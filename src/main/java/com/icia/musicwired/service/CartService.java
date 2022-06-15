package com.icia.musicwired.service;

import java.util.List;

import org.springframework.web.servlet.ModelAndView;

import com.icia.musicwired.dto.CartDTO;

public interface CartService {

	List<CartDTO> cartListAdd(CartDTO cart);

	List<CartDTO> cartListDelete(CartDTO cart);

}
