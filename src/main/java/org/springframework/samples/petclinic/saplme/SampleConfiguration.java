package org.springframework.samples.petclinic.saplme;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//직접 빈(Bean)을 등록하는 방법
@Configuration
public class SampleConfiguration {

	@Bean
	public SampleControllerTest sampleControllerTest() { //@Bean 어노테이션을 이용해 직접 JavaConfiguration을 이용해 @Bean 설정
		return new SampleControllerTest();
	}


}
