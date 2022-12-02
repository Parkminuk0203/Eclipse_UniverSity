package report;

public class Movie {
	String name = "은밀하게 위대하게";
	double score = 3.4;
	String director = "장철수";
	int year = 2013;
	
	void print() {
		System.out.println("제목 : " + name);
		System.out.println("평점 : " + score);
		System.out.println("감독 : " + director);
		System.out.println("년도 : " + year);
	}
}
