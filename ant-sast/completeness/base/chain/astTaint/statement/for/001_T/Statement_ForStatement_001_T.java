public class Statement_ForStatement_001_T {

    public static void main(String[] args) {
        Statement_ForStatement_001_T obj = new Statement_ForStatement_001_T();
        obj.testcase1(SourceUtil.getSource());
    }

    public void testcase1(String cmd) {
        String a ="mkdir";
        for(int i =0 ;i<10; i++){
            a= cmd+"|";
        }

        try {
            Runtime.getRuntime().exec(a);
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