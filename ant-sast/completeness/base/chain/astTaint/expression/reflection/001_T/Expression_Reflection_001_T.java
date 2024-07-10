import java.lang.reflect.Method;

public class Expression_Reflection_001_T {

    public static void main(String[] args) {
        Expression_Reflection_001_T obj = new Expression_Reflection_001_T();
        obj.testcase1(SourceUtil.getSource());
    }

    public void testcase1(String cmd) {
        if (cmd == null) {
            return ;
        }
        try {
            Class<CmdUtil> clazz = CmdUtil.class;
            Method method = clazz.getMethod("run", String.class);
            method.setAccessible(true);
            //静态方法不需要创建对象实例
            method.invoke(null, cmd);
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

class CmdUtil {

    public static void run(String cmd) {
        try {
            Runtime.getRuntime().exec(cmd);
        }catch (Exception e) {
            return;
        }
    }

    public static String getCmdWithContextSensitive(int x, String cmd) {
        String res;
        if (x > 0) {
            res = cmd;
        }
        else {
            res = "ls";
        }
        return res;
    }
}
