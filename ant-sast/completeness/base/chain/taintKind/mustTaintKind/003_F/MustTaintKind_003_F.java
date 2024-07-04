import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MustTaintKind_003_F {

    public static void main(String[] args) {
        MustTaintKind_003_F obj = new MustTaintKind_003_F();
        obj.testcase(SourceUtil.getSource());
    }

    public void testcase(String name) {
        String sql = "select * from user where username = " + name;
        String sql2 = "select * from user where username = " + "zhangsan";
        JDBCUtil.execSql(sql2);
    }
}

class SourceUtil {
    public static String getSource() {
        return "taint";
    }
}



class JDBCUtil {
    static final String JDBC_URL = "jdbc:mysql://localhost:3306/mydatabase";
    static final String USERNAME = "root";
    static final String PASSWORD = "123456";

    public static void execSql(String sql) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // 1. 加载驱动程序
            Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD); // 2. 建立数据库连接
            Statement statement = connection.createStatement();  // 3. 创建Statement对象
            statement.executeQuery(sql);
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}