import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DifferentParamsForFunction_002_F {

    public static void main(String[] args)  {
        DifferentParamsForFunction_002_F obj = new DifferentParamsForFunction_002_F();
        obj.testcase(SourceUtil.getSource());
    }

    public void testcase(String cmd) {
        String exec = CmdUtil.getCmdWithContextSensitive(-1, cmd);
        try {
            Runtime.getRuntime().exec(exec);
        } catch (IOException e) {
            return;
        }
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
