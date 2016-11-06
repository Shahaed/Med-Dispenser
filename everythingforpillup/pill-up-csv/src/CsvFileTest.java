import java.io.IOException;

/**
 * Created by thomas on 10/29/16.
 */

public class CsvFileTest {
    public static void main(String[] args) throws IOException{
        csvFileRelated readOrders = new csvFileRelated();
        readOrders.loadFile();
        readOrders.readFile();
        readOrders.printFile();
        
    }
}