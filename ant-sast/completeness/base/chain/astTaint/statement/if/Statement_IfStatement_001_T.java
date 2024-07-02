public class Statement_IfStatement_001_T {

    public static void main(String[] args) {
        Statement_IfStatement_001_T obj = new Statement_IfStatement_001_T();
        obj.testcase1(SourceUtil.getSource());

    }

    public void testcase1(String cmd) {
        if(true == false){
            CmdUtil.run(cmd);
        }else{
            String cmdString = HttpUtil.doGet("www.test.com");
            CmdUtil.run(cmd+cmdString);
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
        Runtime.getRuntime().exec(cmd);
    }
}