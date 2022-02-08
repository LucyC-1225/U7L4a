import java.util.ArrayList;

public class SystemLog {
    private ArrayList<LogMessage> messageList = new ArrayList<LogMessage>();
    public void addLogMessage(LogMessage log){
        messageList.add(log);
    }
    public ArrayList<LogMessage> removeMessages(String keyword){
        ArrayList<LogMessage> removed = new ArrayList<LogMessage>();
        for (int i = 0; i < messageList.size(); i++){
            if (messageList.get(i).containsWord(keyword)){
                removed.add(messageList.get(i));
                messageList.remove(i);
                i--;
            }
        }
        return removed;
    }
}
