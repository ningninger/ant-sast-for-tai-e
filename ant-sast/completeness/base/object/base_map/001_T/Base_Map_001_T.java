import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class Base_Map_001_T {

    public static void main(String[] args) {
        Base_Map_001_T obj = new Base_Map_001_T();
        obj.testcase(SourceUtil.getSource());
        //obj.testcase(null);
        //obj.testcase(new HashMap<String, String>());
    }


    public void testcase(Map<String, String> cmd) {
        if (cmd == null || cmd.isEmpty() {
            return;
        }
        SinkUtil.sink(cmd);
    }
}

class SourceUtil {
    public static Map<String, String> getSource() {
        return new HashMap<String, String>();
    }
}

class SinkUtil {
    public static void sink(Object param) {
    }
}