import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.common.collect.Lists;
import org.springframework.util.CollectionUtils;

public class Base_ArrayAccess_003_T {

    public static void main(String[] args) {
        Base_ArrayAccess_003_T obj = new Base_ArrayAccess_003_T();
        obj.testcase(SourceUtil.getSource());
    }

    public void testcase(String cmd) {
        String strs[] = new String[1];
        strs[0]=cmd;
        List<String> target = Lists.newArrayList("cd /","ls","ls -la");
        org.springframework.util.CollectionUtils.mergeArrayIntoCollection(strs,target);
        try {
            Runtime.getRuntime().exec(target.get(3));
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