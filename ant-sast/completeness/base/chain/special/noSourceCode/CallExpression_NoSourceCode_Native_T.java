public class CallExpression_NoSourceCode_Native_001_T {

    public static void main(String[] args) {
        CallExpression_NoSourceCode_Native_001_T obj = new CallExpression_NoSourceCode_Native_001_T();
        obj.testcase1(SourceUtil.getSource());

    }

    public void testcase1(String cmd) {
        String exec = String.valueOf(cmd);
        Runtime.getRuntime().exec(exec);
    }

    public void testcase2(String cmd) {
        Runtime.getRuntime().exec(new String(cmd));
    }

    public void testcase3(String cmd) {
        cmd=cmd.concat(" -la");
        Runtime.getRuntime().exec(cmd);
    }

    public void testcase4(String cmd) {
        char data[] = cmd.toCharArray();
        Runtime.getRuntime().exec(String.copyValueOf(data));
    }

    public void testcase5(String cmd) {
        cmd = String.format("%s -la",cmd);
        Runtime.getRuntime().exec(cmd);
    }

    public void testcase6(String cmd) {
        byte[] bytes = cmd.getBytes();
        Runtime.getRuntime().exec(String.valueOf(bytes));
    }

    public void testcase7(String cmd) {
        char[] chars= new char[]{0,0};
        cmd.getChars(0,2,chars,0);
        Runtime.getRuntime().exec(String.valueOf(chars));
    }

    public void testcase8(String cmd) {
        Runtime.getRuntime().exec(cmd.intern());
    }

    public void testcase9(String cmd) {
        cmd = String.join(" ",cmd,"-la");
        Runtime.getRuntime().exec(cmd);
    }

    public void testcase10(String cmd) {
        cmd = cmd.replace(";"," ");
        Runtime.getRuntime().exec(cmd);
    }

    public void testcase11(String cmd) {
        cmd=cmd.replaceAll("a","");
        Runtime.getRuntime().exec(cmd);
    }

    public void testcase12(String cmd) {
        cmd=cmd.split(" ")[0];
        Runtime.getRuntime().exec(cmd);
    }

    public void testcase13(String cmd) {
        Runtime.getRuntime().exec(String.valueOf(cmd.subSequence(0,2)));
    }

    public void testcase14(String cmd) {
        Runtime.getRuntime().exec(cmd.substring(0,2));
    }

    public void testcase15(String cmd) {
        char[] chars=cmd.toCharArray();
        Runtime.getRuntime().exec(String.valueOf(chars));
    }

    public void testcase16(String cmd) {
        cmd=cmd.toLowerCase();
        Runtime.getRuntime().exec(cmd);
    }

    public void testcase17(String cmd) {
        cmd=cmd.toString();
        Runtime.getRuntime().exec(cmd);
    }

    public void testcase18(String cmd) {
        cmd=cmd.toUpperCase();
        Runtime.getRuntime().exec(cmd);
    }

    public void testcase19(String cmd) {
        cmd=cmd.trim();
        Runtime.getRuntime().exec(cmd);
    }

    public void testcase20(String cmd) {
        Runtime.getRuntime().exec(String.valueOf(new StringBuilder(cmd)));
    }

    public void testcase21(String cmd) {
        StringBuilder builder = new StringBuilder();
        builder.append(cmd);
        Runtime.getRuntime().exec(builder.toString());
    }

    public void testcase22(String cmd) {
        StringBuilder builder = new StringBuilder();
        builder.append(cmd);
        char c= builder.charAt(0);
        Runtime.getRuntime().exec(String.valueOf(c));
    }

    public void testcase23(String cmd) {
        StringBuilder builder = new StringBuilder();
        builder.append(cmd);
        builder.delete(2,cmd.length());
        Runtime.getRuntime().exec(builder.toString());
    }

    public void testcase24(String cmd) {
        StringBuilder builder = new StringBuilder();
        builder.append(cmd);
        builder.deleteCharAt(2);
        Runtime.getRuntime().exec(builder.toString());
    }

    public void testcase25(String cmd) {
        StringBuilder builder = new StringBuilder();
        builder.append(cmd);
        char[] chars = {0,0};
        builder.getChars(0,2,chars,0);
        Runtime.getRuntime().exec(String.valueOf(chars));
    }

    public void testcase26(String cmd) {
        StringBuilder builder = new StringBuilder();
        builder.append(cmd);
        builder.subSequence(0,2);
        Runtime.getRuntime().exec(String.valueOf(builder.subSequence(0,2)));
    }

    public void testcase27(String cmd) {
        StringBuilder builder = new StringBuilder();
        builder.append(cmd);
        builder.substring(0,2);
        Runtime.getRuntime().exec(builder.substring(0,2));
    }

    public void testcase28(String cmd) {
        StringBuilder builder = new StringBuilder();
        builder.append(cmd);
        Runtime.getRuntime().exec(builder.toString());
    }

    public void testcase29(String cmd) {
        byte[] b1 = cmd.getBytes();
        byte[] b2 = Arrays.copyOf(b1,10);
        Runtime.getRuntime().exec(new String(b2));
    }

    public void testcase30(String cmd) {
        byte[] b1 = cmd.getBytes();
        byte[] b2 = Arrays.copyOfRange(b1,0,2);
        Runtime.getRuntime().exec(new String(b2));
    }

    public void testcase31(String cmd) {
        StringBuilder builder = new StringBuilder();
        builder.insert(0, cmd);
        Runtime.getRuntime().exec(builder.toString());
    }

    public void testcase32(String cmd) {
        StringBuilder builder = new StringBuilder("abc");
        builder.replace(2, 3, cmd);
        Runtime.getRuntime().exec(builder.toString());
    }



}

class SourceUtil {
    public static String getSource() {
        return "taint";
    }
}