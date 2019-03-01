package at.nacs.rockscissorspaiper.model;

public interface Move {

    String getName();

    boolean defeats(Move move);

}

