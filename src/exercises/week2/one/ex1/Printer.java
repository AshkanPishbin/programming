package exercise.week2.one.ex1;

import exercise.week2.one.ex5.Magazine;

import java.util.List;

public class Printer {

    public void print(Article article) {
        System.out.println("Article title: " + article.getTitle());
        System.out.println("Article text: " + article.getText());
    }

    public void printMagazine(Magazine magazine) {
        System.out.println("Magazine title: " + magazine.getTitle());
        List<Article> articles = magazine.getArticles();
        for (Article article : articles) {
            print(article);
        }
    }
}
