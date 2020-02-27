import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * URL_Ex class
 * @author Chelsea Li
 */
class URL_Ex {
    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) throws Exception {
        URL oracle = new URL("https://docs.oracle.com/javase/8/docs/api/java/io/BufferedReader.html");
        BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));

        String inputLine;
       
       	//Printing out the website's HTML code
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
        }

        in.close();
    }
}
