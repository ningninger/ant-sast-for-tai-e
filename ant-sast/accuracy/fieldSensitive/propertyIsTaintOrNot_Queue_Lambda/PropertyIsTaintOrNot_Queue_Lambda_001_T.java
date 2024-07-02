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
        Queue<String> queue = Queues.newArrayDeque();
        queue.add(cmd);
        queue.add("cd /");
        queue.add("cd ~");
        queue.stream().forEach(e -> {
            if (cmd.equals(e)) {
                try {
                    Runtime.getRuntime().exec(e);
                } catch (IOException ex) {
                }
            }
        });
    }

}

class SourceUtil {
    public static String getSource() {
        return "taint";
    }
}