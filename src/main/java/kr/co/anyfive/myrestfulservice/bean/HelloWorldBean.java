package kr.co.anyfive.myrestfulservice.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data //setter, getter 자동 생성
@AllArgsConstructor // 생성자 자동 생성
public class HelloWorldBean {

    private String message;

}
