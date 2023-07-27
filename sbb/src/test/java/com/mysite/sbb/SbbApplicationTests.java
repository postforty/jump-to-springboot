package com.mysite.sbb;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SbbApplicationTests {
	
	@Autowired
	private QuestionRepository questionRepository;

	@Test
	void testJpa() {
//		Question q1 = new Question();
//		q1.setSubject("sbb가 무엇인가요?");
//		q1.setContent("sbb에 대해서 알고 싶습니다.");
//		q1.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q1);
//		
//		Question q2 = new Question();
//		q2.setSubject("스프링부트 모델 질문입니다.");
//		q2.setContent("id는 자동으로 생성되나요?");
//		q2.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q2);
		
//		List<Question> all = this.questionRepository.findAll();
//		assertEquals(2, all.size()); // assertEquals(기대값, 실제값)와 같이 사용하고 기대값과 실제값이 동일한지를 조사
//		
//		Question q = all.get(0);
//		assertEquals("sbb가 무엇인가요?", q.getSubject());
		
//		Optional은 null 처리를 유연하게 처리하기 위해 사용하는 클래스로 위와 같이 isPresent로 null이 아닌지를 확인한 후에 get으로 실제 Question 객체 값을 얻어야 한다.
		Optional<Question> oq = this.questionRepository.findById(1);
		System.out.println(oq.isPresent()); // true
        if(oq.isPresent()) {
            Question q = oq.get();
            assertEquals("sbb가 무엇인가요?", q.getSubject());
        }
	}
}
