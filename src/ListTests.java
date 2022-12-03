import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTests {
    public static void main(String[] args) {
        final int listLenght = 10;

        List<Integer> list = new LinkedList<>();

        for(int i = 0; i < listLenght; i++) {
            list.add(i);
        }

        list.remove(2);
        System.out.println(list);
    }
}
