import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.HashSet;


import org.springframework.util.CollectionUtils;

public class Base_Set_001_T {

    public static void main(String[] args) {
        Base_Set_001_T obj = new Base_Set_001_T();
        obj.testcase(SourceUtil.getSource());
    }


    public void testcase(List<String> cmd) {
        if (cmd == null || CollectionUtils.isEmpty(cmd)) {
            return;
        }
        Set<String> stringSet = new HashSet<>(cmd);
        SinkUtil.sink(stringSet);
    }
}

class SourceUtil {
    public static List<String> getSource() {
        return new ArrayList<String>();
    }
}

class SinkUtil {
    public static void sink(Object param) {
    }
}