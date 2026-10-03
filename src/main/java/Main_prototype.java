import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import javafx.application.Application;


public class Main_prototype {
    public static void main(String[] args) {
        System.out.println("Hello, StackALife! The journey begins.");

        Task sTask = new Task("write an email",1);
        Task mTask = new Task("help your mother", 3);
        Task bTask = new Task("develop this app ", 10);



        List<Task> myStack = new ArrayList<>();
        
        myStack.add(sTask);
        myStack.add(mTask);
        myStack.add(bTask);


        myStack.sort(Comparator.comparingInt(t -> t.size));

        System.out.println("----current Tasks-----");
        for (Task t : myStack) {
            
            System.out.println("Task: "+t.title+"(size: "+ t.size+")");
        }


        
        
        


    }
}
