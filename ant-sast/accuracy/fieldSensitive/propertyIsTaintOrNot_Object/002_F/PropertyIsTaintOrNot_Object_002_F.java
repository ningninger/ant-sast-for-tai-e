
import java.util.HashMap;
import java.util.Map;


public class PropertyIsTaintOrNot_Object_002_F {

    public static void main(String[] args) {
        PropertyIsTaintOrNot_Object_002_F obj = new PropertyIsTaintOrNot_Object_002_F();
        obj.testcase(SourceUtil.getSource());
    }

    public void testcase(String cmd) {
        try {
            CmdObject simpleBean = new CmdObject();
            simpleBean.setCmd(cmd);
            simpleBean.setCmd2("cd /");
            Runtime.getRuntime().exec(simpleBean.getCmd2());
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


public class CmdObject {
    private String cmd1;
    private String cmd2;
    private String cmd3;

    public void setCmd(String cmd) {
        this.cmd1 = cmd;
    }

    public void setCmd2(String s) {
        this.cmd2 = s;
    }

    public String getCmd() {
        return cmd1;
    }

    public String getCmd2() {
        return cmd2;
    }
}
