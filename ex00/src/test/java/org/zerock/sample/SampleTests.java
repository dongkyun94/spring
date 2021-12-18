package org.zerock.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
/*테스트 코드가 스프링을 실행하는 역할을 할 것이라는 어노테이션*/
@RunWith(SpringJUnit4ClassRunner.class) 

/*지정된 클래스나 문자열을 이용해 필요한 객체들을 스프링 내에 객체로 등록함*/
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class SampleTests {
	
	@Setter(onMethod_ = {@Autowired})
	private Restaurant restaurant;
	
	/*Junit에서 테스트 대상을 표시 하는 어노테이션*/
	@Test
	public void testExist() {
		
		assertNotNull(restaurant); /*restraunt변수가 not null 이어야 테스트 성공*/
		
		log.info(restaurant);
		log.info("-----------------------------");
		log.info(restaurant.getChef());
	}

}
