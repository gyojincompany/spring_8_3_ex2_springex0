package com.javagyojin.ex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class ApplicationConfig_dev {
	
	@Bean
	public ServerInfo serverInfo() {
		
		ServerInfo sInfo = new ServerInfo();
		
		sInfo.setIpNumber("localhost");
		sInfo.setPortNumber("8181");
		
		return sInfo;
	}
}
