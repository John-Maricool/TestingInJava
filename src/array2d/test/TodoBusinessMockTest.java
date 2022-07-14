package array2d.test;

import array2d.ToDoService;
import array2d.TodoServiceImpl;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TodoBusinessMockTest {

    @Test
    public void testRetrieveTodosRelatedToSpring_usingMock() {
        ToDoService toDoServiceMock = mock(ToDoService.class);
        List<String> results = Arrays.asList("Learn spring MVC", "I need a spring for my door", "Wassup");

        when(toDoServiceMock.retrieveResult("Dummy")).thenReturn(results);
        TodoServiceImpl todoServiceImpl = new TodoServiceImpl(toDoServiceMock);
        List<String> filtered = todoServiceImpl.retrieveContents("Dummy");
        assertEquals(2, filtered.size());
    }
}
