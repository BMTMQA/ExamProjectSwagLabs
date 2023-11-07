package baseSwagLabs;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.testng.annotations.DataProvider;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class DataProviders {

    @DataProvider(name = "readUsersLoginDataFromCsv")
    public Object[][] readUsersLoginDataFromCsv() {
        try {
            CSVReader csvReader = new CSVReader(new FileReader("src/test/resources/correctUsersLoginData.csv"));
            List<String[]> csvData = csvReader.readAll();
            Object[][] csvDataObj = new Object[csvData.size()][2];

            for (int i = 0; i < csvData.size(); i++) {
                csvDataObj[i] = csvData.get(i);
            }
            return csvDataObj;
        } catch (IOException e) {
            System.out.println("Not possible to find the CSV file!");
            return null;
        } catch (CsvException e) {
            System.out.println("Not possible to work with the CSV file!");
            return null;
        }
    }

    @DataProvider (name = "getWrongUsersLoginData" )
    public Object [] [] getWrongUsersLoginData(){
        return new Object[][]{
                {"wrong userName", "secret_sauce"},
                {"standard_user", "wrong password"},
                {"wrong userName", "wrong password"}
        };
    }

    @DataProvider(name = "readClientsDataFromCsv")
    public Object[][] readClientsDataFromCsv() {
        try {
            CSVReader csvReader = new CSVReader(new FileReader("src/test/resources/clientsData.csv"));
            List<String[]> csvData = csvReader.readAll();
            Object[][] csvDataObj = new Object[csvData.size()][3];

            for (int i = 0; i < csvData.size(); i++) {
                csvDataObj[i] = csvData.get(i);
            }
            return csvDataObj;
        } catch (IOException e) {
            System.out.println("Not possible to find the CSV file!");
            return null;
        } catch (CsvException e) {
            System.out.println("Not possible to work with the CSV file!");
            return null;
        }
    }
}

