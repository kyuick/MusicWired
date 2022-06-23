package com.icia.musicwired.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.icia.musicwired.dto.CartDTO;
import com.icia.musicwired.service.CartService;

@Controller
public class CartController {
	
	private ModelAndView mav = new ModelAndView();
	
	@Autowired
	private CartService cartsvc;
	
	List<CartDTO> cartList = new ArrayList<CartDTO>();
	
//	cartListAdd : 장바구니에 상품 추가하는 메소드
	@PostMapping("cartListAdd")
	public @ResponseBody List<CartDTO> cartListAdd(@ModelAttribute CartDTO cart) {
		System.out.println("[1] 장바구니 상품 추가 C : " + cart);
		
		cartList = cartsvc.cartListAdd(cart);
		
		System.out.println("[4] 장바구니 상품 추가 C : " + mav);
		
		return cartList;
	}
	
//	cartListDelete : 장바구니에 있는 상품 삭제하는 메소드
	@PostMapping("cartListDelete")
	public @ResponseBody List<CartDTO> cartListDelete(@ModelAttribute CartDTO cart){
		System.out.println("[1] 장바구니 상품 삭제 C : " + cart);
		cartList = cartsvc.cartListDelete(cart);
		System.out.println("[4] 장바구니 상품 삭제 C : " + cartList);
		return cartList;
	}
	
//	CartInCheck : 장바구니에 이미 담았는지 확인하는 메소드
	@PostMapping("CartInCheck")
	public @ResponseBody List<CartDTO> CartInCheck(@ModelAttribute CartDTO cart){
		System.out.println("[1] 장바구니 확인 C : " + cart);
		cartList = cartsvc.CartInCheck(cart);
		System.out.println("[4] 장바구니 확인 C : " + cartList);
		return cartList;
	}

}
