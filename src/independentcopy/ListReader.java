package independentcopy;

import java.io.IOException;
import java.util.List;

/**
 * Give this class any sort of list of strings you want and
 * it will spit out the contents into a string.
 *
 * @version 1.0
 * @author lucas nolting
 */




public class ListReader implements Reader {

    private List<String> listToBeRead;

    ListReader(List<String> ltbr) {
        this.listToBeRead = ltbr;
    }


    @Override
    public String readln() {
        String outputStringOfList="";


        for (String listItem: listToBeRead) {
            // as it iterates it adds the last string to the end and
            // puts a space between them.
            outputStringOfList = outputStringOfList + listItem + " ";
        }

        return outputStringOfList;
    }
}


