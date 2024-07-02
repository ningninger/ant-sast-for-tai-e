import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public DifferentIfBranch_002_F {
    public static void main(String[] args) {
        DifferentIfBranch_002_F obj = new DifferentIfBranch_002_F();
        obj.testcase(SourceUtil.getSource());
    }

    public void testcase(String cmd) {
        String exec = getCmdWithPathSensitive(cmd);
        Runtime.getRuntime().exec(exec);
    }

    private String getCmdWithPathSensitive(String cmd) {
        int x = -1;
        if (x > 0) {
            return cmd;
        }
        else {
            return "ls";
        }
    }
}

class SourceUtil {
    public static String getSource() {
        return "taint";
    }
}