public class Expression_AssignmentExpression_001_T {

    public static void main(String[] args) {
        Expression_AssignmentExpression_001_T obj = new Expression_AssignmentExpression_001_T();
        obj.testcase1(SourceUtil.getSource());
    }

    public void testcase1(String[] cmd) {
        String[] b = {"a","b"};
        System.arraycopy(cmd,0,b,0,2);
        Runtime.getRuntime().exec(b[0]);
    }
}

class SourceUtil {
    public static String[] getSource() {
        return new String[]{"a","b"};
    }
}