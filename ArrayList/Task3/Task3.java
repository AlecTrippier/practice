import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> animalList = new ArrayList<String>();

        animalList.add("dog");
        animalList.add("cat");
        animalList.add("mouse");

        animalList.set(2, "hamster");

        for (int i=0; i < animalList.size(); i++){
            System.out.println("No." + (i + 1) + ":" + animalList.get(i));
            }
        }
    }

