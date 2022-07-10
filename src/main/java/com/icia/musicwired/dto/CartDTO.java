package com.icia.musicwired.dto;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Alias("Cart")
public class CartDTO {
	
	private int carCode;
	private String caMid;
	private int caMuCode;
	private int caAmount;
	public int getCarCode() {
		return carCode;
	}
	public void setCarCode(int carCode) {
		this.carCode = carCode;
	}
	public String getCaMid() {
		return caMid;
	}
	public void setCaMid(String caMid) {
		this.caMid = caMid;
	}
	public int getCaMuCode() {
		return caMuCode;
	}
	public void setCaMuCode(int caMuCode) {
		this.caMuCode = caMuCode;
	}
	public int getCaAmount() {
		return caAmount;
	}
	public void setCaAmount(int caAmount) {
		this.caAmount = caAmount;
	}

	
}
