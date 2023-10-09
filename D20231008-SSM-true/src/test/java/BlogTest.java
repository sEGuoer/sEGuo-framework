import com.seguo.mybatis.config.AppConfig;
import com.seguo.mybatis.mapper.UserMapper;
import com.seguo.mybatis.po.Blog;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.Date;

@SpringJUnitConfig(AppConfig.class)
public class BlogTest {
    @Autowired
    UserMapper userMapper;

    @Test
    @DisplayName("测试addBlog是否能正常使用")
    void addBlogTest() {
        Blog blog = new Blog();
        blog.setId(3);
        blog.setTitle("1");
        blog.setCreator("1");
        blog.setCover("1");
        blog.setSlug("1");
        blog.setCreateTime(new Date());
        blog.setUpdateTime(new Date());
        blog.setUserId(1);
        blog.setContent("1");
        blog.setContentType("1");
        blog.setReadingTime(11);
        userMapper.addNewBlog(blog);
        System.out.println(blog);
    }
}
