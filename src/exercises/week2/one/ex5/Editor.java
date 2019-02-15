package exercise.week2.one.ex5;

import exercise.week2.one.ex1.Article;

public class Editor {

    public Magazine writeMagazine() {
        Magazine magazine = new Magazine("Best magazine ever");
        magazine.add(new Article("Next week's weather", "Bad, as usual."));
        magazine.add(new Article("Any developers out there?", "I'll ask again in 9 months."));
        magazine.add(new Article("What is really the moon?", "Something you wouldn't believe."));
        return magazine;
    }

}
