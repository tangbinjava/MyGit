<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>人物信息</title>
<script src="js/jquery.min.js"></script>
<script src="js/jquery-1.9.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>

<style type="text/css">
select {
	text-align: center;
	text-align-last: center;
}
</style>
<script type="text/javascript">
		$(document).ready(function(){
			$("#st1").change(function(){
				
				if($("#st1").val() == "请选择"){
			
		            
				} else {
					$.ajax({
						url:"MessageServlet",
						type:"post",
						data:{name:$("#st1").val()},
						dataType:"text",
						success:function(result){
							//犇哥的方法
							//var result=eval("("+result+")");
		                	//alert(result[0].Name)
		                	var jsonData = eval(result);
		                	$("#name").text(jsonData[0].name);
		                	$("#sex").text(jsonData[0].sex);
		                	$("#age").text(jsonData[0].age);
						}
					});
				}
			
			});
		});
	</script>
</head>
<body>
	<center>
		<h1 style="color:red;">就是在搞笑</h1>
	</center>
	<p>
		全村最靓的靓仔： <select id="st1">
			<option value="请选择">---请选择---</option>
			<option value="唐彬">唐彬</option>
			<option value="周玥蓉">周玥蓉</option>
			<option value="卢思琪">卢思琪</option>
		</select>
	<hr>
	<p>姓名：<label id="name" style="color:red;"></label>
	<p>性别：<label id="sex" style="color:red;"></label>
	<p>年龄：<label id="age" style="color:red;"></label>
</body>
</html>