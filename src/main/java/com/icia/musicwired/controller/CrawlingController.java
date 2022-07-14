package com.icia.musicwired.controller;


	

	import java.io.IOException;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.icia.musicwired.service.CrawlingService;

import lombok.Setter;

	@Controller
	@RequestMapping("/crawling")
	public class CrawlingController {

		
		@Setter(onMethod_ = @Autowired)
		private CrawlingService service;
		
		
		@GetMapping(value = "/save")
		public void getGenieDatas() throws IOException {
						
			String url[]= {
					"https://soundcloud.com/discover/sets/charts-top:hiphoprap:kr"
			};
			
//			System.out.println("url 주소"+url);
			
			for(int i=0; i<url.length; i++) {
				service.insert(url[i]);
			}
			
			

		
	  }
		
	
		
}
