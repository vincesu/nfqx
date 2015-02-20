var ReservationServiceWid = null;
$(function(){
	var wei = $(window).width();
    var hei = $(window).height();
    
    ReservationServiceWid = wei;
    
    var l = (wei-200)/2;
    $('.center').css({"left": l});
    
    var l = (wei-330)/2;
    $('.center2').css({"left": l});
    
    $("#slider").css({"height": hei,"width":4*wei});
    $(".m-slider").css({"width": wei, "height": hei});
    $(".m-slider .cnt li").css({"width": wei, "height": hei});
    $(".m-slider .cnt li .myinput").css({"width": "170px"});
    $(".m-slider .cnt li .myinput input").css({"width": "170px"});
    
//    $("#step1button").click(function() {
//    	ReservationServiceNext();
//    });
    
//    var l = (wei-150)/2;
//    $("#step1buttondiv").css({"left": l});
    
    $(".stepNext").click(function() {
    	ReservationServiceNext();
    });
    $(".stepPre").click(function() {
    	ReservationServicePre();
    });
    
//    $(".stepSkip").click(function() {
//    	reservationF();
//    });
    
    $("#businessservicestepNext").click(function(){
    	var r = $("#xminput").val();
    	if(r.indexOf('先生')>=0)
        	$('#xming0').html('尊敬的'+r+'：');
        else
        	$('#xming0').html('尊敬的'+r+'先生：');
    	ReservationServiceNext();
    });
//    
//    $("#step3Next2").click(function(){
//    	var v = $("#step3select2").val();
//    	initStep4(v);
//    	ReservationServiceNext();
//    });
    
}); 

function ReservationServiceNext()
{
    $("#slider").animate({left:'-='+ReservationServiceWid+'px'},'slow');
}

function ReservationServicePre()
{
    $("#slider").animate({left:'+='+ReservationServiceWid+'px'},'slow');
}

