public class Statement_CastStatement_001_T {

    public static void main(String[] args) {
        Statement_CastStatement_001_T obj = new Statement_CastStatement_001_T();
        obj.testcase1(SourceUtil.getSource());
    }

    public void testcase1(String cmd) {
        Object cmdObject = new Object();
        cmdObject = cmd;
        Runtime.getRuntime().exec((String) cmdObject);
    }
}

class SourceUtil {
    public static String getSource() {
        return "taint";
    }
}