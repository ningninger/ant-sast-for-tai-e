public class Expression_MethodInvocation_MethodInvocation_001_T {

    public static void main(String[] args) {
        Expression_MethodInvocation_MethodInvocation_001_T obj = new Expression_MethodInvocation_MethodInvocation_001_T();
        obj.testcase1(SourceUtil.getSource());
    }

    public void testcase1(String cmd) {

        try {
            StringBuilder builder = new StringBuilder();
            builder.append(cmd.toUpperCase());
            Runtime.getRuntime().exec(builder.toString());
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