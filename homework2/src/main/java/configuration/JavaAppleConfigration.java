package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import controller.AppleController;
import dao.AppleDaoImpl;
import service.AppleServiceImpl;

@Configuration
public class JavaAppleConfigration {
	@Bean
	public AppleDaoImpl getAppleDaoImpl() {
		return new AppleDaoImpl();
	}
	
	@Bean
	public AppleServiceImpl getAppleServiceImpl() {
		AppleServiceImpl as = new AppleServiceImpl();
		as.setAppleDao(getAppleDaoImpl());
		return as;
	}
	
	@Bean
	public AppleController getAppleController() {
		AppleController ac = new AppleController();
		ac.setAppleService(getAppleServiceImpl());
		return ac;
	}
	
}
