public class Expression_BitOperation_001_T {

    public static void main(String[] args) {
        Expression_BitOperation_001_T obj = new Expression_BitOperation_001_T();
        obj.testcase1(SourceUtil.getSource());
    }

    public void testcase1(char cmd) {
        cmd= (char) (cmd<<1);
        Runtime.getRuntime().exec(String.valueOf(cmd));
    }
}

class SourceUtil {
    public static char getSource() {
        return 'a';
    }
}