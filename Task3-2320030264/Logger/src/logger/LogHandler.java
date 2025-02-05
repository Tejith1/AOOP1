package logger;

//LogHandler.java
public abstract class LogHandler {
    protected LogHandler nextHandler;

    public void setNextHandler(LogHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

 public void handleRequest(LogLevel level, String message) {
     if (canHandle(level)) {
         log(message);
     } else if (nextHandler != null) {
         nextHandler.handleRequest(level, message);
     }
 }

 protected abstract boolean canHandle(LogLevel level);
 protected abstract void log(String message);
}


