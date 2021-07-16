package java_07_15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BulletinBoard {

	public static void main(String[] args) {
		System.out.println("===���α׷� ����===");

		Scanner sc = new Scanner(System.in);
		
		int lastArticleId = 0;

		List<Article> articles = new ArrayList<>(); // ������ġ ����

		while (true) {
			System.out.println("��ɾ� : ");
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
				System.out.printf("���� : ");
				String title = sc.nextLine();
				System.out.println("���� : ");
				String body = sc.nextLine();

				Article article = new Article(id, title, body); // �ٷ� ������ ���� �������� ���� article ����
				articles.add(article); // article�� ���� �������� articles �迭�� ����(����)

				System.out.printf("%d�� ���� �����Ǿ����ϴ�.\n", id);
			} else if (command.equals("article list")) {

				for (int i = 0; i < articles.size(); i++) {
					Article article = articles.get(i);
					if (lastArticleId > 0) {
						System.out.println(article.id + ". " + article.title);
					} else {
						System.out.println("�Խù��� �����ϴ�.");
					}
				}
			} else {
				System.out.printf("%s��(��) �������� �ʴ� ��ɾ��Դϴ�.\n", command);
			}
		}
		sc.close();
		System.out.println("===���α׷� ��===");
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