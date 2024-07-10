import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

import com.google.common.collect.Queues;

public class PropertyIsTaintOrNot_Queue_Lambda_001_T {

    public static void main(String[] args) {
        PropertyIsTaintOrNot_Queue_Lambda_001_T obj = new PropertyIsTaintOrNot_Queue_Lambda_001_T();
        obj.testcase(SourceUtil.getSource());
    }


    public void testcase(String cmd) {
        try {
            Queue<String> queue = Queues.newArrayDeque();
            queue.add(cmd);
            queue.add("cd /");
            queue.add("cd ~");
            for (String e : queue) {
                if (cmd.equals(e)) {
                    try {
                        Runtime.getRuntime().exec(e);
                    } catch (IOException ex) {
                        // 处理异常，打印错误信息或记录日志
                        ex.printStackTrace();
                    }
                }
            }
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