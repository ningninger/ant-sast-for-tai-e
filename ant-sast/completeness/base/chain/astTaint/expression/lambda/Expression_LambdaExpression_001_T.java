public class Expression_LambdaExpression_001_T {

    public static void main(String[] args) {
        Expression_LambdaExpression_001_T obj = new Expression_LambdaExpression_001_T();
        obj.testcase1(SourceUtil.getSource());
    }

    public void testcase1(String cmd) {
        Runnable r = () -> {
            Runtime.getRuntime().exec(cmd);
        };
        r.run();
    }

}

class SourceUtil {
    public static String getSource() {
        return "taint";
    }
}