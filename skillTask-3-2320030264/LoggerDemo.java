public class LoggerDemo {
    public static void main(String[] args) {
        Logger loggerChain = LoggerChain.getChainOfLoggers();

        loggerChain.logMessage(LogLevel.INFO, "Application started.");
        loggerChain.logMessage(LogLevel.DEBUG, "Debugging connection issue.");
        loggerChain.logMessage(LogLevel.ERROR, "System crashed due to an unknown error!");
    }
}
