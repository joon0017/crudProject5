package com.crud;

import com.crud.bean.BoardVO;
import com.crud.dao.BoardServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value="/board")
public class BoardController {
    @Autowired
    BoardServiceImplementation boardService;

    @RequestMapping(value="/list",method = RequestMethod.GET)
    public String boardlist(Model model){
        model.addAttribute("list",boardService.getBoardList());
        return "list";
    }
    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String addPost(){
        return "addpostform";
    }

    @RequestMapping(value = "/addok",method = RequestMethod.GET)
    public String addPostOK(BoardVO vo){
        int i = boardService.insertBoard(vo);
        if (i == 0) System.out.println("데이터 추가 실패");
        else System.out.println("데이터 추가 성공");
        return "redirect:list";
    }
    @RequestMapping(value = "/editform/{id}",method = RequestMethod.GET)
    public String editPost(@PathVariable("id") int id, Model model){
        BoardVO boardVO = boardService.getBoard(id);
        model.addAttribute("u",boardVO);
        return "editform";
    }

    @RequestMapping(value = "/editok/{id}",method = RequestMethod.GET)
    public String editPostOK(@PathVariable("id") int id , BoardVO vo){
        int i = boardService.updateBoard(vo,id);
        if (i == 0) System.out.println("데이터 수정 실패");
        else System.out.println("데이터 수정 성공");
        return "redirect:../list";
    }

    @RequestMapping(value = "/deleteok/{id}",method = RequestMethod.GET)
    public String editPost(@PathVariable("id") int id){
        if(boardService.deleteBoard(id)==0) System.out.println("데이토 삭제 실패");
        else System.out.println("데이토 삭제 성공");
        return "redirect:../list";
    }


}
