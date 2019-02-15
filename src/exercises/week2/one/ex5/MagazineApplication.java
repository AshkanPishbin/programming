package exercise.week2.one.ex5;

import exercise.week2.one.ex1.Printer;

public class MagazineApplication {

    public static void main(String[] args) {
        Editor editor = new Editor();
        Magazine magazine = editor.writeMagazine();
        Printer printer = new Printer();
        printer.printMagazine(magazine);
    }

}
