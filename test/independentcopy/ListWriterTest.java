package independentcopy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ListWriterTest {
   private List<String> list = new ArrayList<>();
   private ListWriter addToNewList = new ListWriter(list);

    @Test
    public void getList() {
        assertEquals("Get list test",list,addToNewList.getList());
    }

    @Test
    public void writeln() {
        String line = "WriterTest";
        addToNewList.writeln(line);
        assertEquals("Testing write line","WriterTest",line);
    }
}