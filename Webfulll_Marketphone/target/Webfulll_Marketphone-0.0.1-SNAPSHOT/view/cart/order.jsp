        <%@page contentType="text/html" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
          <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
        
           <p><br/></p>
           <section id="cart_items">
              <form class="form-horizontal" method="post" action="checkout">
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/><br>
           <div class="container">
    		<div class="col-sm-6 checkout-left">
    		
    		<h3>THÔNG TIN ĐẶT HÀNG</h3>
    		<div class="form-group pay-check-infor" style="
    margin-left: 0px;
    margin-right: 0px;
">
  <input type="text" class="form-control check-infor" id="usr" placeholder="Họ và tên" name="name"></input>
</div>
<div class="form-group pay-check-infor" style="
    margin-left: 0px;
    margin-right: 0px;
">
 <input type="text" class="form-control check-infor" id="pwd" placeholder="Email" name="email"></input>
 </div>
<div class="form-group pay-check-infor"style="
    margin-left: 0px;
    margin-right: 0px;
">
  <input type="text" class="form-control check-infor" id="pwd" placeholder="Phone" name="phonenumber"></input>
</div>
<div class="form-group pay-check-infor"style="
    margin-left: 0px;
    margin-right: 0px;
">
  <input type="text" class="form-control check-infor" id="pwd" placeholder="Address" name="streetname"></input>
</div>

 	<button type="submit" class="but-check"  value="create" name="create" >XÁC NHẬN ĐẶT HÀNG</button>
<br>
 </div>
 <div class="col-sm-6">
 	<h3>THÔNG TIN ĐƠN HÀNG</h3>
 	   <div class="row cart-body">
               <!--  <div class="col-sm-6"> -->
                    <!--REVIEW ORDER-->
                    <div class="panel panel-info">
                        <div class="panel-heading">
                            Review Order <div class="pull-right"><small><a class="afix-1" href="#">Edit Cart</a></small></div>
                        </div>
                        <div class="panel-body">
                        <c:forEach var="cart" items="${cart }">
                        <c:set var="sum" value="0"></c:set>
                        <c:set var="s" value="${s+cart.product.price*cart.quantity }"></c:set>
                            <div class="form-group">
                                <div class="col-sm-3 col-xs-3">
                                    <img class="img-responsive" src="resource/img/${cart.product.image }" />
                                </div>
                                <div class="col-sm-6 col-xs-6">
                                    <div class="col-xs-12">Product name: ${cart.product.name }</div>
                                    <div class="col-xs-12"><small>Quantity:<span>${cart.quantity } cái</span></small></div>
                                </div>
                                <div class="col-sm-3 col-xs-3 text-right">
                                    <h6><span>$</span>${cart.product.price }</h6>
                                </div>
                            </div>
                            </c:forEach>
                    <div class="form-group"><hr /></div>
                            <div class="form-group">
                                <div class="col-xs-12">
                                    <strong>Subtotal</strong>
                                    <div class="pull-right"><span>$</span><span>${s }</span></div>
                                </div>
                                <div class="col-xs-12">
                                    <small>Shipping</small>
                                    <div class="pull-right"><span>15%</span></div>
                                </div>
                            </div>
                            <div class="form-group"><hr /></div>
                            <div class="form-group">
                                <div class="col-xs-12">
                                    <strong>Order Total</strong>
                                    <div class="pull-right"><span>$</span><span>${s*0.15 }</span></div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!--REVIEW ORDER END-->
           <!--      </div> -->
      </div>
      </div>
      </div>
      </form>
  </section>