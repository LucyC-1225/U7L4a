import java.util.ArrayList;

public class LogMessage
{
    private String machineId;
    private String description;
    /** Precondition: message is a valid log message. */
    public LogMessage(String message)
    {
        int index = message.indexOf(":");
        machineId = message.substring(0, index);
        description = message.substring(index + 1);
    }
    /** Returns true if the description in this log message properly contains keyword;
     * false otherwise.
     */
    public boolean containsWord(String keyword)
    {
        ArrayList<String> list = new ArrayList<String>();
        int index = description.indexOf(" ");
        String temp = description;
        while (index != -1){
            list.add(temp.substring(0, index));
            temp = temp.substring(index + 1);
            index = temp.indexOf(" ");
        }
        list.add(temp);
        boolean contains = false;
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).equals(keyword)){
                contains = true;
            }
        }
        return contains;
    }
    public String getMachineId()
    { return machineId; }
    public String getDescription()
    { return description; }
}