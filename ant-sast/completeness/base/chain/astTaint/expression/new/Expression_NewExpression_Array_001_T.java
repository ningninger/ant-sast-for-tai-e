public class Expression_NewExpression_Array_001_T {

    public static void main(String[] args) {
        Expression_NewExpression_Array_001_T obj = new Expression_NewExpression_Array_001_T();
        obj.testcase1(SourceUtil.getSource());
    }

    public void testcase1(String[] cmd) {
        String[] chars = new String[]{cmd[0],cmd[1]};
        Runtime.getRuntime().exec(chars);
    }
}

class SourceUtil {
    public static String[] getSource() {
        return new String[]{"a","b"};
    }
}