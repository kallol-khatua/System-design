public class ChainOfResponsibilityDesign {
    public static void main(String[] args) {
        LogProcessor logProcessorObj = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessorObj.log(LogProcessor.ERROR, "Error occurred");
        logProcessorObj.log(LogProcessor.INFO, "Info message");
        logProcessorObj.log(LogProcessor.DEBUG, "Debug this");
        logProcessorObj.log(9, "Unknown");
    }
}
