import java.util.HashMap;
import java.util.Map;

public class AssignedByFixedValue_001_F {

    public static void main(String[] args) {
        AssignedByFixedValue_001_F obj = new AssignedByFixedValue_001_F();
        obj.testcase(SourceUtil.getSource());
    }

    public void testcase(String cmd) {
        try {
            cmd = "ls";
            Runtime.getRuntime().exec(cmd);
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