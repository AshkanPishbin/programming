package exercise.week2.two.ex6;

import java.util.Scanner;

public class CoordinateGatherer {

    private Scanner scanner = new Scanner(System.in);

    public Coordinate gather() {
        System.out.print("Write the latitude of the coordinate: ");
        double latitude = scanner.nextDouble();
        System.out.print("Write the longitude of the coordinate: ");
        double longitude = scanner.nextDouble();
        return new Coordinate(latitude, longitude);
    }

}
