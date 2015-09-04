<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="http://cdn.bootcss.com/twitter-bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet" media="screen">
<!-- <link href="http://bootstrap.evget.com/dist/css/bootstrap-theme.min.css" rel="stylesheet"> -->
<link href="/resource/css/index.css">
<title>生活的意义--你每天都在干什么？你明天计划干什么？</title>
<style type="text/css">
<!-- 由于bootstrap.min.css会覆盖index的内容 所以 在这里单独写 -->
.marketing {
  padding-right: 15px;
  padding-left: 15px;
}

.marketing .col-lg-4 {
  margin-bottom: 20px;
  text-align: center;
}
.marketing h2 {
  font-weight: normal;
}
.marketing .col-lg-4 p {
  margin-right: 10px;
  margin-left: 10px;
}
#footer {
  bottom: 0;
  width: 100%;
  /* Set the fixed height of the footer here   navbar-inverse*/
  height: 60px;
  background-color: #f5f5f5;
}
.container .text-muted {
  text-align:center;
  margin: 20px 0;
}
</style>
</head>
<body role="document">
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
		          <li><a href="#">新增</a></li>
		          <li><a href="#">查看全部</a></li>
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
<div class="container marketing">
	<ol class="breadcrumb">
  	<li><a href="#">Home</a></li>
  	<li><a href="#">Library</a></li>
  	<li class="active">Data</li>
	</ol>
	<div class="jumbotron">
		<h1>你的面包屑</h1>
		<p>你每天都在干什么？你明天计划干什么？你想到的、你看到的、你喜欢的、你想记住的、你想了解的，都可以发布在这里，我们会向你展示有所你想完成的。</p>
		<p><a href="#" class="btn btn-primary btn-lg" role="button">Learn more &raquo;</a></p>
	</div><!-- /.jumbotron -->
	
    <div class="row">
    <!-- for each -->
      <div class="col-lg-3">
        <img class="img-thumbnail" src="resource/imgs/20150901.jpg" alt="Generic placeholder image">
        <h3>我眼中的你。</h3>
        <p>这个世界上，从来就没有最好的，只有最合适的。比如云朵和天空，微风和草地，比如我眼中的你，以及，你眼中的我。</p>
        <p><a class="btn btn-primary" href="#" role="button">View details &raquo;</a></p>
      </div><!-- /.col-lg-3 -->
    <!-- for each end -->
      <div class="col-lg-3">
        <img class="img-thumbnail" src="resource/imgs/20150902.jpg" alt="Generic placeholder image">
        <h3>一个人，没有同类。</h3>
        <p>这个世界上，从来就没有最好的，只有最合适的。比如云朵和天空，微风和草地，比如我眼中的你，以及，你眼中的我。</p>
        <p><a class="btn btn-primary" href="#" role="button">View details &raquo;</a></p>
      </div><!-- /.col-lg-3 -->
      <div class="col-lg-3">
        <img class="img-thumbnail" src="resource/imgs/20150903.jpg" alt="Generic placeholder image">
        <h3>越想敲的门，叩的声越轻。</h3>
        <p>这个世界上，从来就没有最好的，只有最合适的。比如云朵和天空，微风和草地，比如我眼中的你，以及，你眼中的我。</p>
        <p><a class="btn btn-primary" href="#" role="button">View details &raquo;</a></p>
      </div><!-- /.col-lg-3 -->
      <div class="col-lg-3">
        <img class="img-thumbnail" src="resource/imgs/20150904.jpg" alt="Generic placeholder image">
        <h3>越想敲的门，叩的声越轻。</h3>
        <p>这个世界上，从来就没有最好的，只有最合适的。比如云朵和天空，微风和草地，比如我眼中的你，以及，你眼中的我。</p>
        <p><a class="btn btn-primary" href="#" role="button">View details &raquo;</a></p>
      </div><!-- /.col-lg-3 -->
    </div><!-- /.row -->
    <div class="row">
    <!-- for each -->
      <div class="col-lg-3">
        <img class="img-thumbnail" data-src="holder.js/100%x180" alt="Generic placeholder image">
        <h3>越想敲的门，叩的声越轻。</h3>
        <p>这个世界上，从来就没有最好的，只有最合适的。比如云朵和天空，微风和草地，比如我眼中的你，以及，你眼中的我。</p>
        <p><a class="btn btn-primary" href="#" role="button">View details &raquo;</a></p>
      </div><!-- /.col-lg-3 -->
      <div class="col-lg-3">
        <img class="img-thumbnail" data-src="holder.js/100%x180" alt="Generic placeholder image">
        <h3>越想敲的门，叩的声越轻。</h3>
        <p>这个世界上，从来就没有最好的，只有最合适的。比如云朵和天空，微风和草地，比如我眼中的你，以及，你眼中的我。</p>
        <p><a class="btn btn-primary" href="#" role="button">View details &raquo;</a></p>
      </div><!-- /.col-lg-3 -->
      <div class="col-lg-3">
        <img class="img-thumbnail" data-src="holder.js/100%x180" alt="Generic placeholder image">
        <h3>我眼中的你。</h3>
        <p>这个世界上，从来就没有最好的，只有最合适的。比如云朵和天空，微风和草地，比如我眼中的你，以及，你眼中的我。</p>
        <p><a class="btn btn-primary" href="#" role="button">View details &raquo;</a></p>
      </div><!-- /.col-lg-3 -->
    <!-- for each end -->
      <div class="col-lg-3">
        <img class="img-thumbnail" data-src="holder.js/100%x180" alt="Generic placeholder image">
        <h3>一个人，没有同类。</h3>
        <p>这个世界上，从来就没有最好的，只有最合适的。比如云朵和天空，微风和草地，比如我眼中的你，以及，你眼中的我。</p>
        <p><a class="btn btn-primary" href="#" role="button">View details &raquo;</a></p>
      </div><!-- /.col-lg-3 -->
    </div><!-- /.row -->
    <ul class="pager">
     <li class="previous"><a href="#">&larr; Older</a></li>
  	 <li class="next"><a href="#">Newer &rarr;</a></li>
	</ul>
	<ul class="pagination">
  	  <li class="disabled"><span>&laquo;</span></li>
  	  <li class="active"><span>1 <span class="sr-only">(current)</span></span></li>
  	  <li><a href="#">2</a></li>
	  <li><a href="#">3</a></li>
	  <li><a href="#">4</a></li>
	  <li><a href="#">5</a></li>
	  <li><a href="#">&raquo;</a></li>
	</ul>
</div>

<div id="footer">
	<div class="container">
	   <p class="text-muted">©2015 DailyR</p>
	</div>
</div>
<script src="http://cdn.bootcss.com/jquery/1.10.2/jquery.min.js"></script>
<script src="http://cdn.bootcss.com/twitter-bootstrap/3.0.3/js/bootstrap.min.js"></script>
<script src="http://bootstrap.evget.com/docs-assets/js/holder.min.js"></script>
</body>
</html>