public class Expression_PostfixExpression_001_T {

    public static void main(String[] args) {
        Expression_PostfixExpression_001_T obj = new Expression_PostfixExpression_001_T();
        obj.testcase1(SourceUtil.getSource());
    }

    public void testcase1(int cmd) {
        cmd++;
        Runtime.getRuntime().exec(String.valueOf(cmd));
    }
}

class SourceUtil {
    public static int getSource() {
        return 1;
    }
}
