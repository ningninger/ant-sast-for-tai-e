public class Expression_PrefixExpression_001_T {

    public static void main(String[] args) {
        Expression_PrefixExpression_001_T obj = new Expression_PrefixExpression_001_T();
        obj.testcase1(SourceUtil.getSource());
    }

    public void testcase1(int cmd) {
        try {
            ++cmd;
            Runtime.getRuntime().exec(String.valueOf(cmd));
        } catch (Exception e) {
            return;

        }
    }
}

class SourceUtil {
    public static int getSource() {
        return 1;
    }
}

