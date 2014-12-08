$(function(){
	$("#submit-message").hide();
	
	$("#next-button1").click(function(){
		if(FormUtil.check(document.getElementById("models-form"),true))
		{
			$("#myform").animate({left:'-=909px'},'slow');
		}
	});
	
	$("#next-button2").click(function(){
		$("#myform").animate({left:'+=909px'},'slow');
	});
	
	$("#next-button3").click(function(){
		$("#input-diagnosis").val('-1');
		$("#myform").animate({left:'-=1818px'},'slow');
	});
	
	$("#next-button9").click(function(){
		$("#myform").animate({left:'+=1818px'},'slow');
	});
	
	$("#next-button0").click(function(){
		if(FormUtil.check(document.getElementById("contact-form"),true))
		{
			$("#input-username").val($("#username-input").val());
			$("#input-contact").val($("#contact-input").val());
//			console.log(FormUtil.getValue("models-form"));
			var rs = new RemoteService("addReservation");
			var param = new Array();
			param[0]=FormUtil.getValue("models-form");
			$("#submit-message").show();
			rs.send(param,addReservation, null);
		}
	});
	
});

function next(id) 
{
	$("#next1").empty().append($('<div style="text-align:center;width:100%;">').html('<img src="../../images/load_normal.gif" style="margin-top:100px;">'));
	
	$("#myform").animate({left:'-=909px'},'slow',function(){
		var rs = new RemoteService("getReservationItem");
		var param = new Array();
		param[0] = {id:id};
		rs.send(param,next_suc,null);
	});
}

function next_suc(resp)
{
	var p_div = $("#next1");
	
	p_div.empty();
	
	var s_div = $('<div class="item" style="border: 1px solid rgb(159, 201, 217);">');
	s_div.html('<ul style="margin-left:28px;"><li class="helper">提示：点击相应的选项即可进入下一级</li></ul>');
	p_div.append(s_div);
	
	var item = $('<div class="item" style="border: 3px solid rgb(159, 201, 217);height:'+(60+resp.data.length*15)+'px;">');
	var title = $('<div class="title">'+resp.data[0].description+'</div>');
	var ul = $('<ul class="module">');
	
	for(var i=0;i<resp.data.length;i++)
	{
		ul.append($('<li><a onclick="javascript:troubleshooting(\''+resp.data[i].id+'\')">'+resp.data[i].name+'</a></li>'));
	}
	
	item.append(title).append(ul);
	
	p_div.append(item);
	
	var buttons = $("<div>");
	buttons.html('<img id="next-button4" class="button" src="../../images/pre-button-blue.png"></img><img id="next-button5" style="margin-left:20px;" class="button" src="../../images/button-blue-long.png"></img>');
	
	p_div.append(buttons);
	
	$("#next-button4").click(function(){
		$("#myform").animate({left:'+=909px'},'slow');
	});
	
	$("#next-button5").click(function(){
		$("#input-diagnosis").val('-1');
		$("#myform").animate({left:'-=909px'},'slow');
	});
	
//	console.log(resp.data);
	
}

function troubleshooting(id)
{
	$("#input-diagnosis").val(id);
	$("#myform").animate({left:'-=909px'},'slow');
}

function addReservation(resp)
{
	$("#submit-message").hide();
	if(resp==null)
	{
		alert("预约维修失败！");
	}
	else
	{
		if(resp.type == 'error')
		{
			alert("预约维修失败！");
		}
		else
		{
			if($("#contact-input").val().indexOf('@')>0)
				alert("预约成功！我们将在24小时之内联系您，请及时查收电子邮件");
			else
				alert("预约成功！我们将在24小时之内联系您，请保持电话畅通");
		}
	}
}