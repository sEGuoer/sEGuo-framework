import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.IOException;

@WebServlet("/fileUpload")
@MultipartConfig
public class fileLoader extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");
        String text = req.getParameter("text");
        System.out.println(text);
        Part file = req.getPart("file");
        System.out.println("文件名：" + file.getSubmittedFileName());
        System.out.println("文件类型：" + file.getContentType());
        System.out.println("文件大小：" + file.getSize());
        //把文件写入到磁盘中的指定目录
        String url = "C:\\Users\\Administrator\\Desktop\\sEGuo-framework\\D20231008-fileupload-servlet\\src\\main\\webapp\\img\\" + file.getSubmittedFileName();
        file.write(url);
        resp.getWriter().write("文件上传成功：" + file.getSubmittedFileName());
    }
}
