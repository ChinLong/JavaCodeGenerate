package cn.com.chinlong.generate.controllor;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.chinlong.common.AjaxJson;
import cn.com.chinlong.common.Constant.SystemConfig;
import cn.com.chinlong.generate.entity.TableEntity;
import cn.com.chinlong.generate.entity.UserEntity;
import cn.com.chinlong.generate.service.GenerateService;

@Controller
@RequestMapping("generate")
public class GenerateController {

	@Autowired
	private GenerateService generateService;

	/**
	 * excel一览
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "getExcelOverview", method = RequestMethod.GET)
	public String getExcelOverview(HttpServletRequest request) {
		UserEntity user = (UserEntity) request.getSession().getAttribute(SystemConfig.SESSION_USER_KEY);
		if (null != user) {
			List<TableEntity> excelDataList = generateService.readExcelData();
			request.setAttribute("excelDataList", excelDataList);
			return "excelOverview";
		}
		request.setAttribute("msg", "Please Login!");
		return "login";
	}

	/**
	 * table generate
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "getTable", method = RequestMethod.GET)
	public String getTable(HttpServletRequest request) {
		UserEntity user = (UserEntity) request.getSession().getAttribute(SystemConfig.SESSION_USER_KEY);
		if (null != user) {
			List<TableEntity> tableDataList = generateService.readAllTables();
			request.setAttribute("tableDataList", tableDataList);
			return "table";
		}
		request.setAttribute("msg", "Please Login!");
		return "login";
	}

	/**
	 * excel generate
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "getExcel", method = RequestMethod.GET)
	public String getExcel(HttpServletRequest request) {
		UserEntity user = (UserEntity) request.getSession().getAttribute(SystemConfig.SESSION_USER_KEY);
		if (null != user) {
			List<TableEntity> sheetList = generateService.readExcelSheets();
			request.setAttribute("sheetList", sheetList);
			return "excel";
		}
		request.setAttribute("msg", "Please Login!");
		return "login";
	}

	/**
	 * java code generate table
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "javaCodeGenerateInTable", method = RequestMethod.POST)
	public @ResponseBody AjaxJson javaCodeGenerateInTable(HttpServletRequest request, HttpServletResponse response, @RequestBody String[] checkArray) {
		AjaxJson ajaxjson = new AjaxJson();
		UserEntity user = (UserEntity) request.getSession().getAttribute(SystemConfig.SESSION_USER_KEY);
		if (null == user) {
			try {
				response.sendRedirect("../login.jsp");
			} catch (IOException e) {
				e.printStackTrace();
			}
			return ajaxjson;
		}
		boolean result = true;
		try {
			result = generateService.createEntityFromTable(Arrays.asList(checkArray));
		} catch (Exception e) {
			result = false;
			e.printStackTrace();
		}
		ajaxjson.setSuccess(result);
		return ajaxjson;

	}

	/**
	 * java code generate excel
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "javaCodeGenerateInExcel", method = RequestMethod.POST)
	public @ResponseBody AjaxJson javaCodeGenerateInExcel(HttpServletRequest request, @RequestBody String[] checkArray) {
		AjaxJson ajaxjson = new AjaxJson();
		UserEntity user = (UserEntity) request.getSession().getAttribute(SystemConfig.SESSION_USER_KEY);
		if (null == user) {
			request.setAttribute("msg", "Please Login!");
			return ajaxjson;
		}
		boolean result = true;
		try {
			result = generateService.createEntityFromExcel(Arrays.asList(checkArray));
		} catch (Exception e) {
			result = false;
			e.printStackTrace();
		}
		ajaxjson.setSuccess(result);
		return ajaxjson;
	}

	/**
	 * sql generate excel
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "sqlGenerateInExcel", method = RequestMethod.POST)
	public @ResponseBody AjaxJson sqlGenerateInExcel(HttpServletRequest request, @RequestBody String[] checkArray) {
		AjaxJson ajaxjson = new AjaxJson();
		UserEntity user = (UserEntity) request.getSession().getAttribute(SystemConfig.SESSION_USER_KEY);
		if (null == user) {
			return ajaxjson;
		}
		boolean result = true;
		try {
			result = generateService.createSqlFromExcel(Arrays.asList(checkArray));
		} catch (Exception e) {
			result = false;
			e.printStackTrace();
		}
		ajaxjson.setSuccess(result);
		return ajaxjson;
	}

}
