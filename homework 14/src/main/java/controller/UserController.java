package controller;

import java.io.File;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import pojo.MultiFileDomain;
import pojo.User;

@Controller
@RequestMapping("/users")
public class UserController {
	
	private static final Log logger = LogFactory.getLog(UserController.class);

	@RequestMapping("/input")
	public String input(Model model) {
		model.addAttribute("user", new User());
		return "login";
	}
	
	@RequestMapping("/save")
	public String save(@Valid @ModelAttribute User user, BindingResult result) {
		if(result.hasErrors()) {
			return "login";
		}
		logger.info("登录成功！！");	
		return "upload";
	}
	
	@RequestMapping("/multifile")
	public String multifile(@ModelAttribute MultiFileDomain multiFileDomain, HttpServletRequest request) {
		
		String realpath = request.getServletContext().getRealPath("uploadfiles");
		File targetDir = new File(realpath);
		if(!targetDir.exists()) {
			targetDir.mkdir();
		}
		
		ArrayList<MultipartFile> myFiles = multiFileDomain.getMyfiles();
		for (int i = 0; i < myFiles.size(); i++) {
			MultipartFile file = myFiles.get(i);
			String fileName = file.getOriginalFilename();
			File tarFile = new File(realpath, fileName);
			try {
				file.transferTo(tarFile);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		logger.info("上传成功！！");
		return "showMulti";
	}
}                                                                
