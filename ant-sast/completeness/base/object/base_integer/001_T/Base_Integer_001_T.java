public class Base_Integer_001_T {
    public static void main(String[] args) {
        Base_Integer_001_T obj = new Base_Integer_001_T();
        obj.testcase(SourceUtil.getSource());
    }

    public void testcase(Integer cmd) {
        if (cmd == null) {
            return;
        }
        SinkUtil.sink(cmd);
    }

}

class SourceUtil {
    public static Integer getSource() {
        return 1;
    }
}

class SinkUtil {
    public static void sink(Object param) {
    }
}