public class Main {
    public static void main(String[] args) {
        LogMessage message1 = new LogMessage("CLIENT3:security alert ");
        LogMessage message2 = new LogMessage(":DISK");
        LogMessage message3 = new LogMessage(":error on disk3");
        LogMessage message4 = new LogMessage(":error on /dev/disk");
        LogMessage message5 = new LogMessage(":disk");
        LogMessage message6 = new LogMessage(":error on disk");
        LogMessage message7 = new LogMessage(":error on /dev/disk disk");
        LogMessage message8 = new LogMessage(":error on disk /dev/disk");

        System.out.println(message1.getMachineId());
        System.out.println(message1.getDescription());
        System.out.println(message1.containsWord("alert"));
        System.out.println(message2.containsWord("disk"));
        System.out.println(message3.containsWord("disk"));
        System.out.println(message4.containsWord("disk"));
        SystemLog log = new SystemLog();
        log.addLogMessage(message1);
        log.addLogMessage(message2);
        log.addLogMessage(message3);
        log.addLogMessage(message4);
        System.out.println(log.removeMessages("disk"));
        log.addLogMessage(message5);
        log.addLogMessage(message6);
        log.addLogMessage(message7);
        log.addLogMessage(message8);
        System.out.println(log.removeMessages("disk"));
    }
}
