import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    static void main() {
        ArrayList<String> myArr = new ArrayList<>();

        myArr.add("David");
        myArr.add("Oluwapelumi");
        myArr.add("Happy");

        Iterator<String> iterator = myArr.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
