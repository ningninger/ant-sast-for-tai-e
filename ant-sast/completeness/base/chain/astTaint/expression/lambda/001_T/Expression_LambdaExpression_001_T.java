import java.io.IOException;

public class Expression_LambdaExpression_001_T {

    public static void main(String[] args) {
        Expression_LambdaExpression_001_T obj = new Expression_LambdaExpression_001_T();
        obj.testcase1(SourceUtil.getSource());
    }

    public void testcase1(String cmd) {
        try {
            Runnable r = () -> {
                try {
                    Runtime.getRuntime().exec(cmd);
                } catch (IOException e) {
                    return;
                }
            };
            r.run();
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