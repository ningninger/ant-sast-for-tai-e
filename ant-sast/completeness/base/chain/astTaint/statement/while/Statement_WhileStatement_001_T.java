public class Statement_WhileStatement_001_T {

    public static void main(String[] args) {
        Statement_WhileStatement_001_T obj = new Statement_WhileStatement_001_T();
        obj.testcase1(SourceUtil.getSource());
    }

    public void testcase1(String cmd) {
        String a ="mkdir";;
        while(StringUtils.equals(type,"mkdir")) {
            a = " "+ cmd;
        }
        Runtime.getRuntime().exec(a);
    }
}

class SourceUtil {
    public static String getSource() {
        return "taint";
    }
}