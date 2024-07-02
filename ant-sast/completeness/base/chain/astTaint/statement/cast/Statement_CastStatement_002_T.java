public class Statement_CastStatement_002_T {

    public static void main(String[] args) {
        Statement_CastStatement_002_T obj = new Statement_CastStatement_002_T();
        obj.testcase1(SourceUtil.getSource());
    }

    public void testcase1(String url) {
        URL realUrl = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) realUrl.openConnection();
        connection.setRequestMethod("GET");
        connection.getResponseMessage();
    }
}

class SourceUtil {
    public static String getSource() {
        return "taint";
    }
}