package com.sEGuo.Controller;

import jakarta.servlet.http.Part;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
public class HelloController {
    @RequestMapping("/HelloSpringWebMvc")
    @ResponseBody
    public String helloSpringWebMvc(){
        return "helloSpringWebMvc";
    }
    @PostMapping("/fileUpload")
    @ResponseBody
    public String uoLoad(@RequestParam("text")String text, @RequestParam("file")Part file) throws IOException {
        System.out.println("文件名：" + file.getSubmittedFileName());
        System.out.println("文件类型：" + file.getContentType());
        System.out.println("文件大小：" + file.getSize());
        //1.把文件写入到磁盘中的指定目录
        String url = "C:\\Users\\Administrator\\Desktop\\sEGuo-framework\\D20231008-fileupload-springmvc\\src\\main\\webapp\\WEB-INF\\img\\" + file.getSubmittedFileName();
        file.write(url);
        return url;
    }

    @RequestMapping("/demo")
    public String demo(){
        return "/WEB-INF/index.html";
    }
    @RequestMapping("/registerDemo")
    public String registerDemo(){
        return "/demo";
    }
}
