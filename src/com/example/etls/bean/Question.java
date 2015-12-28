package com.example.etls.bean;

public class Question {
	/*{
		 "title":"1.关于第一代无线通讯技术说法正确的是___",
		 "optiona":"A.简称1G，1994年出现",
		 "optionb":"B.模拟制式手机",
		 "optionc":"C.提供区域性语音业务",
		 "optiond":"D.通话效果差、保密性能不好，用户的接听范围有限",
		 "answer":"BCD",
		 "score":2,
		 "level":1
		}*/
	private String title;
	private String optiona;
	private String optionb;
	private String optionc;
	private String optiond;
	private String answer;
	private int score;
	private int level;
	
	public Question(){
		
	}
    public Question(String title,String optiona,String optionb,String optionc,String optiond,
    		String answer,int score,int level){
		this.title = title;
		this.optiona = optiona;
		this.optionb = optionb;
		this.optionc = optionc;
		this.optiond = optiond;
		this.answer = answer;
		this.score = score;
		this.level = level;
		
	 }
	public void setTitle(String title) {
		this.title = title;
	}
	public void setOptiona(String optiona) {
		this.optiona = optiona;
	}
	public void setOptionb(String optionb) {
		this.optionb = optionb;
	}
	public void setOptionc(String optionc) {
		this.optionc = optionc;
	}
	public void setOptiond(String optiond) {
		this.optiond = optiond;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	@Override
	public String toString() {
		return "this.title"+"\n"
				+"this.optiona"+"\n"
	        	+"this.optionb"+"\n"
		        +"this.optionc"+"\n"
		        +"this.optiond";
	}
	
}
