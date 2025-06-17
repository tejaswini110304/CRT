package controllers;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import models.Goods;
import jakarta.annotation.Resource;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/show")
public class HandleShow extends HttpServlet {   
    @Resource(name = "jdbc/MyDB")
    private DataSource dataSource;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<Goods> goods = new ArrayList<>();

        try (Connection con = dataSource.getConnection();
             Statement stmt = con.createStatement();
             ResultSet res = stmt.executeQuery("SELECT * FROM goods")) {

            while (res.next()) {
                Goods item = new Goods(
                        res.getInt("id"),
                        res.getString("name"),
                        res.getString("description"),
                        res.getInt("price")
                );
                goods.add(item);
            }

            request.setAttribute("goods", goods);
            RequestDispatcher dispatch = request.getRequestDispatcher("show.jsp");
            dispatch.forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().print(e.getMessage());
        }
    }
}
