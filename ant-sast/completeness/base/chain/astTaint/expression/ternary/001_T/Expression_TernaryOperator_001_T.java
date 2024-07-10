import org.apache.commons.lang.StringUtils;
import org.example.service.SSRFShowManageImpl;
import org.example.service.SSRFShowManager;

public class Expression_TernaryOperator_001_T {

    private SSRFShowManager ssrfShowManager = new SSRFShowManageImpl();

    public static void main(String[] args) {
        Expression_TernaryOperator_001_T obj = new Expression_TernaryOperator_001_T();
        obj.testcase(SourceUtil.getSource());
    }

    public void testcase(String domain) {
        try {
            String realUrl = StringUtils.isBlank(url) ? url : "https://www.alipay.com";
            this.ssrfShowManager.selfAnonymousFacade(realUrl);
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
