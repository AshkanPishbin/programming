package exercise.week2.one.ex5;

import exercise.week2.one.ex1.Article;

import java.util.ArrayList;
import java.util.List;

public class Magazine {

    private String title;
    private List<Article> articles = new ArrayList<>();

    public Magazine(String title) {
        this.title = title;
    }

    public void add(Article article) {
        articles.add(article);
    }

    public String getTitle() {
        return title;
    }

    public List<Article> getArticles() {
        return articles;
    }
}
