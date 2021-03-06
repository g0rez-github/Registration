<%--
  Created by IntelliJ IDEA.
  User: 86138
  Date: 2021-09-30
  Time: 20:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <title>登陆页面</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="shortcut icon"  href="img/bitbug_favicon.ico" type="image/x-icon" />
    <!--图标-->
    <link rel="stylesheet" type="text/css" href="css/font-awesome.min.css">

    <!--布局框架-->
    <link rel="stylesheet" type="text/css" href="css/util.css">

    <!--主要样式-->
    <link rel="stylesheet" type="text/css" href="css/main.css">
</head>

<body>

<div class="login">
    <div class="container-login100">
        <div class="wrap-login100">
            <div class="login100-pic js-tilt" data-tilt>
                <img src="img/img-01.png" alt="IMG">
            </div>

            <form class="login100-form validate-form" action="one" method="post">
				<span class="login100-form-title">
					欢迎登陆
				</span>

                <div class="wrap-input100 validate-input">
                    <input class="input100" type="text" name="username" placeholder="用户名">
                    <span class="focus-input100"></span>
                    <span class="symbol-input100">
						<i class="fa fa-envelope" aria-hidden="true"></i>
					</span>
                </div>

                <div class="wrap-input100 validate-input">
                    <input class="input100" type="password" name="password" placeholder="密码">
                    <span class="focus-input100"></span>
                    <span class="symbol-input100">
						<i class="fa fa-lock" aria-hidden="true"></i>
					</span>
                </div>

                <div class="container-login100-form-btn">
                    <button class="login100-form-btn">
                        登陆
                    </button>
                </div>
                <div class="text-center p-t-136">
                    <a class="txt2" href="register.jsp">
                        还没有账号？立即注册
                        <i class="fa fa-long-arrow-right m-l-5" aria-hidden="true"></i>
                    </a>
                </div>
            </form>
        </div>
    </div>
</div>

</body>
</html>