package javatpoint.CIWithCollectionDependentObjects;

import java.util.List;

public class Question {
    private int id;
    private String name;
    private List<Answer> answers;

    public Question(){}

    public Question(int id, String name, List<Answer> answers) {
        this.id = id;
        this.name = name;
        this.answers = answers;
    }

    public void displayInfo(){
        System.out.println(id+" "+name+"\nanswers are: ");
        answers.stream().forEach(System.out::println);
    }
}
