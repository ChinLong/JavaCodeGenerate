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
		<br>
		<div align="center">
			<input class="btn" type="button" value="Create Java Bean" onclick="createJavaCodeInTable()">
		</div>
		<div class="rt_content">
			<div align="center">
				<br>
				<table border="1" bordercolor="#DDDDDD"  style="table-layout:fixed;border-collapse:collapse;width:60%;">
					<thead>
						<tr>
							<th style="width: 8%"><input type="button" onclick="changeCheckbox()" value="Invert"></th>
							<th style="width:45%">Table Name</th>
							<th style="width:45%">Table Remark</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${tableDataList}" var="table">
							<tr>
								<td><input name="ckbox" type="checkbox" value="${table.tableName}"></td>
								<td><h3>${table.tableName}</h3></td>
								<td><h3>${table.tableNameDesc}</h3></td>
							</tr>
						</c:forEach>
					<tbody>
				</table>
			</div>
		</div>
	</section>
	<!-- content end -->
</body>
</html>
