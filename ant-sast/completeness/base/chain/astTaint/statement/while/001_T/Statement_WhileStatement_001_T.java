public class Statement_WhileStatement_001_T {

    public static void main(String[] args) {
        Statement_WhileStatement_001_T obj = new Statement_WhileStatement_001_T();
        obj.testcase1(SourceUtil.getSource(), "mkdir");
    }

    public void testcase1(String cmd, String type) {
        String a ="mkdir";;
        while(StringUtils.equals(type,"mkdir")) {
            a = " "+ cmd;
        }
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

class StringUtils {
    public static boolean equals(String a, String b) {
        return a.equals(b);
    }
}