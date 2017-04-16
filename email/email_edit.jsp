<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="iqb" uri="/WEB-INF/iqb_tag.tld"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!-- 新样式 -->
<link rel="stylesheet" type="text/css" href="../css/style.css" />
<link rel="stylesheet" type="text/css" href="../css/style3.css" />
<script type="text/javascript" src="../js/jquery.min.js"></script>
<script type="text/javascript" src="../js/common.js"></script>
<link rel="stylesheet" href="../css/jquery.datetimepicker.css" />
<script type="text/javascript" src="../js/jquery.datetimepicker.js"></script>
<script type="text/javascript" src="../js/laypage/laypage.js"></script>

<meta http-equiv="Pragma" content="no-cache" />
<meta http-equiv="Cache-Control" content="no-cache" />
<meta http-equiv="Expires" content="0" />
<title></title>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
	%>

</head>

<body>
	<center>
		<!-- 对应的提交action没有改变 等会改变 -->
		<form class="form" action="/manage.onigiri/email/addEmail" method="get">
			<label>
			
								<span class="search-span">邮箱地址：</span> 
								<input type="text" class="simple" name="email" id="email" value="${condition.email }" vstyle="width: 150px;" />
			</label>
			<label>
			
								<span class="search-span">邮箱密码：</span> 
								<input type="text" class="simple" name="password" id="password" value="${condition.password }" vstyle="width: 150px;" />
			</label>
			<label>
								<span class="search-span">邮箱有效性：</span>
								<input type="text" class="simple" name="check" id="check"  value="${condition.check }" vstyle="width:150px" />
			
			</label>
			<label class="of_h">
								 <input type="button"  class="btnFormBtm" id="btncommit"  value="确定" />
			 <input type="button"  class="btnFormBtm" id="cancelBtn"  value="取消"/>
								
			</label>
	
	
			<%-- <div class="main">
				<div class="indexBg">
					<div class="pageBox">
						<div class="inputBox clearfix">
							<!-- 已经修改完毕  注意调试问题 -->
						</div>
			
					</div>
				</div>
			</div> --%>
		</form>
		
		<script type="text/javascript">
	
		$("#cancelBtn").click(function(){
			window.location.href="<%= basePath%>/email/index"
		});
		
		$("#btncommit").click(function(){
			$.ajax({
				type : "POST",
				url : "/manage.onigiri/email/submit",
				dataType : "json", //返回数据类型
				data : $('#form').serialize(),
				success : function(res){
					var obj=eval(res);
					if(obj.code == 1){
						alert("提交成功,点击跳转置列表页面");
						window.location.href = "<%=basePath%>/email/index";
					}else{
						alert("修改失败:"+res.msg.retInfo);
					}
				}
			});
		});
		
	</script>
	</center>
</body>
</html>
