import java.util.HashMap;
import java.util.Map;

public class AssignedByFixedValue_002_T {

    public static void main(String[] args) {
        AssignedByFixedValue_002_T obj = new AssignedByFixedValue_002_T();
        obj.testcase(SourceUtil.getSource());
    }

    public void testcase(String cmd) {
        Runtime.getRuntime().exec(cmd);
    }

}

class SourceUtil {
    public static String getSource() {
        return "taint";
    }
}
