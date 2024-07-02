public class Statement_DoStatement_001_T {

    public static void main(String[] args) {

    }

    public void testcase1(String cmd) {
        String a ="mkdir";
        int i = 10;

        do {
            a= cmd+"|";
            i++;
        }while (i<20);

        Runtime.getRuntime().exec(a);
    }
}

class SourceUtil {
    public static String getSource() {
        return "taint";
    }
}