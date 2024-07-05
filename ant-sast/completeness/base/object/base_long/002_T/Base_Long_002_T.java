public class Base_Long_002_T {

    public static void main(String[] args) {
        Base_Long_002_T obj = new Base_Long_002_T();
        obj.testcase(SourceUtil.getSource());
        //obj.testcase(null);
    }

    public void testcase(Long cmd) {
        if (cmd == null) {
            return;
        }

        SinkUtil.sink(cmd);
    }
}


class SourceUtil {
    public static Long getSource() {
        return 1;
    }
}


class SinkUtil {
    public static void sink(Object param) {
    }
}