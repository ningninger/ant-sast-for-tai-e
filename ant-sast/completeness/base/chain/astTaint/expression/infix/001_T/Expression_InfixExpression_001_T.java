public class Expression_InfixExpression_001_T {

        public static void main(String[] args) {
            Expression_InfixExpression_001_T obj = new Expression_InfixExpression_001_T();
            obj.testcase1(SourceUtil.getSource());
        }

        public void testcase1(String cmd) {
            String a = cmd+"a";
            try {
                Runtime.getRuntime().exec(a);
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