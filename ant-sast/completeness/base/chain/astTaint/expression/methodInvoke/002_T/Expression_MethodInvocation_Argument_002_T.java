import cn.hutool.http.HttpRequest;

public class Expression_MethodInvocation_Argument_002_T {

    public static void main(String[] args) {
        Expression_MethodInvocation_Argument_002_T obj = new Expression_MethodInvocation_Argument_002_T();
        obj.testcase1(SourceUtil.getSource());
    }

    public void testcase1(String cmd) {
        HttpRequest.post("http://localhost:39100/ataint/case00124/2?cmd="+cmd)
                .execute();
    }
}

class SourceUtil {
    public static String getSource() {
        return "taint";
    }
}