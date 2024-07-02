public class Base_StringBuffer_001_T {
    public static void main(String[] args) {
        Base_StringBuffer_001_T obj = new Base_StringBuffer_001_T();
        obj.testcase(SourceUtil.getSource());
    }

    public void testcase(String cmd) {
        if (cmd == null) {
            return;
        }

        StringBuffer data = new StringBuffer();
        data.append(cmd);

        Runtime.getRuntime().exec(data.toString());

    }
}

class SourceUtil {
    public static String getSource() {
        return "taint";
    }
}