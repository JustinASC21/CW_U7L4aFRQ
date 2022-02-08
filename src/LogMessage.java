public class LogMessage
{
    private String machineId;
    private String description;
    /** Precondition: message is a valid log message. */
    public LogMessage(String message)
    {
        this.machineId = message.substring(0,message.indexOf(":"));
        this.description = message.substring(message.indexOf(":") + 1);

    }
    /** Returns true if the description in this log message properly contains keyword;
     * false otherwise.
     */
    public boolean containsWord(String keyword) {
        String newDesc = " " + description + " ";
        if (newDesc.contains(keyword) && newDesc.contains(" disk "))
        {
            return true;
        }
        else {
            return false;
        }
    }
    public String getMachineId()
    { return machineId; }
    public String getDescription()
    { return description; }
// There may be instance variables, constructors, and methods that are not shown.
}