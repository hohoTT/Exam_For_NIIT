<%@page import="com.wt.entity.Dormitory"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>宿舍信息查询</title>

<!-- css 样式部分 -->
<link rel="stylesheet" href="static/css/dormitory/style.css" media="all">

<link rel="stylesheet" href="static/css/bootstrap/bootstrap.min.css">
<link rel="stylesheet" href="static/css/dormitory/dormitory_info.css"
	media="all">

<link rel="shortcut icon" href="image/favicon.ico" />

<!-- 自定义CSS样式 -->
<style type="text/css">

#title {
	font-size: 40px;
}

#title-tail {
	font-size: 20px;
}

h2{
	font-size: 30px;
	font-family: source_code_pro,"PingFangSC-Regular",
	"Heiti SC","Microsoft Yahei",monospace;
}

a{
	color: #428bca;
}

</style>
</head>
<body>

	<%
		String isExist = "none";
		String notExist = "none";
		
		String dormitoriesExist = (String) session.getAttribute("dormitoriesExist");
		
		System.out.println("dormitoriesExist -- " + dormitoriesExist);
		
		if(dormitoriesExist != null){
			notExist = "block";
		}
		else{
			isExist = "block";
		}
		
	%>

	<a href="/Dormitory_Manage_System/">
		<p id="title">NIIT 宿舍管理系统</p>
		<p id="title-tail">join &nbsp;us</p>
	</a>
	
	<div class="info" class="wrap" style="display: <%=notExist%>">
		<h1>暂时还没有宿舍信息 ~~</h1><br>
	</div>

	<div class="isinfo" class="wrap"
		style="display: <%=isExist%>; margin-left: 60px; margin-right: 60px;">
		<h1>宿舍信息如下 ~~</h1>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>宿舍名称</th>
					<th>宿舍地址</th>
					<th>宿舍电话号码</th>
				</tr>
			</thead>
			<tbody>
				<s:iterator value="#session.dormitories">
					<tr>
						<td class="info">${ dormitory_id }</td>
						<td class="success">${ dormitory_name }</td>
						<td class="warning">${ dormitory_address }</td>
						<td class="danger">${ dormitory_phone }</td>
					</tr>
				</s:iterator>
			</tbody>
		</table>
	</div>

</body>
</html>