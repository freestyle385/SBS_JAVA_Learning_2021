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
	
//	exam4�� ���� ȿ������ ����. �� �����ϱ�!
	static void exam4() {
		List<Article> articles = new ArrayList<>(); // ���� Ÿ�� ����, List ��ƿ�ε� ��� ����
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
		ArrayList<Article> articles = new ArrayList<Article>(); // ���ʿ� Ÿ�� ��������. �� �� ������ �� ���� => exam4 
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
		ArrayList articles = new ArrayList(); // �迭�� ��� ���� �󸶳� ������ �� �� ���
		articles.add(new Article()); // articles.add
		articles.add(new Article()); 
		articles.add(new Article()); 
		articles.add(new Article());

		for (int i = 0; i < articles.size(); i++) { // articles.size ���������� �迭 ���� ���� ����
			Article article = (Article) articles.get(i); // get�� �� �� ��������ȯ �ʿ� => ���� �غ��� ���� exam3
			System.out.println(article.id);
		}
	}

	static void exam1() {
		int articlesSize = 0;
		Article[] articles = new Article[100]; // �ǹ����� �迭 ���� ���ϱ� ����� => ���� �غ��� ���� exam2

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
	} // static�� ������ �޼ҵ�. ���ʿ� �ѹ� �����.

	Article() {
		this(LastId + 1, "2021-12-12 12:12:12" + LastId); // �Ʒ� Article �޼ҵ� ���࿡ ����
		LastId++;
	}

	Article(int id, String regDate) {
		this.id = id;
		this.regDate = regDate;
	}
}
