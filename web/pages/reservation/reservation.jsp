<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@page import="com.tornado.model.ReservationItemModel"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>预约维修</title>
	<meta name="keywords" content="南峰汽修,南峰,南峰汽修长" />
	<meta name="description" content="南峰汽修" />
	<link rel="stylesheet" type="text/css" media="screen" href="../../css/reset.css">
	<link rel="stylesheet" type="text/css" media="screen" href="../../css/style.css">
	<link rel="stylesheet" type="text/css" media="screen" href="../../css/slider.css">
	<script src="../../js/jquery-1.7.min.js"></script>
	<script src="../../js/jquery.easing.1.3.js"></script>
	<script type="text/javascript" src="../../js/framework/framework.js"></script>
	<script src="../../js/pages/reservation.js"></script>
	<script type="text/javascript" src="../../js/framework/CoreUtil.js"></script>

	<script src="../../js/superfish.js"></script>
	<link rel="stylesheet" href="../../css/nav.css" media="screen">
	<link rel="stylesheet" href="../../css/bbs.css" media="screen">
	<link rel="stylesheet" type="text/css" media="screen" href="../../css/main.css">
	<link rel="stylesheet" type="text/css" media="screen" href="../../css/pages/reservation.css">

	<script>
	$(document).ready(function(){
		
		$("#header").load(
			"../../header.html",
			function() {
				$("#menu-praise").addClass("current");
				$('#site-nav').superfish({
					animation: 	{height:"show"},
			        delay:		100,
			        speed:		10,
			        autoArrows:	true
			    });
			}
		);
		
	});
	</script>
	<%
		request.setAttribute("item1",new ReservationItemModel().getItem1());
		request.setAttribute("item2",new ReservationItemModel().getItem2());
	%>
</head>
<body>
<div id="header"></div>
	<!--==============================content================================-->
	<div id="main-content" style="width:949px;height:850px;padding:250px 20px 0px 20px;background:url(../../images/reservation_bg2.gif) 0 0 no-repeat; ">
		<div class="navigation" style="width: 909px;padding:0px;">
			<ul class="navigation-ul" id="myform">
				<li class="navigation-li" style="width: 909px;padding:0px 0px 0px 0px;">
					<table>
						<tr>
							<td width="40%">
								<div style="padding-left:50px;">
									<form id="models-form">
										<input type="hidden" name="diagnosis" id="input-diagnosis">
										<input type="hidden" name="username" id="input-username">
										<input type="hidden" name="contact" id="input-contact">
										<div class="item">
											<label>年份</label>
											<select name="year">
												<option>2004</option>
												<option>2005</option>
												<option>2006</option>
												<option>2007</option>
												<option>2008</option>
												<option>2009</option>
												<option>2010</option>
												<option>2011</option>
												<option>2012</option>
												<option>2013</option>
											</select>
										</div>
										<div class="item">
											<label>品牌</label>
											<input name="brand" alertmsg="请填写品牌" required="true" type="text"></input>
										</div>
										<div class="item">
											<label>型号</label>
											<input name="model" alertmsg="请填写型号" required="true" type="text"></input>
										</div>
										<div class="item">
											<label>排量</label>
											<input name="displacement" alertmsg="请填写排量" required="true" type="text"></input>
										</div>
									</form>
									<div>
										<img class="button" id="next-button1" src="../../images/next_button_blue.png"></img>
									</div>
								</div>
							</td>
							<td width="60%">
								<img src="../../images/reservation_ad.gif">
							</td>
						</tr>
					</table>
				</li>
				<li class="navigation-li" style="width: 909px;padding:0px 0px 0px 0px;">
					<div style="padding:0px 20px;">
						<div class="item" style="border: 1px solid rgb(159, 201, 217);">
							<ul style="margin-left:28px;">
								<li class="helper">提示：点击相应的选项即可进入下一级</li>
							</ul>
						</div>
						<div class="item" style="border: 3px solid rgb(159, 201, 217);height:120px;">
							<div class="title">如果不确定问题出在哪里，请根据下面的现象来寻找故障？</div>
							<ul class="module">
								<c:forEach items="${item1}" var="item">
									<li><a onclick="javascript:next('<c:out value="${item.id}" />')"><c:out value="${item.name}" /></a></li>	
								</c:forEach>
							</ul>
						</div>
						<div class="item" style="border: 3px solid rgb(159, 201, 217);height:180px;">
							<div class="title">如果知道确切的问题，请直接点击下面相关的链接？</div>
							<ul class="module2">
								<c:forEach items="${item2}" var="item">
									<li><a onclick="javascript:next('<c:out value="${item.id}" />')"><c:out value="${item.name}" /></a></li>	
								</c:forEach>
							</ul>
						</div>
						<div>
							<img id="next-button2" class="button" src="../../images/pre-button-blue.png"></img>
							<img id="next-button3" style="margin-left:20px;" class="button" src="../../images/button-blue-long.png"></img>
						</div>
					</div>
				</li>
				<li class="navigation-li" style="width: 909px;padding:0px 0px 0px 0px;">
					<div id="next1" style="padding:0px 20px;" >
						<div style="text-align:center;width:100%;">
							<img src="../../images/load_normal.gif" style="margin-top:100px;">
						</div>
					</div>
				</li>
				<li class="navigation-li" style="width: 909px;padding:0px 0px 0px 0px;">
					<table>
						<tr>
							<td width="40%">
								<div style="padding-left:50px;">
									<form id="contact-form">
										<div class="item">
											<p style="width:80px;float:left;">姓名</p>
											<input type="text" id="username-input" alertmsg="请填您的姓名" required="true"></input>
											<div class="clear"></div>
										</div>
										<div class="item">
											<p style="width:80px;float:left;">联系方式</p>
											<input type="text" id="contact-input" alertmsg="请填写正确的联系方式" required="true"></input>
											<div class="clear"></div>
										</div>
										<div class="item">
											<p>（电话或者电子邮箱）</p>
										</div>
										<div class="item">
											<label>您可以根据姓名及联系方式查询已预约记录，请正确填写信息！</label>
										</div>
									</form>
									<div>
										<img id="next-button9" class="button" src="../../images/pre-button-blue.png"></img>
										<img class="button" id="next-button0" src="../../images/button-blue-finish-2.png"></img>
									</div>
									<div id="submit-message" class="item"><img src="../../images/load_small.gif" />正在提交信息...</div>
								</div>
							</td>
							<td width="60%">
								<img src="../../images/reservation_ad.gif">
							</td>
						</tr>
					</table>
				</li>
			</ul>
		</div>
	</div>
	<!--==============================footer=================================-->
	<div class="clear"></div>
<!-- 	<footer style="margin:auto 0px;"> -->
<!-- 		<div class="soc-icons"> -->
<!-- 			<span>Follow Us:</span><a href="#"><img src="images/icon-1.jpg" alt=""></a><a href="#"><img src="images/icon-2.jpg" alt=""></a><a href="#"><img src="images/icon-3.jpg" alt=""></a> -->
<!-- 		</div> -->
<!-- 	</footer>	 -->
</body>
</html>