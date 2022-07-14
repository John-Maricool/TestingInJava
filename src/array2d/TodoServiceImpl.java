package array2d;

import java.util.ArrayList;
import java.util.List;

public class TodoServiceImpl {
    private ToDoService toDoService;

    public TodoServiceImpl(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    public List<String> retrieveContents(String user) {
        List<String> result = toDoService.retrieveResult(user);
        List<String> springContents = new ArrayList<>();
        for(String content: result){
            if (content.contains("spring")){
                springContents.add(content);
            }
        }
        return springContents;
    }
}
