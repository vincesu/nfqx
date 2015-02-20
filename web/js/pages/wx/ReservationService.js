var ReservationServiceWid = null;
var _reservationServiceInitData = {
	"1":['打方向时有虚位',
	     '低速到高速提速困难',
	     '低速和高速方向抖',
	     '低速时方向抖',
	     '低速提速困难',
	     '高速时方向抖',
	     '高速提速困难',
	     '静止时方向重',
	     '起步提速困难',
	     '刹车偏软',
	     '刹车偏硬',
	     '刹车时抖动',
	     '刹车时偏右',
	     '刹车时偏左',
	     '行驶时方向重',
	     '行驶中偏右',
	     '行驶中偏左',
	     '制动力不够'],
	 "2":['变速箱漏油',
	      '差速器漏油',
	      '发动机漏水',
	      '发动机漏油',
	      '方向助力系统漏油',
	      '空调管渗漏',
	      '排气管冒白烟',
	      '排气管冒黑烟',
	      '排气管冒蓝烟',
	      '燃油管渗漏',
	      '刹车系统漏油',
	      '水箱漏水',
	      '水箱水管漏水',
	      '油箱渗漏'],
    "3":['废气味',
         '焦味',
         '霉味',
         '汽油味'],
    "4":['变速箱异响',
         '车身内部异响',
         '车身中部异响',
         '发动机异响',
         '发动机噪音大',
         '后底盘异响',
         '后门异响',
         '前车身异响',
         '前底盘异响',
         '前门异响'],
    "5":['车内灯具不亮或亮度不够',
         '灯光失效',
         '电动升降窗失效',
         '防盗失效',
         '各种开关失效',
         '后部灯具不亮或亮度不够',
         '喇叭不响或音量不够',
         '前部灯具不亮或亮度不够',
         '闪光失效',
         '雨刮失效',
         '自动门锁失效'],
    "6":['低速时油耗偏高',
         '高速时油耗偏高',
         '换机油后油耗偏高',
         '开空调时油耗偏高',
         '新加燃油后油耗偏高'],
    "7":[    '不制冷',
             '风口出水雾',
             '开空调有异味',
             '空调不送风',
             '空调结冰',
             '空调送风量不够',
             '制冷不够'],
    "8":[    '排气管过响',
             '排气管冒白烟',
             '排气管冒黑烟',
             '排气管冒蓝烟'],
    "9":[    '冷车时启动困难',
             '热车后启动困难',
             '斜坡上启动困难',
             '异常死火后启动困难'],
    "10":[    'ABS功能失效',
              '刹车偏软',
              '刹车偏硬',
              '刹车时抖动',
              '刹车时偏右',
              '刹车时偏左',
              '制动力不够'],
    "11":[    '变速箱漏油',
              '差速器漏油',
              '发动机漏水',
              '发动机漏油',
              '方向助力系统漏油',
              '空调管渗漏',
              '燃油管渗漏',
              '刹车系统漏油',
              '水箱漏水',
              '水箱水管漏水',
              '油箱渗漏'],
    "12":[    '低速到高速提速困难',
              '低速提速困难',
              '高速提速困难',
              '冷车时提速困难',
              '起步提速困难',
              '水温高时提速困难'],
    "13":[    '低速时水温高',
              '高速时水温高',
              '开空调时水温高',
              '停车等候时水温高',
              '行驶超过半小时水温高'],
    "14":[    '废气味',
              '焦味',
              '霉味',
              '汽油味'],
    "15":[    '变速箱异响',
              '车身内部异响',
              '车身中部异响',
              '发动机异响',
              '发动机噪音大',
              '后车身异响',
              '后底盘异响',
              '后门异响',
              '前车身异响',
              '前底盘异响',
              '前门异响'],
    "16":[    '打方向时有虚位',
              '低速和高速方向抖',
              '低速时方向抖',
              '高速时方向抖',
              '静止时方向重',
              '行驶时方向重',
              '行驶中偏右',
              '行驶中偏左',
              '转弯半径变大',
              '转弯半径变小']
};

var _reservationServiceInitTitle = {
		"1":"您有什么感觉",
		 "2":"您看到什么？",
		 "3":"您闻到什么气味",
		 "4":"您听到什么",
		 '5':"电器异常",
		 '6':"耗油异常",
		 '7':"空调异常",
		 '8':"排气异常",
		 '9':"启动异常",
		 '10':"刹车异常",
		 '11':"渗漏现象",
		 '12':"提速异常",
		 '13':"温度异常",
		 '14':"异常气味",
		 '15':"异响问题",
		 '16':"转向异常"
	};

$(function(){
	var wei = $(window).width();
    var hei = $(window).height();
    
    ReservationServiceWid = wei;
    
    $("#slider").css({"height": hei,"width":4*wei});
    $(".m-slider").css({"width": wei, "height": hei});
    $(".m-slider .cnt li").css({"width": wei, "height": hei});
    $(".m-slider .cnt li .myinput").css({"width": (wei*0.9-200)/2});
    $(".m-slider .cnt li .myinput input").css({"width": (wei*0.9-200)/2});
    
    $("#step1button").click(function() {
    	ReservationServiceNext();
    });
    
    var l = (wei-150)/2;
    $("#step1buttondiv").css({"left": l});
    
    $(".stepNext").click(function() {
    	ReservationServiceNext();
    });
    $(".stepPre").click(function() {
    	ReservationServicePre();
    });
    
    $(".stepSkip").click(function() {
    	reservationF();
    });
    
    $("#step3Next1").click(function(){
    	var v = $("#step3select1").val();
    	initStep4(v);
    	ReservationServiceNext();
    });
    
    $("#step3Next2").click(function(){
    	var v = $("#step3select2").val();
    	initStep4(v);
    	ReservationServiceNext();
    });
    
}); 

function ReservationServiceNext()
{
    $("#slider").animate({left:'-='+ReservationServiceWid+'px'},'slow');
}

function ReservationServicePre()
{
    $("#slider").animate({left:'+='+ReservationServiceWid+'px'},'slow');
}

function reservationF()
{
	alert('预约成功!');
}

function initStep4(val)
{
	$("#step4select").find("option").remove();
	if(_reservationServiceInitTitle[val]!=null)
	{
		$("#step4title").html(_reservationServiceInitTitle[val]);
	}
	if(_reservationServiceInitData[val]!=null)
	{
		for(var i in _reservationServiceInitData[val])
		{
			jQuery("<option value='"+i+"'>"+_reservationServiceInitData[val][i]+"</option>").appendTo("#step4select"); 
		}
	}
}

