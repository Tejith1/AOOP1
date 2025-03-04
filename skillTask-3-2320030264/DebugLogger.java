class DebugLogger extends Logger {
    public DebugLogger() {
        super(LogLevel.DEBUG);
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("[DEBUG]: " + message);
    }
}
