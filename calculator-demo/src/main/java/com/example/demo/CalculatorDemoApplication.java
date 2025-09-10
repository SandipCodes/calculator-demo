package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class CalculatorDemoApplication {

	public static void main(String[] args) {
		
        //final Logger log=LoggerFactory.getLogger(CalculatorDemoApplication.class);
        
        System.out.println("\n\n\n");
       // log.info("In main()--------");
        log.info("In main()--------");
        

        
       
		SpringApplication.run(CalculatorDemoApplication.class, args);
		
		System.out.println("In main()");
	}

}
