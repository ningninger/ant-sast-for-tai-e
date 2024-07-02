import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DifferentParamsForFunction_001_F {

    public static void main(String[] args) {
        DifferentParamsForFunction_001_F obj = new DifferentParamsForFunction_001_F();
        obj.testcase(SourceUtil.getSource());
    }

    public void testcase(String cmd) {
        String exec = CmdUtil.getCmdWithContextSensitive(-1, cmd);
        Runtime.getRuntime().exec(exec);
    }

}

class SourceUtil {
    public static String getSource() {
        return "taint";
    }
}

class CmdUtil {

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
