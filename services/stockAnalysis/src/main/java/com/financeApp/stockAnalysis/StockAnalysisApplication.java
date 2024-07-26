package com.financeApp.stockAnalysis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//@EnableJpaAuditing(auditorAwareRef = "auditorAware") //method in the config bean
@EnableAsync
@EnableScheduling
public class StockAnalysisApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockAnalysisApplication.class, args);
	}

}
