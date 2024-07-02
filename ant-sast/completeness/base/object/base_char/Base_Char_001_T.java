import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Base_Char_001_T {
    public static void main(String[] args) {
        Base_Char_001_T obj = new Base_Char_001_T();
        obj.testcase(SourceUtil.getSource());
    }

    public void testcase(char cmd) {
        SinkUtil.sink(cmd);
    }
}







class SourceUtil {
    public static char getSource() {
        return 't';
    }
}

class SinkUtil {
    public static void sink(Object param) {
    }
}