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
//		q1.setSubject("sbb�� �����ΰ���?");
//		q1.setContent("sbb�� ���ؼ� �˰� �ͽ��ϴ�.");
//		q1.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q1);
//		
//		Question q2 = new Question();
//		q2.setSubject("��������Ʈ �� �����Դϴ�.");
//		q2.setContent("id�� �ڵ����� �����ǳ���?");
//		q2.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q2);
		
//		List<Question> all = this.questionRepository.findAll();
//		assertEquals(2, all.size()); // assertEquals(��밪, ������)�� ���� ����ϰ� ��밪�� �������� ���������� ����
//		
//		Question q = all.get(0);
//		assertEquals("sbb�� �����ΰ���?", q.getSubject());
		
//		Optional�� null ó���� �����ϰ� ó���ϱ� ���� ����ϴ� Ŭ������ ���� ���� isPresent�� null�� �ƴ����� Ȯ���� �Ŀ� get���� ���� Question ��ü ���� ���� �Ѵ�.
		Optional<Question> oq = this.questionRepository.findById(1);
		System.out.println(oq.isPresent()); // true
        if(oq.isPresent()) {
            Question q = oq.get();
            assertEquals("sbb�� �����ΰ���?", q.getSubject());
        }
	}
}
