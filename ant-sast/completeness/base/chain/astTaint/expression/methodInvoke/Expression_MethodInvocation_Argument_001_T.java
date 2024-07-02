public class Expression_MethodInvocation_Argument_001_T {

    public static void main(String[] args) {
        Expression_MethodInvocation_Argument_001_T obj = new Expression_MethodInvocation_Argument_001_T();
        obj.testcase1(SourceUtil.getSource());
    }

    public void testcase1(String cmd) {
        char[] chars= new char[]{0,0};
        cmd.getChars(0,2,chars,0);
        Runtime.getRuntime().exec(String.valueOf(chars));
    }
}

class SourceUtil {
    public static String getSource() {
        return "taint";
    }
}