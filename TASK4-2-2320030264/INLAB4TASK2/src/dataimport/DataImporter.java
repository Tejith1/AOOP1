package dataimport;

public abstract class DataImporter {
    
    // Template method
    public final void importData() {
        readData();
        parseData();
        validateData();
        saveData();
    }
    
    // Steps in the template
    protected abstract void readData();
    protected abstract void parseData();
    protected void validateData() {
        System.out.println("Validating data...");
    }
    protected void saveData() {
        System.out.println("Saving data to the database...");
    }
}
