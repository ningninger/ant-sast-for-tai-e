import java.util.HashMap;
import java.util.Map;

public class ObjectCanBeAssigned_003_F {

    public static void main(String[] args) {
        ObjectCanBeAssigned_003_F obj = new ObjectCanBeAssigned_003_F();
        obj.testcase(SourceUtil.getSource());
    }

    public void testcase(String cmd) {
        cmd = "ls";
        Runtime.getRuntime().exec(cmd);
    }

}