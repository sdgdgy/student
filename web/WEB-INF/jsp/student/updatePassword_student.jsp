<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" />
  <title>后台管理页面</title>
  <link rel="icon" href="${pageContext.request.contextPath}/statics/favicon.ico" type="image/ico">
  <meta name="keywords" content="LightYear,光年,后台模板,后台管理系统,光年HTML模板">
  <meta name="description" content="LightYear是一个基于Bootstrap v3.3.7的后台管理系统的HTML模板。">
  <meta name="author" content="yinqi">
  <link href="${pageContext.request.contextPath}/statics/css/bootstrap.min.css" rel="stylesheet">
  <link href="${pageContext.request.contextPath}/statics/css/materialdesignicons.min.css" rel="stylesheet">
  <link href="${pageContext.request.contextPath}/statics/css/style.min.css" rel="stylesheet">
</head>

<body>
<div class="lyear-layout-web">
  <div class="lyear-layout-container">
    <!--左侧导航-->
    <aside class="lyear-layout-sidebar">

      <!-- logo -->
      <div id="logo" class="sidebar-header">
        <a href="javascript:void(0)">
          <img src="${pageContext.request.contextPath}/statics/images/logo-sidebar.png" title="LightYear" alt="LightYear" />
        </a>
      </div>
      <div class="lyear-layout-sidebar-scroll">

        <nav class="sidebar-main">
          <ul class="nav nav-drawer">
            <li class="nav-item active"><a href="${pageContext.request.contextPath}/PageJump/toStudentPage"><i class="mdi mdi-home"></i> 学生界面首页 </a></li>
          </ul>
        </nav>
      </div>

    </aside>
    <!--End 左侧导航-->

    <!--头部信息-->
    <header class="lyear-layout-header">

      <nav class="navbar navbar-default">
        <div class="topbar">

          <div class="topbar-left">
            <div class="lyear-aside-toggler">
              <span class="lyear-toggler-bar"></span>
              <span class="lyear-toggler-bar"></span>
              <span class="lyear-toggler-bar"></span>
            </div>
            <span class="navbar-page-title"> 学生界面首页 </span>
          </div>

          <ul class="topbar-right">
            <li class="dropdown dropdown-profile">
              <a href="javascript:void(0)" data-toggle="dropdown">
                <img class="img-avatar img-avatar-48 m-r-10" src="${pageContext.request.contextPath}/statics/images/users/avatar.jpg" alt="笔下光年" />
                <span>${username} <span class="caret"></span></span>
              </a>
              <ul class="dropdown-menu dropdown-menu-right">
                <li> <a href="${pageContext.request.contextPath}/PageJump/toPersonalInformation_student"><i class="mdi mdi-account"></i> 个人信息</a> </li>
                <li> <a href="${pageContext.request.contextPath}/PageJump/toUpdatePassword_student"><i class="mdi mdi-lock-outline"></i> 修改密码</a> </li>
                <li class="divider"></li>
                <li> <a href="${pageContext.request.contextPath}/User/logout"><i class="mdi mdi-logout-variant"></i> 退出登录</a> </li>
              </ul>
            </li>
            <!--切换主题配色-->
            <li class="dropdown dropdown-skin">
              <span data-toggle="dropdown" class="icon-palette"><i class="mdi mdi-palette"></i></span>
              <ul class="dropdown-menu dropdown-menu-right" data-stopPropagation="true">
                <li class="drop-title"><p>主题</p></li>
                <li class="drop-skin-li clearfix">
                  <span class="inverse">
                    <input type="radio" name="site_theme" value="default" id="site_theme_1" checked>
                    <label for="site_theme_1"></label>
                  </span>
                  <span>
                    <input type="radio" name="site_theme" value="dark" id="site_theme_2">
                    <label for="site_theme_2"></label>
                  </span>
                  <span>
                    <input type="radio" name="site_theme" value="translucent" id="site_theme_3">
                    <label for="site_theme_3"></label>
                  </span>
                </li>
                <li class="drop-title"><p>LOGO</p></li>
                <li class="drop-skin-li clearfix">
                  <span class="inverse">
                    <input type="radio" name="logo_bg" value="default" id="logo_bg_1" checked>
                    <label for="logo_bg_1"></label>
                  </span>
                  <span>
                    <input type="radio" name="logo_bg" value="color_2" id="logo_bg_2">
                    <label for="logo_bg_2"></label>
                  </span>
                  <span>
                    <input type="radio" name="logo_bg" value="color_3" id="logo_bg_3">
                    <label for="logo_bg_3"></label>
                  </span>
                  <span>
                    <input type="radio" name="logo_bg" value="color_4" id="logo_bg_4">
                    <label for="logo_bg_4"></label>
                  </span>
                  <span>
                    <input type="radio" name="logo_bg" value="color_5" id="logo_bg_5">
                    <label for="logo_bg_5"></label>
                  </span>
                  <span>
                    <input type="radio" name="logo_bg" value="color_6" id="logo_bg_6">
                    <label for="logo_bg_6"></label>
                  </span>
                  <span>
                    <input type="radio" name="logo_bg" value="color_7" id="logo_bg_7">
                    <label for="logo_bg_7"></label>
                  </span>
                  <span>
                    <input type="radio" name="logo_bg" value="color_8" id="logo_bg_8">
                    <label for="logo_bg_8"></label>
                  </span>
                </li>
                <li class="drop-title"><p>头部</p></li>
                <li class="drop-skin-li clearfix">
                  <span class="inverse">
                    <input type="radio" name="header_bg" value="default" id="header_bg_1" checked>
                    <label for="header_bg_1"></label>
                  </span>
                  <span>
                    <input type="radio" name="header_bg" value="color_2" id="header_bg_2">
                    <label for="header_bg_2"></label>
                  </span>
                  <span>
                    <input type="radio" name="header_bg" value="color_3" id="header_bg_3">
                    <label for="header_bg_3"></label>
                  </span>
                  <span>
                    <input type="radio" name="header_bg" value="color_4" id="header_bg_4">
                    <label for="header_bg_4"></label>
                  </span>
                  <span>
                    <input type="radio" name="header_bg" value="color_5" id="header_bg_5">
                    <label for="header_bg_5"></label>
                  </span>
                  <span>
                    <input type="radio" name="header_bg" value="color_6" id="header_bg_6">
                    <label for="header_bg_6"></label>
                  </span>
                  <span>
                    <input type="radio" name="header_bg" value="color_7" id="header_bg_7">
                    <label for="header_bg_7"></label>
                  </span>
                  <span>
                    <input type="radio" name="header_bg" value="color_8" id="header_bg_8">
                    <label for="header_bg_8"></label>
                  </span>
                </li>
                <li class="drop-title"><p>侧边栏</p></li>
                <li class="drop-skin-li clearfix">
                  <span class="inverse">
                    <input type="radio" name="sidebar_bg" value="default" id="sidebar_bg_1" checked>
                    <label for="sidebar_bg_1"></label>
                  </span>
                  <span>
                    <input type="radio" name="sidebar_bg" value="color_2" id="sidebar_bg_2">
                    <label for="sidebar_bg_2"></label>
                  </span>
                  <span>
                    <input type="radio" name="sidebar_bg" value="color_3" id="sidebar_bg_3">
                    <label for="sidebar_bg_3"></label>
                  </span>
                  <span>
                    <input type="radio" name="sidebar_bg" value="color_4" id="sidebar_bg_4">
                    <label for="sidebar_bg_4"></label>
                  </span>
                  <span>
                    <input type="radio" name="sidebar_bg" value="color_5" id="sidebar_bg_5">
                    <label for="sidebar_bg_5"></label>
                  </span>
                  <span>
                    <input type="radio" name="sidebar_bg" value="color_6" id="sidebar_bg_6">
                    <label for="sidebar_bg_6"></label>
                  </span>
                  <span>
                    <input type="radio" name="sidebar_bg" value="color_7" id="sidebar_bg_7">
                    <label for="sidebar_bg_7"></label>
                  </span>
                  <span>
                    <input type="radio" name="sidebar_bg" value="color_8" id="sidebar_bg_8">
                    <label for="sidebar_bg_8"></label>
                  </span>
                </li>
              </ul>
            </li>
            <!--切换主题配色-->
          </ul>

        </div>
      </nav>

    </header>
    <!--End 头部信息-->

    <!--页面主要内容-->
    <main class="lyear-layout-content">

      <div class="container-fluid">

        <div class="row">
          <div class="col-lg-12">
            <div class="card">
              <div class="card-body">

                <form method="post" action="${pageContext.request.contextPath}/User/updatePassword_student" class="site-form" id="form-check">
                  <div class="form-group" id="new-password-div">
                    <label for="new-password">新密码</label>
                    <input type="password" class="form-control" name="newpwd" id="new-password" placeholder="输入新的密码" required>
                  </div>
                  <div class="form-group" id="confirm-password-div">
                    <label for="confirm-password">确认新密码</label>
                    <input type="password" class="form-control" name="confirmpwd" id="confirm-password" placeholder="确认新的密码" required>
                  </div>
                  <button type="button" class="btn btn-primary" id="update_password">修改密码</button>
                </form>

              </div>
            </div>
          </div>

        </div>

      </div>

    </main>
    <!--End 页面主要内容-->
  </div>
</div>

<script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/perfect-scrollbar.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/main.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/Chart.js"></script>
<script type="text/javascript">
  $("#update_password").click(function(){
    if($("#new-password").val()==$("#confirm-password").val()){
      $("#new-password-div").removeClass("form-group has-error");
      $("#confirm-password-div").removeClass("form-group has-error");
      $("#form-check").submit();
    }else{
      $("#new-password-div").addClass("form-group has-error");
      $("#confirm-password-div").addClass("form-group has-error");
    }
  })
</script>
</body>
</html>