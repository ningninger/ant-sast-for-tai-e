import java.io.IOException;

public class Base_String_001_T {

    public static void main(String[] args) {
        Base_String_001_T obj = new Base_String_001_T();
        obj.testcase(SourceUtil.getSource());
    }

    public void testcase(String cmd) {
        if (cmd == null) {
            return;
        }
        try {
            Runtime.getRuntime().exec(cmd);
        } catch (IOException e) {
            return;
        }

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

