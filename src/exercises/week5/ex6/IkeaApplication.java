package exercises.week5.ex6;

public class IkeaApplication {

    public static void main(String[] args) {
        WardrobeBuilder builder = new WardrobeBuilder();
        Wardrobe wardrobe = builder.build();
        System.out.println(wardrobe);
    }

}
