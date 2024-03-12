package com.yedam.java.assignment240312;

public class Performance extends Culture{
	String genre;
	
	Performance(String name, int directorNum, int actorNum, int audienceNum, int score, String genre) {
		super(name, directorNum, actorNum, audienceNum, score);
		this.genre = genre;
	}

	@Override
	public void getInformation() {
		System.out.println("공연제목 : " + super.name);
		System.out.println("감독 : " + super.directorNum);
		System.out.println("배우 : " + super.actorNum);
		System.out.println("관객수 : " + super.audienceNum);
		System.out.println("총점 : " + super.totalScore);
		System.out.println("평점 : " + super.getGrade());
	}

}
