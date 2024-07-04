import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AliasIsTaintOrNot_002_F {

    public static void main(String[] args) {
        AliasIsTaintOrNot_002_F obj = new AliasIsTaintOrNot_002_F();
        obj.testcase(SourceUtil.getSource());
    }

    public void testcase(String cmd) {
        try {
            B b1 = new B();
            B b2 = new B();
            b2.attr = b1.attr;
            doUnalias(b2);
            b1.attr.b = cmd;

            Runtime.getRuntime().exec(b2.attr.b);
        } catch (IOException e) {
            return;
        }

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

    private void doUnalias(B b2) {
        b2.attr = new A();
    }
}

class SourceUtil {
    public static String getSource() {
        return "taint";
    }
}