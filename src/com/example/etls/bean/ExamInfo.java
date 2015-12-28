package com.example.etls.bean;

public class ExamInfo {
 /*	{
		 "course":"android",
		 "total":20,
		 "time":10,
		 "question":"android.json"
		}*/
	private String course;
	private int total;
	private int time;
	private String question;
	private User user;
	public ExamInfo (){
		
	}
    public ExamInfo (String course,int total,int time,String question,User user){
		this.course = course;
		this.total = total;
		this.time = time;
		this.question = question;
		this.user = user;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "ExamInfo [考试科目：" + this.course + ","
				+ " 考题数量：" + this.total + ","
				+ "考生时间：" + this.time + "]";
	}

	
    
}
