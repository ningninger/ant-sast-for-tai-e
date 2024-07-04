
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Base_Char_002_T {
    public static void main(String[] args) {
        Base_Char_002_T obj = new Base_Char_002_T();
        obj.testcase(SourceUtil.getSource());
    }

    public void testcase(Character cmd) {
        if (cmd == null) {
            return;
        }
        SinkUtil.sink(cmd);
    }
}


class SourceUtil {
    public static Character getSource() {
        return 't';
    }
}

class SinkUtil {
    public static void sink(Object param) {
    }
}