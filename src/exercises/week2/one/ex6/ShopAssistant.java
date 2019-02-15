package exercise.week2.one.ex6;

import exercise.week2.one.ex3.Tool;

import java.util.List;

public class ShopAssistant {

    public Toolbox findToolbox(String color, List<String> toolNames) {
        Toolbox toolbox = new Toolbox(color);
        for (String toolName : toolNames) {
            Tool tool = new Tool(toolName);
            toolbox.add(tool);
        }
        return toolbox;
    }

}
