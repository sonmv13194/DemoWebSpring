        <%@page contentType="text/html" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
          <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
        
           <p><br/></p>
       	
            <section id="cart_items">
    	<div class="container">
    	<div class="col-sm-8">
    	 <h3>GIỎ HÀNG - ĐẶT HÀNG</h3>
    		<div class="table-responsive cart-infor content">
    		<form action="update" method="post">
    			<table class="table table-condensed">
    				<thead>
    					<tr class="menu-cart">
    						<td class="image" style="padding-left:30px; color: chocolate;">IMAGE</td>
    						<td class="name" style="color: chocolate">NAME PRODUCT</td>
    						<td class="price" style="color: chocolate">PRICE</td>
    						<td class="quantity" style="color: chocolate">QUANTITY
    						 </td>
    						<td class="total" style="color: chocolate">TOTAL</td>
    						<td>DELETE</td>
    				</tr>
    				</thead>
    				<c:set var="sum" value="0"></c:set>
    				<c:forEach var="cart" items="${cart}">
    				<c:set var="s" value="${s+ cart.product.price* cart.quantity }"></c:set>
    			<tbody>
    				<tr>
    					<td class="cart-image">
    						<img src="<%=request.getContextPath()%>/resource/img/${cart.product.image}" style="width:100px; heigth:100px">
    					</td>
    					<td class="cart-name">
    						<h4>${cart.product.name }</h4>
    					</td>
    					<td class="cart-price">
    						<h4>${cart.product.price }đ</h4>
    					</td>
    					<td class="cart-quantity">
    						<input name="quantity" type="text"
									value="${cart.quantity}" class="input-mini">
								<input value="update" class="btn-success" type="submit" />
    						  <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
									</td>
    						<td class="cart-total">
    						<h4>${cart.product.price* cart.quantity }đ</h4>
    					</td>
    					<td class="cart-delete">
    				
    						<a href="${pageContext.request.contextPath }/deletecart?idproduct=${cart.product.idproduct}" onclick="return confirm('Are you sure DELETE')"><i class="glyphicon glyphicon-trash"></i></a>
    						
    					</td>
    						
    				</tr>
    			</tbody>				
    			</c:forEach>	
    			<tr>
    				<td colspan="4" class=""><h4>
    					Tổng tiền thanh toán:</h4>
    				</td>
    				<td><h4>${s}đ</h4></td>
    			</tr> 	
    			</table>
    			</form>
    		</div>
    				</div>
    		<div class="col-sm-4">
    		<h3>THÔNG TIN ĐƠN HÀNG</h3><br>
    		<div class="col-sm-9 pay-bill">
    		<span>TỔNG TIỀN TẠM TÍNH:</span><br>
    	</div>
    	<div class="col-sm-3">${s}đ</div>
    	<p><br/></p>
    	-------------------------------------------------------------------
    	<%-- <form action="checkout" method="post"> --%>
    	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    	<a href="${pageContext.request.contextPath }/checkout">	<button class="but-check"  value="create" name="create" >TIẾN HÀNH ĐẶT HÀNG</button></a>
    		<%-- </form> --%>
    		</div>
    		</div>
    </section>