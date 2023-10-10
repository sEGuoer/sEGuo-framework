package com.seguo.mybatis.method;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResponse {
    private Integer code;
    private String msg;
    private Object data;
    public static CommonResponse ok(Object data){
        return new CommonResponse(HttpStatus.OK.value(),HttpStatus.OK.getReasonPhrase(),data);
    }
    public static CommonResponse ok(Integer state,Object data){
        return new CommonResponse(state,HttpStatus.OK.getReasonPhrase(),data);
    }
}
