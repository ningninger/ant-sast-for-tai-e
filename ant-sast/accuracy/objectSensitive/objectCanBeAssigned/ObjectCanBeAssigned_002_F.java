import java.util.HashMap;
import java.util.Map;

public class ObjectCanBeAssigned_002_F {

    public static void main(String[] args) {
        ObjectCanBeAssigned_002_F obj = new ObjectCanBeAssigned_002_F();
        obj.testcase(SourceUtil.getSource());
    }

    public void testcase(String cmd) {
        String exec = "ls";
        Runtime.getRuntime().exec(exec);
    }

}