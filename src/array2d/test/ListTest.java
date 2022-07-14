package array2d.test;

import org.junit.jupiter.api.Test;
import org.mockito.stubbing.OngoingStubbing;
import org.mockito.stubbing.Stubber;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {

    @Test
    public void test() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2);
        assertEquals(2, listMock.size());
    }

    @Test
    public void testListGetMethod() {
        List listMock = mock(List.class);
        when(listMock.get(anyInt())).thenReturn("Best");
        assertEquals("Best", listMock.get(3));
    }

    @Test
    public void testExceptions() {
        List listMock = mock(List.class);
        when(listMock.size()).thenThrow(new RuntimeException("Error"));
        assertThrows(RuntimeException.class, listMock::size);
    }
}
