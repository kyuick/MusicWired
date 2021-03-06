package com.icia.musicwired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

public class MusicWiredApplication {

	public static void main(String[] args) {
		SpringApplication.run(MusicWiredApplication.class, args);
	}

}
