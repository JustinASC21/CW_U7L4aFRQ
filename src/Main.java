public class Main {
    public static void main(String[] args) {
        SystemLog sl = new SystemLog();
        for (LogMessage lm : sl.removeMessages("disk")) {
            System.out.println(lm.getMachineId() + ":" + lm.getDescription());
        }
    }
}
