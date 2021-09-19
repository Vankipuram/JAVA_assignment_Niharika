package com.cap.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {
	private int questionId;
	private String question;
	
	private List<String> answers1;
	
	private Set<String> answers2;
	
	 private Map<Integer, String> answers3;
	
	
	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<String> getAnswers1() {
		return answers1;
	}

	public void setAnswers1(List<String> answers1) {
		this.answers1 = answers1;
	}

	public Set<String> getAnswers2() {
		return answers2;
	}

	public void setAnswers2(Set<String> answers2) {
		this.answers2 = answers2;
	}

	public Map<Integer, String> getAnswers3() {
		return answers3;
	}

	public void setAnswers3(Map<Integer, String> answers3) {
		this.answers3 = answers3;
	}

	public void display1() {
    System.out.println(" questionId : " +questionId+"\n question : "+question+"\n answer : "+answers1);
		
	}
	
	public void display2() {
	System.out.println(" questionId : " +questionId+"\n question : "+question+"\n answer : "+answers2);
			
    }
	
	public void display3() {
     System.out.println(" questionId : " +questionId+"\n question : "+question+"\n answer : "+answers3);
			
    }
	

}
