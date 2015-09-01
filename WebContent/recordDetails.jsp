<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="http://cdn.bootcss.com/twitter-bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet" media="screen">
<!-- <link href="http://bootstrap.evget.com/dist/css/bootstrap-theme.min.css" rel="stylesheet"> -->
<link href="resource/css/details.css" rel="stylesheet">
<link href="resource/css/carousel.css" rel="stylesheet">
<title>Just Every Day Is Life--【XXXX】详细</title>
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
<body role="document">
	
<div class="navbar navbar-static-top navbar-inverse" role="navigation">
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
         <li><a href="/photos?m=all">相册</a></li>
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
       <div>
       	<a href="#"><span class="badge pull-right">退出</span></a>
       </div>
     </div><!-- /.nav-collapse -->
   </div><!-- /.container -->
</div><!-- /.navbar -->
<!-- Carousel
    ================================================== -->
<div class="container">
<div id="myCarousel" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
  </ol>
  <div class="carousel-inner" role="listbox">
    <div class="item active">
      <img class="first-slide" data-src="holder.js/100*200" alt="First slide">
      <div class="container">
        <div class="carousel-caption">
          <h1>日记工具上线</h1>
          <p>Note: If you're viewing this page via a <code>file://</code> URL, the "next" and "previous" Glyphicon buttons on 
          the left and right might not load/display properly due to web browser security rules.</p>
          <p><a class="btn btn-lg btn-primary" href="regist.html" role="button">Sign up today</a></p>
        </div>
      </div>
    </div>
    <div class="item">
      <img class="second-slide" data-src="holder.js/100*200" alt="Second slide">
      <div class="container">
        <div class="carousel-caption">
          <h1>最热文章</h1>
          <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. 
          Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
          <p><a class="btn btn-lg btn-primary" href="#" role="button">Learn more</a></p>
        </div>
      </div>
    </div>
    <div class="item">
      <img class="third-slide" data-src="holder.js/100*200" alt="Third slide">
      <div class="container">
        <div class="carousel-caption">
          <h1>文件上传功能开启 抓紧创建自己的精美相册吧</h1>
          <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. 
          Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
          <p><a class="btn btn-lg btn-primary" href="#" role="button">Browse gallery</a></p>
        </div>
      </div>
    </div>
  </div>
  <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div><!-- /.carousel -->
</div>
<div class="container">
<div class="blog-header">
    <h1 class="blog-title">The Bootstrap Blog</h1>
    <p class="lead blog-description">The official example template of creating a blog with Bootstrap.</p>
  </div>

  <div class="row">

    <div class="col-sm-8 blog-main">

      <div class="blog-post">
        <h2 class="blog-post-title">Sample blog post</h2>
        <p class="blog-post-meta">January 1, 2014 by <a href="#">Mark</a></p>

        <p>This blog post shows a few different types of content that's supported and styled with Bootstrap. Basic typography, i
        mages, and code are all supported.</p>
        <hr>
        <p>Cum sociis natoque penatibus et magnis <a href="#">dis parturient montes</a>, nascetur ridiculus mus. Aenean eu leo q
        uam. Pellentesque ornare sem lacinia quam venenatis vestibulum. Sed posuere consectetur est at lobortis. Cras mattis con
        sectetur purus sit amet fermentum.</p>
        <blockquote>
          <p>Curabitur blandit tempus porttitor. <strong>Nullam quis risus eget urna mollis</strong> ornare vel eu leo. Nullam id 
          dolor id nibh ultricies vehicula ut id elit.</p>
        </blockquote>
      </div><!-- /.blog-post -->
      
      <nav>
        <ul class="pager">
          <li><a href="#">Previous</a></li>
          <li><a href="#">Next</a></li>
        </ul>
      </nav>

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
<script src="http://cdn.bootcss.com/jquery/1.10.2/jquery.min.js"></script>
<script src="http://cdn.bootcss.com/twitter-bootstrap/3.0.3/js/bootstrap.min.js"></script>
<script src="http://bootstrap.evget.com/docs-assets/js/holder.min.js"></script>
</body>
</html>