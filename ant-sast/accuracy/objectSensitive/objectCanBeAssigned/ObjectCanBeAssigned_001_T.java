import java.util.HashMap;
import java.util.Map;

public class ObjectCanBeAssigned_001_T {

    public static void main(String[] args) {
        ObjectCanBeAssigned_001_T obj = new ObjectCanBeAssigned_001_T();
        obj.testcase(SourceUtil.getSource());
    }

    public void testcase(String cmd) {
        String exec = "ls";
        Runtime.getRuntime().exec(cmd);
    }

}