public class Statement_ForStatement_001_T {

    public static void main(String[] args) {

    }

    public void testcase1(String cmd) {
        String a ="mkdir";
        for(int i =0 ;i<10; i++){
            a= cmd+"|";
        }
        Runtime.getRuntime().exec(a);
    }
}

class SourceUtil {
    public static String getSource() {
        return "taint";
    }
}