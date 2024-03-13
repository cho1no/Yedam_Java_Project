package com.yedam.java.assignment240312;

public abstract class Culture {
	// 필드
	String name;
	int directorNum;
	int actorNum;
	int audienceNum;
	int totalScore;
	
	// 생성자
	Culture(String name, int directorNum, int actorNum){
		this.name = name;
		this.directorNum = directorNum;
		this.actorNum = actorNum;
	}
	
	// 메소드
	public void setTotalScore(int score) {
		if (score < 0) score = 0;
		if (score > 5) score = 5;
		this.audienceNum++;
		this.totalScore += score;
	}
	
	public String getGrade() {
		int grade = this.totalScore/this.audienceNum;
		grade = grade > 5 ? 5 : grade;
		String text = "";
		for (int i = 0; i < grade; i++) {
			text += "☆";
		}
		return text;
	}
	public abstract void getInformation();
}
