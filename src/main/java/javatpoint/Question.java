package javatpoint;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Question {
    private int id;
    private String name;
    private List<String> answers;

    public Question(){}

    public Question(int id, String name, List<String> answers) {
        super();
        this.id = id;
        this.name = name;
        this.answers = answers;
    }
    public void displayInfo(){
        System.out.println(id+ "" + name);
        System.out.println("aswers are: ");
        answers.stream().forEach(System.out::println);
//        Iterator<String> iterate=answers.iterator();
//        iterate.forEachRemaining(System.out::println);
//        while(iterate.hasNext()){
//            System.out.println(iterate.next();
//        }
    }
}
