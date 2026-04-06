package DAY13;

import java.util.ArrayList;
import java.util.Arrays;

public class DupList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 2, 3, 4, 5, 7, 4, 8, 4, 9));
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) == list.get(j) && i != j) {
                    list.remove(j);
                }
            }
        }
        System.out.println(list);
    }
}
