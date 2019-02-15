package reflections.week09;

import java.util.List;
import java.util.stream.Collectors;

public class StudentReader {
    public List<Students> getStudents() {
        return new FileReader().asStream("reflections/students-performance.csv")
                .skip(1)
                .map(s -> s.split(";"))
                .map(s -> new Students(s[0], s[1], Integer.valueOf(s[2]), Integer.valueOf(s[3]), Integer.valueOf(s[4])))
                .collect(Collectors.toList());

    }
}
