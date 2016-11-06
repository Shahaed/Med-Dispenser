
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Created by thomas on 11/5/16.
 */

public class csvFileRelated {

    private Patient patient1 = new Patient("Han", "Thomas", "1234ht", 2, "yellow");
    private Patient patient2 = new Patient("Hasan", "Shahaed", "987dfg", 1, "red");
    private Patient patient3 = new Patient("Taufalele", "Paul", "5730df", 3, "blue");
    private Patient[] patient = {patient1, patient2, patient3};
    private final Path orderCsvFileLocation = Paths.get("/home/thomas/Dropbox/patientData.csv");
    private String csvSplit = ",";
    private int counter = 0;

    public void loadFile()  throws IOException{
        System.out.println("Finding file at " + this.orderCsvFileLocation);
        if(Files.exists(this.orderCsvFileLocation))
            System.out.println("File found...");
        else System.out.println("File does not exist");
    }

    public void readFile() throws IOException{
        int i = 0;
        try (Scanner scanner = new Scanner(this.orderCsvFileLocation)) {
            while (scanner.hasNext()) {
                this.patient[i].setFirstName(scanner.nextLine());
                this.counter++;
                i++;
            }
        }
    }

    public void printFile() {
        for(int i = 0; i < counter; i++) {
            System.out.println(patient[i].getFirstName());
        }
    }

}
