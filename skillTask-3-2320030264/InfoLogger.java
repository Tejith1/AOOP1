class InfoLogger extends Logger {
    public InfoLogger() {
        super(LogLevel.INFO);
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("[INFO]: " + message);
    }
}
