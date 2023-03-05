package com.example.myrealproject.Controller;

import com.example.myrealproject.model.Board;
import com.example.myrealproject.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

//상단공통화면 처리(common.html)이후, 게시판링크를 클릴할수있도록 boardcontroller 제작
@Controller //화면으로 보기 위한 컨트롤러 작성
@RequestMapping("/board") //board 라는 경로지정
public class BoardController {

    @Autowired
    private BoardRepository boardRepository;

    @GetMapping("/list") //경로지정
    public String list(Model model){
        List<Board> boards = boardRepository.findAll();
        model.addAttribute("boards", boards);
        return "board/list";
    }
}
//경로를 지정해줬으니 templates에도 동일하게 작성해야함. -> vscode
