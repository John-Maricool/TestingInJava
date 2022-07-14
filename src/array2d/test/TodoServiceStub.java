package array2d.test;

import array2d.ToDoService;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements ToDoService {

    @Override
    public List<String> retrieveResult(String user) {
        return Arrays.asList("Learn spring MVC", "I need a spring for my door", "Wassup");
    }
}
