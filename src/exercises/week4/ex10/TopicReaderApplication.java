package exercise.week4.ex10;

import exercise.week4.ex7.Topic;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TopicReaderApplication {

    public static void main(String[] args) {
        TopicReader reader = new TopicReader();
        List<Topic> topics = reader.asList();
        for (Topic topic : topics) {
            System.out.println("Topic list: " + topic);
        }
        Set<Topic> topicSet = new HashSet<>(topics);
        for (Topic topic : topicSet) {
            System.out.println("Topic set: " + topic);
        }
    }

}
