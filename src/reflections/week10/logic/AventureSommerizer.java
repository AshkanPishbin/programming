//package reflections.week10.logic;
//
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class AventureSommerizer {
//
//    private List<String> lines = new AdventureReader().getLine();
//
//    public void displayNumberOfWords() {
//
//        long count = lines.stream()
//                .map(e -> e.split(" "))
//                .flatMap(Stream::of)
//                .count();
//        System.out.println(count);
//    }
//
//
//    public void displayNumberOfDistinctWord() {
//
//        long count = lines.stream()
//                .map(e -> e.split(" "))
//                .flatMap(Stream::of)
//                .distinct()
//                .count();
//        System.out.println(count);
//
//    }
//
//    public void displayLongestWord() {
//
//        lines.stream()
//                .collect(Collectors.groupingBy(e -> Integer.valueOf(e.length()), Collectors.toList()
//
//    }
//}
//
