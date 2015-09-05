<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="http://bootstrap.evget.com/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="http://cdn.bootcss.com/jquery/1.10.2/jquery.min.js"></script>
<script src="http://cdn.bootcss.com/twitter-bootstrap/3.0.3/js/bootstrap.min.js"></script>
<script src="resource/js/json2.js"></script>
<title>Insert title here</title>
</head>
<script type="text/javascript">
$(function () {
    $.ajax({
        url: 'recordgroups.shtml?m=getgroups',
        contentType: "application/json;charset=UTF-8",
        type: 'GET',
        dataType: 'json',
        //timeout: 1000,
        //cache: false,
        //async: true,
        beforeSend: LoadFunction, //加载执行方法  
        error: erryFunction,  //错误执行方法  
        success: succFunction //成功执行方法  
    })
    function LoadFunction() {
        $("#list").html('加载中...');
    }
    function erryFunction() {
        alert("error");
    }
    function succFunction(tt) {
        $("#list").html('');

        //eval将字符串转成对象数组
        //var json = { "id": "10086", "uname": "zhangsan", "email": "zhangsan@qq.com" };
        //json = eval(json);
        //alert("===json:id=" + json.id + ",uname=" + json.uname + ",email=" + json.email);
        alert(tt[""]);
        var json = eval(tt); //数组
        $.each(json, function (index, item) {
            //循环获取数据  
            var name = json[index].groupname;
            var idnumber = json[index].id;
           // var el=$("#recordgroup");
           // el.append('<option value="'+name+'">'+name+'</option>');
            $("#list").html($("#list").html() + "<br>" + name + " - " + idnumber + "<br/>");
        });
    }
});
</script>
<body>
<div class="container" id="test1">
</div>
<div class="container" id="test2">
</div>
<ul id="list">
</ul>
</body>
</html>