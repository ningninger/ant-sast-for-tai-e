public class Expression_CallExpression_Array_001_T {

    public static void main(String[] args) {
        Expression_CallExpression_Array_001_T obj = new Expression_CallExpression_Array_001_T();
        obj.testcase1(SourceUtil.getSource());
    }

    public void testcase1(String cmd) {
        try {
            char[] chars = cmd.toCharArray();
            Runtime.getRuntime().exec(chars.toString());
        } catch (Exception e) {
            return;
        }
    }
}

class SourceUtil {
    public static String getSource() {
        return "taint";
    }
}