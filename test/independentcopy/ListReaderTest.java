package independentcopy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ListReaderTest {
   private List<String> list = new ArrayList<>();
   private ListWriter addToNewList = new ListWriter(list);
   private ListReader readTheList = new ListReader(addToNewList.getList());

    @Test
    public void readln() {
        addToNewList.writeln("Test1");
        assertEquals("Test1 ",readTheList.readln());
    }
}