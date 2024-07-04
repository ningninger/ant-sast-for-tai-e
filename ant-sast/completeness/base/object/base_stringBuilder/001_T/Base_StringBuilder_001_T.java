public class Base_StringBuilder_001_T {

    public static void main(String[] args) {
        Base_StringBuilder_001_T obj = new Base_StringBuilder_001_T();
        obj.testcase(SourceUtil.getSource());
    }

    public void testcase(String cmd) {
        if (cmd == null) {
            return;
        }

        StringBuilder data = new StringBuilder();
        data.append(cmd);

        Runtime.getRuntime().exec(data.toString());

    }
}

class SourceUtil {
    public static String getSource() {
        return "taint";
    }
}