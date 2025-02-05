package dataimport;

public class Main {
    public static void main(String[] args) {
        DataImporter csvImporter = new CSVImporter();
        DataImporter xmlImporter = new XMLImporter();
        DataImporter jsonImporter = new JSONImporter();

        System.out.println("Importing CSV File:");
        csvImporter.importData();

        System.out.println("\nImporting XML File:");
        xmlImporter.importData();

        System.out.println("\nImporting JSON File:");
        jsonImporter.importData();
    }
}
