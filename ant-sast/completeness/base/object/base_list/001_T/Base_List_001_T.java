import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.util.CollectionUtils;

public class Base_List_001_T {
    public static void main(String[] args) {
        Base_List_001_T obj = new Base_List_001_T();
        obj.testcase(SourceUtil.getSource());
        //obj.aTaintCase0141(null);
    }

    public void testcase(List<String> cmd) {
        if (cmd == null || CollectionUtils.isEmpty(cmd)) {
            return;
        }
        try {
            Runtime.getRuntime().exec(cmd.get(0));
        } catch (IOException e) {
            return;
        }
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

