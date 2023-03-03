package com.example.myrealproject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //화면으로 보기 위한 컨트롤러 작성
public class HomeController {

    @GetMapping //브라우저를 통해서 이 웹서버에 접속을 하게되면, getmapping이 작성된 메서드를 호출한다.
    //사실 경로를 ("") 지정할수도 있지만, 가장 기본이 되는 첫페이지라 아무것도 작성하지않았다.
    //경로없이 웹페이지에 접속을 하게되면 이 controller에 아래 메서드가 호출이 된다.
    //템플릿에 어떤thymeleaf 파일로 가질 경로를 지정한다.
    public String index(){
        return "index"; //지금 index.html 파일작성하는 파트이다. 그래서 return을 인덱스로 해주었다.
    }
}
