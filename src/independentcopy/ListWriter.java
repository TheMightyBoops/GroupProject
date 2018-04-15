package independentcopy;

import java.util.List;


/**
 * Give this class any sort of list of strings you want and you can add to the
 * end of the list.
 *
 * @version 1.0
 * @author lucas nolting
 */

public class ListWriter implements Writer {

    private List<String> listToWrite;

    ListWriter(List<String> ltw) {
        this.listToWrite = ltw;
    }

    // Allows the list to be exported and assigned outside of the class
    public List<String> getList() {
        return listToWrite;
    }

    // Actually appends to the list
    @Override
    public void writeln(String line) {
        listToWrite.add(line);
    }
}
