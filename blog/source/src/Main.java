
public class Main {
    public static void main(String[] args) {
        try {
            Args arg = new Args("l,p#,d*", args);

            boolean logging = arg.getBoolean('l');
            int port = arg.getInt('d');
            String directory = arg.getString('d');
            executeApplication(logging, port, directory);
        } catch (Exception e) {

        }
    }

    private static void executeApplication(boolean logging, int port, String directory) {

    }
}
