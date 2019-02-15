package exercise.week2.one.ex3;

public class Derek {

    private Tool tool;

    public void hangPainting() {
        if (canHangPainting()) {
            System.out.println("I will hang the painting.");
        } else {
            System.out.println("I'm missing the hammer.");
        }
    }

    private boolean canHangPainting() {
        return tool != null && tool.getName().equals("Hammer");
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }
}
