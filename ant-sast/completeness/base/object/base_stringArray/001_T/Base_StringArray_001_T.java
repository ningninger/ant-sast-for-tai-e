import java.io.IOException;
public class Base_StringArray_001_T {

    public static void main(String[] args) {
        Base_StringArray_001_T obj = new Base_StringArray_001_T();
        obj.testcase(SourceUtil.getSource());
    }

    public void testcase(String[] cmd) {
        if (cmd == null || cmd.length < 1) {
            return;
        }
        try {
            Runtime.getRuntime().exec(cmd[0]);
        }
        catch (IOException e) {
            return;
        }
    }
}

class SourceUtil {
    public static String[] getSource() {
        return new String[]{"taint"};
    }
}