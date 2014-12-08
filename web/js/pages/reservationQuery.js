function queryReservation()
{
	var rs = new RemoteService("queryBookingService");
	var param = new Array();
	param[0] = FormUtil.getValue("reservationQueryForm");
	rs.send(param,suc,null);
	$("#items").empty();
	var div = $('<div class="item">');
	div.html('<img style="padding:5px 3px 0px 0px;" src="../../images/load_small.gif">正在查询...');
	$("#items").append(div);
}

function suc(resp)
{
	$("#items").empty();
	var div = null;
	if(resp==null)
	{
		var div = $('<div class="item">');
		div.html('查询出错！');
		$("#items").append(div);
	}
	else if(resp.type == 'error')
	{
		var div = $('<div class="item">');
		div.html('查询出错！');
		$("#items").append(div);
	}
	else
	{
		if(resp.data == undefined || resp.data.length== 0)
		{
			div = $('<div class="item">');
			div.html('<div class="content">查无信息！</div><div class="cleaner"></div>');
			$("#items").append(div);
			return;
		}
		for(var i=0;i<resp.data.length;i++)
		{
			div = $('<div class="item">');
			div.html('<div class="content">'+resp.data[i].diagnosis+'</div><div class="date">'+
				resp.data[i].date+'</div><div class="cleaner"></div>');
			$("#items").append(div);
			
		}
	}
}

$(function(){
	$("#query-button").click(function(){
		queryReservation();
		return false;
	});
});