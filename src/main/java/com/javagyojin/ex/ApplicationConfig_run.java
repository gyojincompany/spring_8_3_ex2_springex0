package com.javagyojin.ex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("run")
public class ApplicationConfig_run {
	
	@Bean
	public ServerInfo serverInfo() {
		
		ServerInfo sInfo = new ServerInfo();
		
		sInfo.setIpNumber("211.90.118.156");
		sInfo.setPortNumber("80");
		
		return sInfo;
	}
}
