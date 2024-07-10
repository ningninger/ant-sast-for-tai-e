import java.net.HttpURLConnection;
import java.net.URL;

public class Statement_CastStatement_002_T {

    public static void main(String[] args) {
        Statement_CastStatement_002_T obj = new Statement_CastStatement_002_T();
        obj.testcase1(SourceUtil.getSource());
    }

    public void testcase1(String url) {
        try {
            URL realUrl = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) realUrl.openConnection();
            connection.setRequestMethod("GET");
            connection.getResponseMessage();
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