import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import org.springframework.util.CollectionUtils;

public class Base_Queue_001_T {

    public static void main(String[] args) {
        Base_Queue_001_T obj = new Base_Queue_001_T();
        obj.testcase(SourceUtil.getSource());
        //obj.testcase(null);
    }


    public void testcase(List<String> cmd) {
        if (cmd == null || CollectionUtils.isEmpty(cmd)) {
            return;
        }
        Queue<String> queue = new LinkedBlockingQueue();
        queue.add(cmd.get(0));
        SinkUtil.sink(queue);
    }
}

class SourceUtil {
    public static List<String> getSource() {
        return new LinkedBlockingQueue<String>();
    }
}

class SinkUtil {
    public static void sink(Object param) {
    }
}