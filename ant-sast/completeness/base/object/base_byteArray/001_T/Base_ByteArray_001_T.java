import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class Base_ByteArray_001_T {

    public static void main(String[] args) {
        Base_ByteArray_001_T obj = new Base_ByteArray_001_T();
        obj.testcase(SourceUtil.getSource());
    }

    public void testcase(byte[] cmd) {
        if (cmd == null || cmd.length < 1) {
            return;
        }
        SinkUtil.sink(cmd);
    }

}


class SourceUtil {
    public static byte[] getSource() {
        return new byte[]{1};
    }
}

class SinkUtil {
    public static void sink(Object param) {
    }
}