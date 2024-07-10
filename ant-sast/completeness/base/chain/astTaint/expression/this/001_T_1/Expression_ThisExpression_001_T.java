import org.example.service.SSRFShowManageImpl;
import org.example.service.SSRFShowManager;

public class Expression_ThisExpression_001_T {
    private SSRFShowManager ssrfShowManager = new SSRFShowManageImpl();

    public static void main(String[] args) {
        Expression_ThisExpression_001_T obj = new Expression_ThisExpression_001_T();
        obj.testcase1(SourceUtil.getSource());
    }

    public void testcase1(String url) {
        this.ssrfShowManager.connectFacade(url);
    }
}

class SourceUtil {
    public static String getSource() {
        return "taint";
    }
}