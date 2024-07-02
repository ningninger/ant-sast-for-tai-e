public class Expression_AssignmentExpression_002_T {

    public static void main(String[] args) {
        Expression_AssignmentExpression_002_T obj = new Expression_AssignmentExpression_002_T();
        obj.testcase1(SourceUtil.getSource());
    }

    public void testcase1(String cmd) {
        String a = cmd;
        Runtime.getRuntime().exec(a);
    }

}

class SourceUtil {
    public static String getSource() {
        return "taint";
    }
}