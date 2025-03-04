class ErrorLogger extends Logger {
    public ErrorLogger() {
        super(LogLevel.ERROR);
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("[ERROR]: " + message);
    }
}
