package com.sEGuo.Service;

import java.io.IOException;

public interface UserService {
    String add();
    public default String mdFileToHtmlFile(String resource,String title ,String content) throws IOException {return "";}

}
