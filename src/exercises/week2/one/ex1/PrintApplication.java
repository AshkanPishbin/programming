package exercise.week2.one.ex1;

public class PrintApplication {

    public static void main(String[] args) {
        Article article = new Article("NACS opens a new hummus restaurant", "The hummus there is delicious!");
        Printer printer = new Printer();
        printer.print(article);
    }

}
