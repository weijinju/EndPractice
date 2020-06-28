package wjj.com;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import java.io.IOException;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Administrator on 2020/5/19
 */
@WebServlet("/serviceDatabaseServlet")
public class serviceDatabaseServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        String innumber =new String( request.getParameter("innumber" ).getBytes("iso-8859-1"),"utf-8");
        String inpass =new String(request.getParameter("inpass").getBytes("iso-8859-1"),"utf-8") ;
        String inna =new String(request.getParameter("inna").getBytes("iso-8859-1"),"utf-8") ;
        String insex =new String( request.getParameter("insex" ).getBytes("iso-8859-1"),"utf-8");
        String innation =new String(request.getParameter("innation").getBytes("iso-8859-1"),"utf-8") ;
        String indateday =new String(request.getParameter("indateday").getBytes("iso-8859-1"),"utf-8") ;
        String inphone =new String(request.getParameter("inphone").getBytes("iso-8859-1"),"utf-8") ;
        String inqq =new String(request.getParameter("inqq").getBytes("iso-8859-1"),"utf-8") ;
        String inaddress =new String(request.getParameter("inaddress").getBytes("iso-8859-1"),"utf-8") ;

//        int irst = 0;
        Connection connection = DataConnection.getConnectionMyData();
        Statement stm = DataConnection.getMyStatement();
        try {
           int irst = stm.executeUpdate("insert into INFORMATION(innumber, inpass, inna, insex, innation, indateday, inphone, inqq, inaddress) values('"+innumber+"','"+inpass+"','"+inna+"','"+insex+"','"+innation+"','"+indateday+"','"+inphone+"','"+inqq+"','"+inaddress+"')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("传入执行成功!");
////        if(irst == 0)
////            response.getWriter().write("保存失败！");
////        else
////            response.getWriter().write("保存成功！");

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
//        Statement stm = DataConnection.getMyStatement();
//        ResultSet rs = null;
//        try {
//           rs = stm.executeQuery("Select * from STUINFO where stuno='20191301006'");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        String sNo = "";
//        String sName = "";
//        String sPid = "";
//        while (true) {
//            try {
//                if (!rs.next()) break;;
//                sNo += rs.getString("stuno");
//                sName += rs.getString("stuname");
//                sPid += rs.getString("stupid");
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//
//        response.setHeader("Content-Type","text/html;charset=utf-8");
//
////        创建Cookie
//        Cookie c_sNo = new Cookie("sNo",sNo);
//        Cookie c_sName = new Cookie("sName", URLEncoder.encode(sName,"UTF-8"));
////       设置Cookie的有效期，24*60*60相当于一天
////        c_sName.setMaxAge(24*60*60);
//        Cookie c_sPid = new Cookie("sPid",sPid);
//
////        传回客户端
//        response.addCookie(c_sNo);
//        response.addCookie(c_sName);
//        response.addCookie(c_sPid);
//
//        response.getWriter().write(sNo+"-"+sName+"-"+sPid);
//        System.out.println("读取数据成功!");
    }
}
