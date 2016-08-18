package cn.com.chinlong.generate.controllor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.com.chinlong.generate.service.CodeGenertorService;

@Controller
@RequestMapping("genertorCode")
public class CodeGenertorController {
	
	@Autowired
	private CodeGenertorService codeGenertorService;
	
}
