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
                        <li class="nav-item active"><a href="${pageContext.request.contextPath}/PageJump/toManagement"><i class="mdi mdi-home"></i> 后台首页 </a></li>
                        <li class="nav-item nav-item-has-subnav">
                            <a href="${pageContext.request.contextPath}/PageJump/toDepartment"><i class="mdi mdi-format-align-justify"></i> 系别表</a>
                        </li>
                        <li class="nav-item nav-item-has-subnav">
                            <a href="${pageContext.request.contextPath}/PageJump/toClass"><i class="mdi mdi-format-align-justify"></i> 班级表</a>
                        </li>
                        <li class="nav-item nav-item-has-subnav">
                            <a href="${pageContext.request.contextPath}/PageJump/toGrade"><i class="mdi mdi-format-align-justify"></i> 成绩表</a>
                        </li>
                        <li class="nav-item nav-item-has-subnav">
                            <a href="${pageContext.request.contextPath}/PageJump/toUser"><i class="mdi mdi-format-align-justify"></i> 用户表</a>
                        </li>
                        <li class="nav-item nav-item-has-subnav">
                            <a href="${pageContext.request.contextPath}/PageJump/toCourse"><i class="mdi mdi-format-align-justify"></i> 课程表</a>
                        </li>
                        <li class="nav-item nav-item-has-subnav">
                            <a href="${pageContext.request.contextPath}/PageJump/toStudent"><i class="mdi mdi-format-align-justify"></i> 学生表</a>
                        </li>
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
                        <span class="navbar-page-title"> 后台首页 </span>
                    </div>

                    <ul class="topbar-right">
                        <li class="dropdown dropdown-profile">
                            <a href="javascript:void(0)" data-toggle="dropdown">
                                <img class="img-avatar img-avatar-48 m-r-10" src="${pageContext.request.contextPath}/statics/images/users/avatar.jpg" alt="笔下光年" />
                                <span>${username} <span class="caret"></span></span>
                            </a>
                            <ul class="dropdown-menu dropdown-menu-right">
                                <li> <a href="${pageContext.request.contextPath}/PageJump/toPersonalInformation"><i class="mdi mdi-account"></i> 个人信息</a> </li>
                                <li> <a href="${pageContext.request.contextPath}/PageJump/toUpdatePassword"><i class="mdi mdi-lock-outline"></i> 修改密码</a> </li>
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
            <c:if test="${msg!=null}">
                <script type="text/javascript">
                    alert('${msg}');
                </script>
            </c:if>
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="card">
                            <div class="card-header">
                                <h4>添加成绩表信息</h4>
                            </div>
                            <div class="card-body">
                                <form action="${pageContext.request.contextPath}/grade/add" method="post">
                                    <div class="form-group">
                                        <input class="form-control" type="hidden" name="DepartmentId" value="" id="DepartmentId">
                                        <label>系别</label>
                                        <div class="input-group">
                                            <input class="form-control" type="text" name="DepartmentName" value="" id="DepartmentName" disabled required>
                                            <div class="input-group-btn">
                                                <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><span class="caret"></span></button>
                                                <ul class="dropdown-menu dropdown-menu-right">
                                                    <c:forEach var="department" items="${requestScope.get('departmentlist')}">
                                                        <li><a href="javascript:void(0);" onclick="departmentValue(${department.getDepartmentId()},'${department.getDepartmentName()}')">${department.getDepartmentName()}</a></li>
                                                    </c:forEach>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <input class="form-control" type="hidden" name="ClassId" value="" id="ClassId">
                                        <label>班级</label>
                                        <div class="input-group">
                                            <input class="form-control" type="text" name="ClassName" value="" id="ClassName" disabled required>
                                            <div class="input-group-btn">
                                                <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><span class="caret"></span></button>
                                                <ul class="dropdown-menu dropdown-menu-right" id="class_ul">
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label>学号</label>
                                        <input class="form-control" type="text" value="" required autocomplete="off" disabled id="StudentId_show">
                                    </div>
                                    <div class="form-group">
                                        <input class="form-control" type="hidden" value="" id="StudentId" name="id">
                                        <label>选择学生</label>
                                        <div class="input-group">
                                            <input class="form-control" type="text" name="StudentName" value="" id="StudentName" disabled required>
                                            <div class="input-group-btn">
                                                <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><span class="caret"></span></button>
                                                <ul class="dropdown-menu dropdown-menu-right" id="student_ul">
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <input class="form-control" type="hidden" name="CourseId" value="" id="CourseId">
                                        <label>课程所属</label>
                                        <div class="input-group">
                                            <input class="form-control" type="text" name="CourseName" value="" id="CourseName" disabled required>
                                            <div class="input-group-btn">
                                                <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><span class="caret"></span></button>
                                                <ul class="dropdown-menu dropdown-menu-right">
                                                    <c:forEach var="course" items="${requestScope.get('courselist')}">
                                                        <li><a href="javascript:void(0);" onclick="courseValue(${course.getCourseId()},'${course.getCourseName()}')">${course.getCourseName()}</a></li>
                                                    </c:forEach>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label>成绩</label>
                                        <input class="form-control" type="text" value="" required autocomplete="off" name="Mark">
                                    </div>
                                    <div class="form-group">
                                        <button class="btn btn-primary" type="submit">保存</button>
                                    </div>
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
    function courseValue(id,coursename){
        $("#CourseId").val(id);
        $("#CourseName").val(coursename);
    }
    function classValue(id,calssname){
        $("#ClassId").val(id);
        $("#ClassName").val(calssname);
        $("#student_ul").find("li").remove();
        $.ajax({
            type:"post",
            url:"${pageContext.request.contextPath}/grade/queryStudentByClassId",
            contentType: "application/x-www-form-urlencoded;charset=utf-8",
            data:{"id":id},
            success:function (data) {
                json=JSON.parse(data.toString());
                console.log(json);
                for(var i = 0; i < json.length; i++){
                    $("#student_ul").append("<li><a href=\"javascript:void(0);\" onclick=\"studentValue("+json[i].id+",'"+json[i].name+"')\">"+json[i].name+"</a></li>");
                }
            }
        })
    }
    function departmentValue(id,departmentname){
        $("#DepartmentId").val(id);
        $("#DepartmentName").val(departmentname);
        $("#class_ul").find("li").remove();
        $.ajax({
            type:"post",
            url:"${pageContext.request.contextPath}/grade/queryClassByDepartmentId",
            contentType: "application/x-www-form-urlencoded;charset=utf-8",
            data:{"id":id},
            success:function (data) {
                json=JSON.parse(data.toString());
                for(var i = 0; i < json.length; i++){
                    $("#class_ul").append("<li><a href=\"javascript:void(0);\" onclick=\"classValue("+json[i].ClassId+",'"+json[i].ClassName+"')\">"+json[i].ClassName+"</a></li>");
                }
            }
        })
    }
    function studentValue(id,studentname){
        $("#StudentId_show").val(id);
        $("#StudentId").val(id);
        console.log($("#StudentId").val());
        $("#StudentName").val(studentname);
    }
</script>
</body>
</html>