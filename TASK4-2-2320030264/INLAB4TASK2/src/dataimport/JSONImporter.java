package dataimport;

public class JSONImporter extends DataImporter {

    @Override
    protected void readData() {
        System.out.println("Reading JSON file...");
    }

    @Override
    protected void parseData() {
        System.out.println("Parsing JSON data...");
    }
}
