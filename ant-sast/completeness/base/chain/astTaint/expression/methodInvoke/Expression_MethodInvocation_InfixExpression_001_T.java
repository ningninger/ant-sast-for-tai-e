public class Expression_MethodInvocation_InfixExpression_001_T {

    public static void main(String[] args) {
        Expression_MethodInvocation_InfixExpression_001_T obj = new Expression_MethodInvocation_InfixExpression_001_T();
        obj.testcase1(SourceUtil.getSource());
    }

    public void testcase1(String cmd) {
        CmdUtil.run(cmd+ HttpUtil.doGet("www.test.com"));
    }
}

class SourceUtil {
    public static String getSource() {
        return "taint";
    }
}

class CmdUtil {
    public static void run(String cmd) {
        Runtime.getRuntime().exec(cmd);
    }
}