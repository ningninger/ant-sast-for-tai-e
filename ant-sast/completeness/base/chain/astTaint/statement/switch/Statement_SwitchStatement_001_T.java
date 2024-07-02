public class Statement_SwitchStatement_001_T {

    public static void main(String[] args) {
        Statement_SwitchStatement_001_T obj = new Statement_SwitchStatement_001_T();
        obj.testcase1(SourceUtil.getSource());
    }

    public void testcase1(String cmd) {
        switch (type){
            case "mkdir":
                CmdUtil.run("mkdir"+" "+cmd);
                break;
            default:
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
        Runtime.getRuntime().exec(cmd);
    }
}