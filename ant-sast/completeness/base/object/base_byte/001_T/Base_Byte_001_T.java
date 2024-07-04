import java.util.HashMap;
import java.util.Map;


public class Base_Byte_001_T {
    public static void main(String[] args) {
        Base_Byte_001_T obj = new Base_Byte_001_T();
        obj.testcase(SourceUtil.getSource());
    }

    public void testcase(byte cmd) {
        try {
            SinkUtil.sink(cmd);
        } catch (Exception e) {
            return;
        }
    }

}

class SourceUtil {
    public static byte getSource() {
        return 1;
    }
}

class SinkUtil {
    public static void sink(Object param) {
    }
}