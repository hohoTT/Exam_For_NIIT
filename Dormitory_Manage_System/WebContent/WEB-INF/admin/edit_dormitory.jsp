<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>编辑宿舍信息</title>

<link rel="stylesheet" href="static/css/global.css" media="all">

<link rel="stylesheet" href="static/css/bootstrap/bootstrap.min.css" />
<link rel="stylesheet"
	href="static/css/bootstrap/todc-bootstrap.min.css" />

<script type="text/javascript" src="static/js/config.js"></script>
<script type="text/javascript" src="static/js/require.js"></script>

<script type="text/javascript"
	src="static/js/admin/manage/edit_dormitory.js"></script>

<!-- 自定义CSS样式 -->
<style type="text/css">
#title {
	font-size: 30px;
}

#title-tail {
	font-size: 20px;
}

h2 {
	font-size: 30px;
	font-family: source_code_pro, "PingFangSC-Regular", "Heiti SC",
		"Microsoft Yahei", monospace;
}

a {
	color: #428bca;
}
</style>
</head>
<body>
	<a href="/Dormitory_Manage_System/">
		<p id="title">NIIT 宿舍管理系统</p>
		<p id="title-tail">join &nbsp;us</p>
	</a>
	
	<div id="register-div" class="container main">
		<div class="col-md-6 col-md-offset-3">
			<h2 class="text-center">编辑宿舍信息</h2>

			<form id="register-form" method="post">

				<div class="form-group">
					<label for="dormitory_id">宿舍ID</label> <input type="number"
						class="form-control input-lg" id="dormitory_id" value="${ dormitory_id }"
						name="dormitory_id" placeholder="宿舍ID" data-error="请填写宿舍ID"
						required autofocus>
					<div class="help-block with-errors"></div>
				</div>

				<div class="form-group">
					<label for="dormitory_name">宿舍名称</label> <input type="text"
						class="form-control input-lg" id="dormitory_name" value="${ dormitory_name }"
						name="dormitory_name" placeholder="宿舍名称" data-error="请填写宿舍名称"
						required>
					<div class="help-block with-errors"></div>
				</div>

				<div class="form-group">
					<label for="dormitory_address">宿舍地址</label> <input type="text"
						class="form-control input-lg" id="dormitory_address" value="${ dormitory_address }"
						name="dormitory_address" placeholder="宿舍地址" data-error="请填写宿舍地址"
						required>
					<div class="help-block with-errors"></div>
				</div>

				<div class="form-group">
					<label for="dormitory_phone">宿舍电话号码</label> <input type="number"
						class="form-control input-lg" id="dormitory_phone" value="${ dormitory_phone }"
						name="dormitory_phone" placeholder="宿舍电话号码" data-error="请填写宿舍电话号码"
						required>
					<div class="help-block with-errors"></div>
				</div>

				<div class="form-group">
					<button type="submit" class="btn btn-primary">提交</button>
				</div>

			</form>
		</div>
	</div>

	<jsp:include page="../base/footer.jsp"></jsp:include>

</body>
</html>