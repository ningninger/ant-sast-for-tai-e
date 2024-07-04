import java.util.HashMap;
import java.util.Map;

public class Base_ArrayAccess_004_T {

    public static void main(String[] args) {
        Base_ArrayAccess_004_T obj = new Base_ArrayAccess_004_T();
        obj.testcase(SourceUtil.getSource());
    }

    public void testcase(String cmd) {
        String[] strings = new String[3];
        strings[0]="cd ~";
        strings[1]=cmd;
        strings[2]="cd /";
        try {
            Runtime.getRuntime().exec(strings[1]);
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