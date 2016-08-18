<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>JavaCodeGenerate</title>
<link rel="stylesheet" type="text/css" href="resource/css/style.css" />
<style>
body {
	height: 100%;
	background: #16a085;
	overflow: hidden;
}

canvas {
	z-index: -1;
	position: absolute;
}
</style>
<script src="resource/js/jquery.js"></script>
<script src="resource/js/Particleground.js"></script>
<script>
	$(document).ready(function() {
		//粒子背景特效
		$('body').particleground({
			dotColor : '#5cbdaa',
			lineColor : '#5cbdaa'
		});
		//测试提交，对接程序删除即可
		//$(".submit_btn").click(function() {
		//	location.href = "pages/main.html";
		//});
	});
</script>
</head>
<body>
	<form action="user/login.htm" method="post">
		<dl class="admin_login">
			<dt>
				<strong>JavaCodeGenerate</strong> <em style="color:red">${msg}</em>
			</dt>
			<dd class="user_icon">
				<input type="text" name="userName" placeholder="UserName" class="login_txtbx" />
			</dd>
			<dd class="pwd_icon">
				<input type="password" name="password" placeholder="Password" class="login_txtbx" />
			</dd>
			<dd>
				<input type="submit" value="Login" class="submit_btn" />
			</dd>
			<dd>
				<p>Copyright &copy;2016 JavaCodeGenerate</p>
			</dd>
		</dl>
	</form>
</body>
</html>
