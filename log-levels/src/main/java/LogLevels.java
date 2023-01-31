public class LogLevels {
    
    public static String message(String logLine) {
        String noTrail = logLine.trim();
        String[] parts = noTrail.split(": ");
        return parts[1].trim();
    }

    public static String logLevel(String logLine) {
        String noTrail = logLine.trim();
        String[] parts = noTrail.split(": ");
        return parts[0].trim().substring(1, parts[0].length() - 1).toLowerCase();

    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
