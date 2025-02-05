package logger;
public class Client {
    public static void main(String[] args) {
        // Create handlers
        InfoHandler infoHandler = new InfoHandler();
        DebugHandler debugHandler = new DebugHandler();
        ErrorHandler errorHandler = new ErrorHandler();

        // Configure the chain of responsibility
        infoHandler.setNextHandler(debugHandler);
        debugHandler.setNextHandler(errorHandler);

        // Create logger
        Logger logger = new Logger();

        // Create and add commands
        logger.addCommand(new LogCommand(infoHandler, LogLevel.INFO));
        logger.addCommand(new LogCommand(debugHandler, LogLevel.DEBUG));
        logger.addCommand(new LogCommand(errorHandler, LogLevel.ERROR));

        // Process commands
        logger.processCommands();
    }
}


