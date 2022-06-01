package cypher.auspicode;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class CypherMethod {

  // Create new cypher based on random values concatenated together a fixed
  // number of times
  public Map<String, String> mixKeys(ArrayList<Map<Integer, String>> mapArr, int reps) {
    // Final map
    Map<String, String> mixedMap = new LinkedHashMap<>();
    // Loop through diferent maps with diferent types of characters (lowercase
    // letters, uppercase letters, numbers and simbols)
    for (int i = 0; i < mapArr.size(); i++) {
      // Loop through each map character and assign a new random key
      for (Map.Entry<Integer, String> m : mapArr.get(i).entrySet()) {
        mixedMap.put(addChar(mapArr, reps), m.getValue());
      }
    }
    return mixedMap;
  }

  // Concatenate characters picked randomly from 3 different maps using the
  // repetitions defined in previous method
  private String addChar(ArrayList<Map<Integer, String>> map, int reps) {
    // First character of new key initializes the variable
    String newKey = selectChar(map.get((int) (Math.random() * map.size())));
    // Concatenates remainig characters according to defined reps
    for (int i = 0; i < reps - 1; i++) {
      newKey = newKey + selectChar(map.get((int) (Math.random() * map.size())));
    }
    return newKey;
  }

  // Picks one random value from one previously selected map (lowercase letters,
  // uppercase letters and simbols)
  private String selectChar(Map<Integer, String> map) {
    Object[] arr = map.values().toArray();
    return (String) arr[(int) (Math.random() * arr.length)];
  }
}
