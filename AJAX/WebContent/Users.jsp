<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户信息保存</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>	
</head>
<body>
	<div style="width:40%;margin-left:auto;margin-right:auto;">
		<form id="fm" class="form-horizontal" method="post" action="LoginServlet">
			<div class="form-group">
				<label for="inputEmail3" class="col-sm-2 control-label">账号</label>
				<div class="col-sm-10">
					<input class="form-control" id="inputEmail3" name="name">
				</div>
			</div>
			<div class="form-group">
				<label for="inputPassword3" class="col-sm-2 control-label">密码</label>
				<div class="col-sm-10">
					<input type="password" class="form-control" id="inputPassword3"
						name="password"> 
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-default">登录</button>
					<button type="reset" class="btn btn-default"
						style="margin-left:55%;">重置</button>
				</div>
			</div>

		</form>
	</div>
</body>
</html>