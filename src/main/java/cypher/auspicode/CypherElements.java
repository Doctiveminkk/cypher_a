package cypher.auspicode;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class CypherElements {

  // Original LinkedHashMap with all characters
  private Map<Integer, String> map = new LinkedHashMap<>();
  // LinkedHashMaps for diferent types of characters
  private Map<Integer, String> letersMap = new LinkedHashMap<>();
  private Map<Integer, String> bigLetersMap = new LinkedHashMap<>();
  private Map<Integer, String> numbersMap = new LinkedHashMap<>();
  private Map<Integer, String> simbolsMap = new LinkedHashMap<>();
  // ArrayList with the maps above so its easy to pass them to functions in
  // 'StringMethod' class
  private ArrayList<Map<Integer, String>> arrList = new ArrayList<>();

  // Constructor
  public CypherElements() {
    populateMap();
    splitMap(map);
    createArrayList();
  }

  // Getters
  public Map<Integer, String> getLetersMap() {
    return letersMap;
  }

  public ArrayList<Map<Integer, String>> getArrList() {
    return arrList;
  }

  public Map<Integer, String> getBigLetersMap() {
    return bigLetersMap;
  }

  public Map<Integer, String> getNumbersMap() {
    return numbersMap;
  }

  public Map<Integer, String> getSimbolsMap() {
    return simbolsMap;
  }

  public Map<Integer, String> getMap() {
    return map;
  }

  // Constructor Methods
  // Create original map
  private void populateMap() {
    map.put(1, "a");
    map.put(2, "b");
    map.put(3, "c");
    map.put(4, "d");
    map.put(5, "e");
    map.put(6, "f");
    map.put(7, "g");
    map.put(8, "h");
    map.put(9, "i");
    map.put(10, "j");
    map.put(11, "k");
    map.put(12, "l");
    map.put(13, "m");
    map.put(14, "n");
    map.put(15, "o");
    map.put(16, "p");
    map.put(17, "q");
    map.put(18, "r");
    map.put(19, "s");
    map.put(20, "t");
    map.put(21, "u");
    map.put(22, "v");
    map.put(23, "w");
    map.put(24, "x");
    map.put(25, "y");
    map.put(26, "z");
    map.put(27, ".");
    map.put(28, ",");
    map.put(29, ":");
    map.put(30, ";");
    map.put(31, "!");
    map.put(32, "?");
    map.put(33, "/");
    map.put(34, "\\");
    map.put(35, "(");
    map.put(36, ")");
    map.put(37, "{");
    map.put(38, "}");
    map.put(39, "[");
    map.put(40, "]");
    map.put(41, "+");
    map.put(42, "0");
    map.put(43, "1");
    map.put(44, "2");
    map.put(45, "3");
    map.put(46, "4");
    map.put(47, "5");
    map.put(48, "6");
    map.put(49, "7");
    map.put(50, "8");
    map.put(51, "9");
  }

  // Populate the other maps acording to character type (letter, consonant, vowel,
  // number or simbol)
  private void splitMap(Map<Integer, String> map) {
    for (Map.Entry<Integer, String> m : map.entrySet()) {
      if (m.getValue().matches("[aeiou]")) {
        letersMap.put(m.getKey(), m.getValue());
        bigLetersMap.put(m.getKey(), m.getValue().toUpperCase());
      } else if (m.getValue().matches("[b-df-hj-np-tv-z]")) {
        letersMap.put(m.getKey(), m.getValue());
        bigLetersMap.put(m.getKey(), m.getValue().toUpperCase());
      } else if (m.getValue().matches("[0-9]")) {
        numbersMap.put(m.getKey(), m.getValue());
      } else {
        simbolsMap.put(m.getKey(), m.getValue());
      }
    }
  }

  // Populate ArrayList with all maps but the original one
  private void createArrayList() {
    arrList.add(simbolsMap);
    arrList.add(letersMap);
    arrList.add(bigLetersMap);
    arrList.add(numbersMap);
  }

}