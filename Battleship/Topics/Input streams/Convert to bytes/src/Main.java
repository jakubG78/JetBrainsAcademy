import java.io.InputStream;

class Main {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        byte[] inputAsArray = inputStream.readAllBytes();
        inputStream.close();
        for(byte each : inputAsArray){
            System.out.print(each);
        }
    }
}