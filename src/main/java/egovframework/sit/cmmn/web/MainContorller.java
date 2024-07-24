package egovframework.sit.cmmn.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainContorller {
	
	@RequestMapping(value="/main.do")
	public String main(Model model) throws Exception {
		return "cmmn/main";
	}
	
}
 