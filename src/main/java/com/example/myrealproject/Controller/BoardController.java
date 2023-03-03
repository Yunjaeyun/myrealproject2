package com.example.myrealproject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //화면으로 보기 위한 컨트롤러 작성
@RequestMapping("/board")
public class BoardController {

    @GetMapping("/list")
    public String list(){
        return "board/list";
    }
}
///
