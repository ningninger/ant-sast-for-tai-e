public class Statement_VariableDeclarationStatement_001_T {

    public static void main(String[] args) {
        Statement_VariableDeclarationStatement_001_T obj = new Statement_VariableDeclarationStatement_001_T();
        obj.testcase1(SourceUtil.getSource());
    }

    public void testcase1(String cmd) {
        char[] data = cmd.toCharArray();
        Runtime.getRuntime().exec(new String(data));
    }
}

class SourceUtil {
    public static String getSource() {
        return "taint";
    }
}