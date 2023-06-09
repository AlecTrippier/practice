import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

class Task7 {
    public static void main(String[] args) {
        // 練習問題-1
        List<String> animalList = new ArrayList<String>();
        animalList.add("dog");
        animalList.add("cat");
        animalList.add("mouse");

        // 練習問題-2
        animalList.set(2, "hamster");

        // 練習問題-3
        for (int i = 0; i < animalList.size(); i++) {
            System.out.println("No." + (i + 1) + ":" + animalList.get(i));
        }

        // 練習問題-4
        Map<String, String> dogDetails = new HashMap<String, String>();
        dogDetails.put("name", "コタロー");
        dogDetails.put("type", "ブルテリア");

        Map<String, String> catDetails = new HashMap<String, String>();
        catDetails.put("name", "コジロー");
        catDetails.put("type", "マンチカン");

        Map<String, String> hamsterDetails = new HashMap<String, String>();
        hamsterDetails.put("name", "ハムタロー");
        hamsterDetails.put("type", "キンクマ");

        // 練習問題-5
        System.out.println(dogDetails.get("name") + "(" + dogDetails.get("type") + ")");

        // 練習問題-6
        dogDetails.replace("type", "ボルゾイ");

        //　練習問題-7
        Map<String, Map<String, String>> animalDetails = new HashMap<String, Map<String, String>>();
        animalDetails.put(animalList.get(0), new HashMap<String, String>(dogDetails));
        animalDetails.put(animalList.get(1), new HashMap<String, String>(catDetails));
        animalDetails.put(animalList.get(2), new HashMap<String, String>(hamsterDetails));

        System.out.println(animalDetails);
    }

}