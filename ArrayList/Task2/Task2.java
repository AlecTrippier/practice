import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> animalList = new ArrayList<String>();

        animalList.add("dog");
        animalList.add("cat");
        animalList.add("mouse");

        animalList.set(2, "hamster");
    }
}
