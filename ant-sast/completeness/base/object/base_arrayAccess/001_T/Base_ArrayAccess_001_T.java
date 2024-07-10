import javax.servlet.http.HttpServletRequest;

public class Base_ArrayAccess_001_T {
    public static void main(String[] args) {
        Base_ArrayAccess_001_T obj = new Base_ArrayAccess_001_T();
        MockHttpServletRequest request = new MockHttpServletRequest("method", "requestURI");
        request.addParameter("cmd", SourceUtil.getSource());

        obj.testcase("cmd", request);
    }

    public void testcase(String cmd, HttpServletRequest request) {
        try {
            String cmdStr = request.getParameterMap().get("cmd")[0];
            Runtime.getRuntime().exec(cmdStr);
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
