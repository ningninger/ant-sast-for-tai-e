public class Base_Long_001_T {

    public static void main(String[] args) {
        Base_Long_001_T obj = new Base_Long_001_T();
        obj.testcase(SourceUtil.getSource());
    }

    public void testcase(long cmd) {
        SinkUtil.sink(cmd);
    }
}


class SourceUtil {
    public static long getSource() {
        return 1;
    }
}


class SinkUtil {
    public static void sink(Object param) {
    }
}