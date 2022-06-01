package cypher.auspicode;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public final class App {
    private App() {
    }

    public static void main(String[] args) {

        CypherElements elements = new CypherElements();
        CypherMethod strMethod = new CypherMethod();
        // This recieves the key/value pairs processed by the method 'mixKeys'
        Map<String, String> map = strMethod.mixKeys(elements.getArrList(), 20);

        // Creates a new file if it doesn't exist and writes the cypher in it, prints
        // the cypher in the console
        try {
            FileWriter myWriter = new FileWriter("cypher_a");
            // Iterates through the map containing the cypher
            for (Map.Entry<String, String> element : map.entrySet()) {
                // Prints the key/value pair to the console
                System.out.println(element.getKey() + " " + element.getValue());
                // Writes the key/value pair to the file
                myWriter.write(element.getKey() + " " + element.getValue() + "\n");
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
