package cn.com.chinlong.generate.controllor;

import java.util.Properties;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.com.chinlong.common.Constant.Resource;
import cn.com.chinlong.common.Constant.SystemConfig;
import cn.com.chinlong.generate.entity.UserEntity;
import cn.com.chinlong.utils.PropertyUtils;

@Controller
@RequestMapping("user")
public class UserControllor {

	/**
	 * 登录
	 * @param request
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(HttpServletRequest request, UserEntity user) {
		if ("admin".equals(user.getUserName()) && "admin".equals(user.getPassword())) {
			request.getSession().setAttribute(SystemConfig.SESSION_USER_KEY, user);
			// 读取配置
			Properties propExcel = PropertyUtils.getProperty(Resource.EXCEL_FILENAME);
			Properties propTemplate = PropertyUtils.getProperty(Resource.TEMPLETE_FILENAME);
			request.setAttribute("propTemplate", propTemplate);
			request.getServletContext().setAttribute("propExcel", propExcel);
			return "main";
		}
		request.setAttribute("msg", "UserName or Password Error");
		return "login";
	}
	/**
	 * 注销
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public String login(HttpServletRequest request) {
		request.getSession().removeAttribute(SystemConfig.SESSION_USER_KEY);
		request.setAttribute("msg", "Logout Success!");
		return "login";
	}
}
