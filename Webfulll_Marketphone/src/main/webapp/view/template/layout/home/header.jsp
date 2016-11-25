  <%@page contentType="text/html" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
          <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div id="header_top">
			<div class="container">
				<div class="row">
					<div class="col-md-7">
						<div class="row">
						<div class="col-sm-2">
						<img alt="" src="resource/img/shakinghand.png" style="width:100px">
						</div>
							<div class="col-sm-10">
						<div class="header_slogan">
							SẢN PHẨM MỚI NHẤT-DỊCH VỤ TỐT NHẤT-CHẤT LƯỢNG TỐT NHẤT
						</div>
							</div>
						</div>
					</div>
					<div class="col-md-5">
						<div class="menu-acount pull-right">
							<ul class="nav nav-pills account-cust">
							<li>
							<span>${message }</span>
							  <c:if test="${pageContext.request.userPrincipal.name != null}">
        <form id="logoutForm" method="POST" action="${pageContext.request.contextPath}/logout">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>

        <p>Chào ${pageContext.request.userPrincipal.name} | <a onclick="document.forms['logoutForm'].submit()">Logout</a></p>

   									</c:if>
   									</li>
									<li>
									<a href="#" data-toggle="modal" data-target="#login-modal"><span class="glyphicon glyphicon-user">
									
									</span>LOGIN</a>
									<div class="modal fade" id="login-modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
    	  <div class="modal-dialog">
				<div class="loginmodal-container">
					<h1>Login to Your Account</h1><br>
				   <form method="POST" action="${pageContext.request.contextPath}/login" class="form-signin">
        <h2 class="form-heading">Log in</h2>

        <div class="form-group ${error != null ? 'has-error' : ''}">
            <span style="color:red">${message}</span>
            <input name="username" type="text" class="form-control" placeholder="Username"
                   autofocus="true"/><br>
            <input name="password" type="password" class="form-control" placeholder="Password"/>
            <span style="color:red">${error}</span>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/><br>

            <button class="btn btn-lg btn-primary btn-block" type="submit">Log In</button>
            <h4 class="text-center"><a href="${contextPath}/registration">Create an account</a></h4>
        </div>

    </form>
					
				  <div class="login-help">
					<a href="#">Register</a> - <a href="#">Forgot Password</a>
				  </div>
				</div>
			</div>
		  </div>
    
								</li>
								<li>
										<a href="${pageContext.request.contextPath}/registration"><i class="glyphicon glyphicon-user"></i><span>SIGN UP</span></a>

								</li>
							</ul>
						</div>
					</div>
				</div>
			</div>
			</div>
	<div class="header_middle">
			<div class="container">
				<div class="row">
					<div class="col-sm-3">
						<div class="logo pull-left">
							<a href="${pageContext.request.contextPath }/home"><img src="resource/img/market-phone-onlinebewerbung.gif" ></a>
						</div>
					</div>
					<div class="col-sm-6">
            <div id="custom-search-input">
			<form action="search" method="POST">
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                <div class="input-group col-md-12">
                     <input type="text" class="form-control input-lg" name="name" style="    font-family: -webkit-pictograph; border-radius: 0px;"/>
                    <span class="input-group-btn  search-button">
                     <button  class="btn btn-info search-button btn-lg" type="submit" style="border-radius:0px; background: chocolate;border-color: chocolate">
                            <i class="glyphicon glyphicon-search"></i>
                        </button>
                    </span>
                </div>
                </form>

            </div>
        </div>
					</div>
				</div>
        </div>
        <%-- <div id="header_menu" >
			<div class="container">
				<div class="row">
					<div class="col-md-6">
						<div class="contact-account">
							<ul class="nav nav-pills">
							</ul>
						</div>
					</div>
					<div class="col-md-6">
						<div class="menu-acount pull-right">
							<ul class="nav nav-pills account-cust">
							<li>
							<span>${message }</span>
							  <c:if test="${pageContext.request.userPrincipal.name != null}">
        <form id="logoutForm" method="POST" action="${pageContext.request.contextPath}/logout">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>

        <p>Chào ${pageContext.request.userPrincipal.name} | <a onclick="document.forms['logoutForm'].submit()">Logout</a></p>

   									</c:if>
   									</li>
									<li>
										<a href="${pageContext.request.contextPath }/viewcart"><i class="glyphicon glyphicon-shopping-cart"></i><span>CART</span></a>

								</li>
							</ul>
						</div>
					</div>
				</div>
			</div>
			</div> --%>
        
   