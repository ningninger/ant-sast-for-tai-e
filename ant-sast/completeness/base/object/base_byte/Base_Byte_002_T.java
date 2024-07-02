import java.util.HashMap;
import java.util.Map;


public class Base_Byte_002_T {

    public static void main(String[] args) {
        Base_Byte_002_T obj = new Base_Byte_002_T();
        obj.testcase(SourceUtil.getSource());
    }

    public void testcase(Byte cmd) {
        SinkUtil.sink(cmd);
    }
}



class SourceUtil {
    public static Byte getSource() {
        return 1;
    }
}

class SinkUtil {
    public static void sink(Object param) {
    }
}