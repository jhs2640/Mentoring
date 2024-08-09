package egovframework.sit.cmmn.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import egovframework.sit.cmmn.service.MainService;

@Controller
public class MainContorller {
	
	@Resource(name = "mainService")
	private MainService mainService;
	
	@RequestMapping(value="/main.do")
	public String main(ModelMap model) throws Exception {
		List<EgovMap> list = mainService.selectMainList();
		
		model.addAttribute("resultList", list);
		return "cmmn/main";
	}
	
}
 