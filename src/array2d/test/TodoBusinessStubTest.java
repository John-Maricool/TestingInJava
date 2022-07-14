package array2d.test;

import array2d.ToDoService;
import array2d.TodoServiceImpl;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TodoBusinessStubTest {

    @Test
    public void testRetrieveTodosRelatedToSpring_usingStub() {
        ToDoService toDoService = new TodoServiceStub();
        TodoServiceImpl todoServiceImpl = new TodoServiceImpl(toDoService);
        List<String> filtered = todoServiceImpl.retrieveContents("Dummy");
        assertEquals(2, filtered.size());
    }
}
