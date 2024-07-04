import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class MayTaintKind_002_F {

    public static void main(String[] args) {
        MayTaintKind_002_F obj = new MayTaintKind_002_F();
        obj.testcase(SourceUtil.getSource(), 1);
    }

    public void testcase(String name, Integer condition) {
        String sql;
        if (condition > 0) {
            sql = "select * from user where username = " + name;
        }
        else {
            sql = "select * from user where username = " + "zhangsan";
        }
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