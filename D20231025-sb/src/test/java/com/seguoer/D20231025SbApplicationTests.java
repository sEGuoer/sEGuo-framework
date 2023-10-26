package com.seguoer;

import org.hamcrest.core.StringContains;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.hamcrest.Matchers.hasItem;

@SpringBootTest
@AutoConfigureMockMvc
class D20231025SbApplicationTests {

    @Autowired
    MockMvc mvc;

    @Test
    @DisplayName("重定向之后显示对应页面")
    void swaggerUI() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/swagger-ui.html"))
                .andExpect(MockMvcResultMatchers.status().is3xxRedirection())
                .andExpect(MockMvcResultMatchers.redirectedUrl("/swagger-ui/index.html"))
        ;
    }

    @Test
    @DisplayName("直接定位到跳转网址 ")
    void swaggerUIActual() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/swagger-ui/index.html"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(StringContains.containsString("<div id=\"swagger-ui\">")))
        ;
    }
    @Test
    @DisplayName("""
            @Tag(name = "blog_controller", description = "博客管理")
            查看是否生成@Tag对应内容
            """)
    void swaggerUIWithTagAnnotation() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/v3/api-docs"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("tags.*.name", hasItem("blog_controller")))
                .andExpect(MockMvcResultMatchers.jsonPath("tags.*.description", hasItem("博客管理")))
        ;
    }
}
