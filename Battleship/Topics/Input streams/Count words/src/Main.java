import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputLine = reader.readLine();
        inputLine = inputLine.trim();
        reader.close();
        if (inputLine.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(inputLine.split("\\s+").length);
        }
    }
}