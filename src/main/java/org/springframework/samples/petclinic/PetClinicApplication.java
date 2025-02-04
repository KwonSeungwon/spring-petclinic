/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.samples.petclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * PetClinic Spring Boot Application.
 *
 * @author Dave Syer
 */
@SpringBootApplication(proxyBeanMethods = false) // 하위 패키지 내의 모든 빈등록 어노테이션을 찾기시작함.
public class PetClinicApplication {

	public static void main(String[] args) { // String symbol관련 에러가 날시 인텔리제이에서 project
												// structure JDK 버전을 맞춰주면 됨.
		SpringApplication.run(PetClinicApplication.class, args);
	}

}
