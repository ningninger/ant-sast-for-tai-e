public class Base_CharArray_001_T {
    public static void main(String[] args) {
        Base_CharArray_001_T obj = new Base_CharArray_001_T();
        obj.testcase(SourceUtil.getSource());
        //obj.testcase(null);
    }

    public void testcase(char[] cmd) {
        if (cmd == null && cmd.length < 1) {
            return;
        }

        char[] data = {(char) cmd[0], 2};
        SinkUtil.sink(data);
    }

}

class SourceUtil {
    public static char[] getSource() {
        return new char[]{'t','a','i','n','t'};
    }
}

class SinkUtil {
    public static void sink(Object param) {
    }
}