public class Expression_MethodInvocation_001_T {

        public static void main(String[] args) {
            Expression_MethodInvocation_001_T obj = new Expression_MethodInvocation_001_T();
            obj.testcase1(SourceUtil.getSource());
        }

        public void testcase1(String cmd) {
            CmdUtil.run(cmd+"|grep a");
        }
}

class SourceUtil {
    public static String getSource() {
        return "taint";
    }
}

public class CmdUtil {

    public static void run(String cmd) {
        try {
            Runtime.getRuntime().exec(cmd);
        }catch (Exception e) {
            return;
        }
    }

    public static String getCmdWithContextSensitive(int x, String cmd) {
        String res;
        if (x > 0) {
            res = cmd;
        }
        else {
            res = "ls";
        }
        return res;
    }
}
