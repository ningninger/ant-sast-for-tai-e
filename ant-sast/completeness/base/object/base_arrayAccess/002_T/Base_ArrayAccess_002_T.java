import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;


public class Base_ArrayAccess_002_T {

    public static void main(String[] args) {
        Base_ArrayAccess_002_T obj = new Base_ArrayAccess_002_T();
        MockHttpServletRequest request = new MockHttpServletRequest("method", "requestURI");
        request.addCookie(SourceUtil.getSource(), "taint");
        obj.testcase(request);
    }

    public void testcase(HttpServletRequest request) {
        try {
            Cookie[] cookies = request.getCookies();
            Runtime.getRuntime().exec(cookies[0].getName());
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
