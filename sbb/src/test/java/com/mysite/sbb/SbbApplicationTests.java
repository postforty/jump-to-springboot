package com.mysite.sbb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import jakarta.transaction.Transactional;

@SpringBootTest
class SbbApplicationTests {
	
	@Autowired
	private QuestionRepository questionRepository;
	
	@Autowired
	private AnswerRepository answerRepository;

	@Transactional
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
//		Optional<Question> oq = this.questionRepository.findById(1);
//		System.out.println(oq.isPresent()); // true
//        if(oq.isPresent()) {
//            Question q = oq.get();
//            assertEquals("sbb�� �����ΰ���?", q.getSubject());
//        }
		
//		Question q = this.questionRepository.findBySubject("sbb�� �����ΰ���?");
//        assertEquals(1, q.getId());
		
//		 Question q = this.questionRepository.findBySubjectAndContent(
//	                "sbb�� �����ΰ���?", "sbb�� ���ؼ� �˰� �ͽ��ϴ�.");
//		 assertEquals(1, q.getId());
		
//		List<Question> qList = this.questionRepository.findBySubjectLike("sbb%");
//        Question q = qList.get(0);
//        assertEquals("sbb�� �����ΰ���?", q.getSubject());
		
//		Optional<Question> oq = this.questionRepository.findById(1);
//        assertTrue(oq.isPresent());
//        Question q = oq.get();
//        q.setSubject("������ ����");
//        this.questionRepository.save(q);
		
//		assertEquals(2, this.questionRepository.count());
//        Optional<Question> oq = this.questionRepository.findById(1);
//        assertTrue(oq.isPresent());
//        Question q = oq.get();
//        this.questionRepository.delete(q);
//        assertEquals(1, this.questionRepository.count());
		
//		�亯 ���
//		Optional<Question> oq = this.questionRepository.findById(2);
//        assertTrue(oq.isPresent());
//        Question q = oq.get();
//
//        Answer a = new Answer();
//        a.setContent("�� �ڵ����� �����˴ϴ�.");
//        a.setQuestion(q);  // � ������ �亯���� �˱����ؼ� Question ��ü�� �ʿ��ϴ�.
//        a.setCreateDate(LocalDateTime.now());
//        this.answerRepository.save(a);
		
//		�亯 ��ȸ
//		Optional<Answer> oa = this.answerRepository.findById(1);
//        assertTrue(oa.isPresent());
//        Answer a = oa.get();
//        assertEquals(2, a.getQuestion().getId());
		
//        �������� �亯 ã��
		Optional<Question> oq = this.questionRepository.findById(2);
        assertTrue(oq.isPresent());
        Question q = oq.get();

        List<Answer> answerList = q.getAnswerList();

        assertEquals(1, answerList.size());
        assertEquals("�� �ڵ����� �����˴ϴ�.", answerList.get(0).getContent());
		
		
	}
}
