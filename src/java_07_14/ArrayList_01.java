package java_07_14;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_01 {

	public static void main(String[] args) {
//		exam1();
//		exam2();
//		exam3();
		exam4();
	}
	
//	exam4가 가장 효율적인 버전. 꼭 숙지하기!
	static void exam4() {
		List<Article> articles = new ArrayList<>(); // 뒤의 타입 생략, List 유틸로도 사용 가능
		articles.add(new Article()); // 0
		articles.add(new Article()); // 1
		articles.add(new Article()); // 2
		articles.add(new Article()); // 3

		for (int i = 0; i < articles.size(); i++) {
			Article article = articles.get(i); 
			System.out.println(article.id);
		}
	}
	
	static void exam3() {
		ArrayList<Article> articles = new ArrayList<Article>(); // 애초에 타입 지정해줌. 좀 더 생략할 수 있음 => exam4 
		articles.add(new Article()); // 0
		articles.add(new Article()); // 1
		articles.add(new Article()); // 2
		articles.add(new Article()); // 3

		for (int i = 0; i < articles.size(); i++) {
			Article article = articles.get(i); 
			System.out.println(article.id);
		}
	}
	
	static void exam2() {
		ArrayList articles = new ArrayList(); // 배열의 요소 수를 얼마나 넣을지 모를 때 사용
		articles.add(new Article()); // articles.add
		articles.add(new Article()); 
		articles.add(new Article()); 
		articles.add(new Article());

		for (int i = 0; i < articles.size(); i++) { // articles.size 리모콘으로 배열 길이 산출 가능
			Article article = (Article) articles.get(i); // get할 때 꼭 강제형변환 필요 => 단점 극복을 위한 exam3
			System.out.println(article.id);
		}
	}

	static void exam1() {
		int articlesSize = 0;
		Article[] articles = new Article[100]; // 실무에서 배열 수를 정하기 어려움 => 단점 극복을 위한 exam2

		articles[0] = new Article();
		articlesSize++;
		articles[1] = new Article();
		articlesSize++;
		articles[2] = new Article();
		articlesSize++;

		for (int i = 0; i < articlesSize; i++) {
			System.out.println(articles[i].id);
		}
	}

}

class Article {
	static int LastId;
	int id;
	String regDate;
	static {
		LastId = 0;
	} // static의 생성자 메소드. 최초에 한번 실행됨.

	Article() {
		this(LastId + 1, "2021-12-12 12:12:12" + LastId); // 아래 Article 메소드 실행에 영향
		LastId++;
	}

	Article(int id, String regDate) {
		this.id = id;
		this.regDate = regDate;
	}
}
