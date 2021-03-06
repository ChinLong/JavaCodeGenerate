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
<script src="../resource/js/base.js"></script>
</head>
<body>

	<jsp:include page="base.jsp" />
	
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

				<table border="1" bordercolor="#DDDDDD"  style="table-layout:fixed;border-collapse:collapse;width:60%;">
					<thead>
						<tr>
							<th>
								<h2>
									<strong>Template Config</strong>
								</h2>
							</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${propTemplate}" var="prop">
							<tr>
								<td><h3>${prop}</h3></td>
							</tr>
						</c:forEach>
					<tbody>
				</table>
				<br>
				<table border="1" bordercolor="#DDDDDD" style="table-layout:fixed;border-collapse:collapse;width:60%;">
					<thead>
						<tr>
							<th>
								<h2>
									<strong>Excel Config</strong>
								</h2>
							</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${propExcel}" var="prop">
							<tr>
								<td><h3>${prop}</h3></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</section>
	<!-- content end -->
</body>
</html>
