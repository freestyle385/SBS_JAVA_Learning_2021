package java_07_15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BulletinBoard {

	public static void main(String[] args) {
		System.out.println("===프로그램 시작===");

		Scanner sc = new Scanner(System.in);
		
		int lastArticleId = 0;

		List<Article> articles = new ArrayList<>(); // 저장장치 생성

		while (true) {
			System.out.println("명령어 : ");
			String command = sc.nextLine().trim();

			if (command.length() == 0) {
				continue;
			}
			if (command.equals("system exit")) {
				break;
			}
			if (command.equals("article write")) {

				int id = lastArticleId + 1;
				lastArticleId = id;
				System.out.printf("제목 : ");
				String title = sc.nextLine();
				System.out.println("내용 : ");
				String body = sc.nextLine();

				Article article = new Article(id, title, body); // 바로 위에서 만든 정보들을 담을 article 생성
				articles.add(article); // article이 받은 정보들을 articles 배열에 저장(생성)

				System.out.printf("%d번 글이 생성되었습니다.\n", id);
			} else if (command.equals("article list")) {

				for (int i = 0; i < articles.size(); i++) {
					Article article = articles.get(i);
					if (lastArticleId > 0) {
						System.out.println(article.id + ". " + article.title);
					} else {
						System.out.println("게시물이 없습니다.");
					}
				}
			} else {
				System.out.printf("%s는(은) 존재하지 않는 명령어입니다.\n", command);
			}
		}
		sc.close();
		System.out.println("===프로그램 끝===");
	}

}

class Article {
	int id;
	String title;
	String body;

	public Article(int id, String title, String body) {
		this.id = id;
		this.title = title;
		this.body = body;
	}
}