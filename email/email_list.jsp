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
<script type="text/javascript">
	
	$(function(){
	
	})
</script>
</head>

<body>
	<center>
		<form style="margin-top: 20px;" action="/manage.onigiri/email/index" method="get">
			<div class="main">
				<div class="indexBg">
					<div class="pageBox">
						<a href="/manage.onigiri/email/addEmail" >新增</a>	
						<div class="tableBox">
							<table class="table" cellspacing="0" cellpadding="0">
								<thead>
									<tr>
										<th align="center">邮箱地址</th>
										<th align="center">邮箱密码</th>
										<th align="center">是否有效</th>
										<th align="center">操作</th>	
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${list}" var="item">
										<tr>
											<td class="bor_lef" align="center">${item.email}</td>	
											<td class="bor_lef" align="center">${item.password}</td>	
											<td class="bor_lef" align="center">${item.check}</td>		
											<td class="bor_lef" align="center"><a href="/manage.onigiri/email/edit">修改 </a></td>											
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</form>
	</center>
</body>
</html>
