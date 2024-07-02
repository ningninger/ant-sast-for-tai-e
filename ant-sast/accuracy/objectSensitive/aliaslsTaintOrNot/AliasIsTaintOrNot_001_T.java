import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AliasIsTaintOrNot_001_T {

    public static void main(String[] args) {
        AliasIsTaintOrNot_001_T obj = new AliasIsTaintOrNot_001_T();
        obj.testcase(SourceUtil.getSource());
    }

    public void testcase(String cmd) {
        B b1 = new B();
        b1.attr = new A();
        B b2 = new B();
        alias(b1, b2);
        b2.attr.b = cmd;

        Runtime.getRuntime().exec(b1.attr.b);
    }

    class B {
        public A attr;

        public B() {
            attr = new A();
        }

        public void setAttr(A attr) {
            this.attr = attr;
        }
    }
    class A {
        public String b = "Y";
        public String c = "X";
        public int i = 0;
    }

    private void alias(B b1, B b2) {
        b2.attr = b1.attr;
    }


}

class SourceUtil {
    public static String getSource() {
        return "taint";
    }
}