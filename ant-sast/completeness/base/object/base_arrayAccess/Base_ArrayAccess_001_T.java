import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;


public class Base_ArrayAccess_001_T {
    public static void main(String[] args) {
        Base_ArrayAccess_001_T obj = new Base_ArrayAccess_001_T();
        obj.testcase(SourceUtil.getSource());
    }

    public void testcase(String cmd, HttpServletRequest request) {
        String cmdStr = request.getParameterMap().get(cmd)[0];
        Runtime.getRuntime().exec(cmdStr);
    }
}


class SourceUtil {
    public static String getSource() {
        return "taint";
    }

}