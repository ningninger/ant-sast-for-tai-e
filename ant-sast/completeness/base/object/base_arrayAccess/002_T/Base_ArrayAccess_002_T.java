import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class Base_ArrayAccess_002_T {

    public static void main(String[] args) {
        Base_ArrayAccess_002_T obj = new Base_ArrayAccess_002_T();
        obj.aTaintCase0111(SourceUtil.getSource());
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