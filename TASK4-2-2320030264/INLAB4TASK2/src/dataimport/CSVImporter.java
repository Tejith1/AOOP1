package dataimport;

public class CSVImporter extends DataImporter {

    @Override
    protected void readData() {
        System.out.println("Reading CSV file...");
    }

    @Override
    protected void parseData() {
        System.out.println("Parsing CSV data...");
    }
}
