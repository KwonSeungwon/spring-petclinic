package org.springframework.samples.petclinic.owner;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // 메소드 어노테이션설정
@Retention(RetentionPolicy.RUNTIME) // 런타임때 실행됨
public @interface LogExecutionTime  {

}
