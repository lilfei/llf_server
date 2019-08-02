package com.llf_server.websocket;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;

import com.llf_server.util.Constant;

@Controller
public class LoginAction {
	
    @PutMapping("login")
    public String login(String username, HttpSession session){
        session.setAttribute(Constant.USER_NAME,username);
        return "chat";
    }
}
