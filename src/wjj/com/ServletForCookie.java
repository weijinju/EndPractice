package wjj.com;

import com.sun.deploy.util.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Administrator on 2020/5/16.
 */
@WebServlet("/ServletForCookie")
public class ServletForCookie extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = new String(request.getParameter("userName").getBytes("UTF-8"));
        String userPassword = new String(request.getParameter("userPassword").getBytes("UTF-8"));

        Connection connection = DataConnection.getConnectionMyData();
        Statement stm = DataConnection.getMyStatement();

        try {
            int irst = stm.executeUpdate("insert into userr ( username, USERPASSWORD) values ('"+userName+"','"+userPassword+"')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("执行成功!");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        读取cookie值的方法

    }
}
