<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>JavaCodeGenerate</title>
<link rel="stylesheet" type="text/css" href="../resource/css/style.css" />
<!--[if lt IE 9]>
<script src="js/html5.js"></script>
<![endif]-->
<script src="../resource/js/jquery.js"></script>
<script src="../resource/js/jquery.scrollbar.concat.min.js"></script>
<script>
	(function($) {
		$(window).load(
				function() {
					$("a[rel='load-content']").click(
							function(e) {
								e.preventDefault();
								var url = $(this).attr("href");
								$.get(url, function(data) {
									$(".content .mCSB_container").append(data);
									$(".content").mCustomScrollbar("scrollTo",
											"h2:last");
								});
							});
					$(".content").delegate(
							"a[href='top']",
							"click",
							function(e) {
								e.preventDefault();
								$(".content").mCustomScrollbar("scrollTo",
										$(this).attr("href"));
							});
				});
	})(jQuery);
</script>
</head>
<body>
	<!--header start-->
	<header>
		<h1>
			<img src="../resource/images/admin_logo.png" />
		</h1>
		<ul class="rt_nav">
			<li><a href="#" class="set_icon">Setting</a></li>
			<li><a href="../user/logout.htm" class="quit_icon">Logout</a></li>
		</ul>
	</header>
	<!--header end-->

	<!--aside nav-->
	<aside class="lt_aside_nav content mCustomScrollbar">
		<ul>
			<li>
				<dl>
					<dt>Excel Overview</dt>
				</dl>
			</li>
			<li>
				<dl>
					<dt>Java Generate</dt>
				</dl>
			</li>
			<li>
				<dl>
					<dt>SQL Generate</dt>
				</dl>
			</li>
		</ul>
	</aside>
	<!--aside nav end -->

	<!-- content atart -->
	<section class="rt_wrap content mCustomScrollbar">
		<div class="rt_content">
			<div align="center">
				<br>
				<h1>
					<strong>This is Generate Page</strong>
				</h1>
				<br>
				<h1>If you config the properties right, please go head!</h1>
				<br>
				<h1>Please check the properties!</h1>
				<br>
				<h2>
					<strong>Template Config</strong>
				</h2>
				<table>
					<tbody>
						<c:forEach items="${propTemplate}" var="prop">
							<tr>
								<td><h3>${prop}</h3></td>
							</tr>
						</c:forEach>
					<tbody>
				</table>
				<br>
				<h2>
					<strong>Excel Config</strong>
				</h2>
				<table>
					<c:forEach items="${propExcel}" var="prop">
						<tr>
							<td><h3>${prop}</h3></td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</section>
	<!-- content end -->
</body>
</html>
