public class Expression_ClassInstance_Infix_001_T {

        public static void main(String[] args) {
            Expression_ClassInstance_Infix_001_T obj = new Expression_ClassInstance_Infix_001_T();
            obj.testcase1(SourceUtil.getSource());
        }

        public void testcase1(String cmd) {
            try {
                Runtime.getRuntime().exec(new String(cmd +" &"));
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