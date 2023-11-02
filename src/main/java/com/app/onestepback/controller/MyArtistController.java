package com.app.onestepback.controller;

import com.app.onestepback.domain.MemberVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
@Slf4j
@RequestMapping("/my-artist/*")
public class MyArtistController {

    @GetMapping("list")
    public void goToListForm(HttpSession session, Model model){
        MemberVO memberVO = (MemberVO) session.getAttribute("member");
        model.addAttribute("memberId", memberVO.getId());
    }
}
