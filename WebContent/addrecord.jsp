<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>生活的意义--你每天都在干什么？你明天计划干什么？新增记录</title>
<link href="http://bootstrap.evget.com/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="resource/css/details.css" rel="stylesheet">

<script src="resource/editor/ckeditor/ckeditor.js"></script>
<script src="resource/editor/ckeditor/adapters/jquery.js"></script>
<script src="http://cdn.bootcss.com/jquery/1.10.2/jquery.min.js"></script>
<script src="http://cdn.bootcss.com/twitter-bootstrap/3.0.3/js/bootstrap.min.js"></script>
<script src="resource/js/json2.js"></script>
<style type="text/css">
#footer {
  bottom: 0;
  width: 100%;
  /* Set the fixed height of the footer here */
  height: 60px;
  background-color: #f5f5f5;
}
.container .text-muted {
  text-align:center;
  margin: 20px 0;
}
</style>
</head>
<script type="text/javascript">
/* $(function(){
	$.ajax({
		type: "GET",
        contentType: "application/json;charset=UTF-8",
        url: "records.htm?m=getgroups",
        data: jsonStringRef,
        async: false,
	    dataType:"json",
	    success : function(groups) {
	    	alert(groups);
	    	groups=JSON.parse(groups);
	    	var el=$("#recordgroup");
	    	for(var group in groups){
	    		el.append('<option value="'+group.name+'">'+group.name+'</option>');
	    	}
        },
        error : function(r) {
        	alert("数据加载出错");
        }
	});
}); */
$(document).ready(function(){
	/*********加载分组******/
	$("#regsucc").hide();
	function Record(recordtitle,recordlabel,recordgroup,recordimages,recordcontent){
		this.recordlabel = recordlabel;
		this.recordtitle = recordtitle;
		this.recordcontent = recordcontent;
		this.recordgroup = recordgroup;
		this.recordimages = recordimages;
	}
	$("#addBtn").click(function() {
		var title=$("#recordtitle").val();
		var label=$("#recordlabel").val();
		var content=$("#recordcontent").val();
		var imag=$("#recordimages").val();
		var group=$("#recordgroup").val();
	    var infoRef = new Record(title, label, content, imag, group);
	    var jsonStringRef = JSON.stringify(infoRef);
	   $.ajax({
	        type: "POST",
	        contentType: "application/json;charset=UTF-8",
	        url: "/records.htm?m=add",
	        data: jsonStringRef,
	        //async: false,
		    dataType:"json",
		    success : function(r) {
				$("#regsucc").show();
	        },
	        error : function(r) {
	        	$("#regsucc").show().html("添加失败");
	        }
	    });
	   return false;//禁止跳转
	});
});
</script>
<body>
<div class="navbar navbar-default navbar-inverse" role="navigation">
   <div class="container">
     <div class="navbar-header">
       <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
         <span class="sr-only">Toggle navigation</span>
         <span class="icon-bar"></span>
         <span class="icon-bar"></span>
         <span class="icon-bar"></span>
         <span class="icon-bar"></span>
       </button>
       <a class="navbar-brand" href="http://127.0.0.1:8086/DailyRecord/">DailyRecord--生活的意义</a>
     </div>
     <div class="collapse navbar-collapse">
       <ul class="nav navbar-nav">
         <li class="active"><a href="/index?m=index">首页</a></li>
         <li><a href="/photos?m=all"><span class="badge pull-right">42</span>相册</a></li>
         <li><a href="/records?m=types">分类</a></li>
         <li><a href="/records?m=getall">所有</a></li>
         <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">开发中 <b class="caret"></b></a>
            <ul class="dropdown-menu">
              <li><a href="#">文章</a></li>
              <li><a href="#">音乐</a></li>
              <li><a href="#"></a></li>
              <li class="divider"></li>
              <li class="dropdown-header">工具</li>
              <li><a href="#">短信日记</a></li>
              <li><a href="#">微信日记</a></li>
              <li><a href="#">日记导出</a></li>
            </ul>
          </li>
       </ul>
       <ul class="nav navbar-nav navbar-right">
	       	<li class="dropdown">
	        <a href="#" class="dropdown-toggle" data-toggle="dropdown">功能 <b class="caret"></b></a>
	        	<ul class="dropdown-menu">
		          <li><a href="addrecord.jsp">新增</a></li>
		          <li><a href="recordslist.jsp">查看全部</a></li>
		          <li class="divider"></li>
		          <li><a href="#">我的计划</a></li>
	        	</ul>
	      	</li>
       </ul>
       <ul class="nav navbar-nav navbar-right">
       	<li class="dropdown">
      	<a href="#" class="dropdown-toggle" data-toggle="dropdown">个人中心 <b class="caret"></b></a>
      		<ul class="dropdown-menu">
	          <li><a href="#">退出登录</a></li>
        	</ul>
      	</li>
       </ul>
     </div><!-- /.nav-collapse -->
   </div><!-- /.container -->
</div><!-- /.navbar -->
<div class="container">

  <div class="row">

    <div class="col-sm-8 blog-main">
    <div class="alert alert-success" id="regsucc">添加成功</div>
    <form role="form" method="post" id="addForm">
	    <label class="control-label">标题</label>
	    <input id=recordtitle name="recordtitle" type="text" class="form-control" required autofocus
	    data-provide="typeahead" data-items="4" data-source="">
	    
	    <label class="control-label">标签</label>
	    <input id=recordlabel name="recordlabel" type="text" class="form-control" required>
	    
	    <label class="control-label">分组</label>
	    <select class="span6 m-wrap form-control" name="recordgroup" id="recordgroup" required>
			
  		</select>
  		<label class="control-label" for="fileInput">图片</label>
  		<input class="input-file form-control" id="fileInput" type="file" name="recordimages">
	    <label class="control-label">内容</label>
		<div class="block-content collapse in">
		<textarea id="ckeditor_standard" class="ckeditor" name="recordcontent" required></textarea>
		</div>
		<button class="btn btn-primary navbar-right" id="addBtn">保存发布</button>
	</form>

    </div><!-- /.blog-main -->

    <div class="col-sm-3 col-sm-offset-1 blog-sidebar">
      <div class="sidebar-module sidebar-module-inset">
        <h4>About</h4>
        <p>Etiam porta <em>sem malesuada magna</em> mollis euismod. Cras mattis consectetur purus sit amet fermentum. Aenean lac
        inia bibendum nulla sed consectetur.</p>
      </div>
      <div class="sidebar-module">
        <h4>Archives</h4>
        <ol class="list-unstyled">
          <li><a href="#">March 2014</a></li>
          <li><a href="#">February 2014</a></li>
          <li><a href="#">January 2014</a></li>
          <li><a href="#">December 2013</a></li>
          <li><a href="#">November 2013</a></li>
          <li><a href="#">October 2013</a></li>
          <li><a href="#">September 2013</a></li>
          <li><a href="#">August 2013</a></li>
          <li><a href="#">July 2013</a></li>
          <li><a href="#">June 2013</a></li>
          <li><a href="#">May 2013</a></li>
          <li><a href="#">April 2013</a></li>
        </ol>
      </div>
      <div class="sidebar-module">
        <h4>Elsewhere</h4>
        <ol class="list-unstyled">
          <li><a href="#">GitHub</a></li>
          <li><a href="#">Twitter</a></li>
          <li><a href="#">Facebook</a></li>
        </ol>
      </div>
    </div><!-- /.blog-sidebar -->

  </div><!-- /.row -->
</div><!--/.container -->

<div id="footer">
	<div class="container">
	   <p class="text-muted">©2015 DailyR</p>
	</div>
</div>
</body>
</html>