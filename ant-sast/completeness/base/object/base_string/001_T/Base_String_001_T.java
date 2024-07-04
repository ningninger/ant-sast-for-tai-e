public class Base_String_001_T {

    public static void main(String[] args) {
        Base_String_001_T obj = new Base_String_001_T();
        obj.testcase(SourceUtil.getSource());
        //obj.testcase(null);
    }

    public void testcase(String cmd) {
        if (cmd == null) {
            return;
        }
        Runtime.getRuntime().exec(cmd);
    }
}

class SourceUtil {
    public static String getSource() {
        return "taint";
    }
}

class SinkUtil {
    public static void sink(Object param) {
    }
}

