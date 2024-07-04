public class Statement_DoStatement_001_T {

    public static void main(String[] args) {
        Statement_DoStatement_001_T obj = new Statement_DoStatement_001_T();
        obj.testcase1(SourceUtil.getSource());
    }

    public void testcase1(String cmd) {
        String a ="mkdir";
        int i = 10;

        do {
            a = cmd + "|";
            i++;
        }while (i<20);

        try {
            Runtime.getRuntime().exec(a);
        } catch (Exception e) {
            return;
        }
    }
}

class SourceUtil {
    public static String getSource() {
        return "taint";
    }
}