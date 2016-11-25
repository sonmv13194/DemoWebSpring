        <%@page contentType="text/html" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
          <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
          <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
        
           <p><br/></p>
           <section id="cart_items">
              <form:form class="form-horizontal" method="post" action="checkout" modelAttribute="neworder" commandName="neworder">
           <div class="container">
    		<div class="col-sm-6 checkout-left">
    		
    		<h3>THÔNG TIN ĐẶT HÀNG</h3>
    		 <spring:bind path="name">
    		<div class="form-group pay-check-infor ${status.error ? 'has-error' : ''} " style="margin-left: 0px; margin-right: 0px;">
    		 <form:errors path="name"></form:errors>	
 				 <form:input type="text" class="form-control pay-check-infor" id="usr" placeholder="Họ và tên" path="name"></form:input>
			</div>
			</spring:bind>
			<spring:bind path="email">
<div class="form-group pay-check-infor ${status.error ? 'has-error' : ''} "style="margin-left: 0px; margin-right: 0px;">
 <form:errors path="email"></form:errors>
  <form:input type="text" class="form-control pay-check-infor" id="pwd" placeholder="Email" path="email"></form:input>	
</div>
	</spring:bind>
<spring:bind path="phonenumber">
<div class="form-group pay-check-infor ${status.error ? 'has-error' : ''} "style="margin-left: 0px; margin-right: 0px;">
 <form:errors path="phonenumber"></form:errors>
  <form:input type="text" class="form-control pay-check-infor" id="pwd" placeholder="Phone" path="phonenumber"></form:input>
		
</div>
	</spring:bind>
<spring:bind path="streetname">
<div class="form-group pay-check-infor ${status.error ? 'has-error' : ''} "style="margin-left: 0px; margin-right: 0px;">
	 <form:errors path="streetname"></form:errors>
  <form:input type="text" class="form-control pay-check-infor" id="pwd" placeholder="Address" path="streetname"></form:input>
				
</div>
	</spring:bind>

 	<button type="submit" class="but-check"  value="create" name="create">XÁC NHẬN ĐẶT HÀNG</button>
<br>
 </div>
 <div class="col-sm-6">
 	<h3>THÔNG TIN ĐƠN HÀNG</h3>
 	   <div class="row cart-body">
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
                                    <strong>Tổng tiền</strong>
                                    <div class="pull-right"><span>$</span><span>${s }</span></div>
                                </div>
                                <div class="col-xs-12">
                                    <small>Phí shipping</small>
                                    <div class="pull-right"><span>15%</span></div>
                                </div>
                            </div>
                            <div class="form-group"><hr /></div>
                            <div class="form-group">
                                <div class="col-xs-12">
                                    <strong>Tổng đơn cần thanh toán</strong>
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
      </form:form>
  </section>