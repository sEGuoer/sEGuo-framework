import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.IOException;

@WebServlet("/fileUpload")
@MultipartConfig(
        //location = "",
        maxFileSize = 1024 * 1024,
        maxRequestSize = 1024 * 1024 * 5,
        fileSizeThreshold = 1024 * 1024 * 5
)
public class fileLoader extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String text = req.getParameter("text");
        System.out.println(text);
        Part file = req.getPart("file");
        System.out.println("文件名：" + file.getSubmittedFileName());
        System.out.println("文件类型：" + file.getContentType());
        System.out.println("文件大小：" + file.getSize());
        //1.把文件写入到磁盘中的指定目录
        String url = "C:\\Users\\Administrator\\Desktop\\sEGuo-framework\\D20231008-fileupload-servlet\\src\\main\\webapp\\img\\" + file.getSubmittedFileName();
        file.write(url);
        FileInputStream fis = new FileInputStream(url);
        //2. 获取response字节输出流
        ServletOutputStream os = resp.getOutputStream();
        //3. 完成流的copy
        IOUtils.copy(fis, os);
        fis.close();
    }
}
