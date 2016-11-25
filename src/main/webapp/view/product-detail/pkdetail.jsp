  <%@page contentType="text/html" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!--   <div class="col-sm-10"> -->
                	<div class="detail_item">
                    	
                <div class="nav nav-stacked">
                <c:set var="price" value="${pdetail.price }"></c:set>
                	<h1>${pdetail.name}</h1>
             <div class="col-sm-3">
                       <div class="product-box">
                         <img src="<%=request.getContextPath() %>/resource/img/${pdetail.image}" style="height: auto">                 
                        </div>
                        </div>
                        <div class=col-sm-6>
                        <div class="information-detail-product-tittle">
                        	${pdetail.name}
                        </div>
                        <div class="detail-information">
                        <div class="information-detail-product-other">
                        GIÁ TIỀN: <span><fmt:formatNumber value="${price }" 
            type="currency"/></span>
            </div>
                                <div class="information-detail-product-other">
                        View: <span>${pdetail.view }</span>
            </div>
                                         <div class="information-detail-product-other">
                        Khu vực: <span>${pdetail.locat.name }</span>
            </div>
                              <form action="addcart" method="post">
                            <a href="${pageContext.request.contextPath}/addcart?idproduct=${pdetail.idproduct}" class="btn btn-default add" onclick="return confirm('Bạn có muốn thêm sản phẩm vô giỏ hàng')">Thêm vào giỏ</a>
                           </form>
                           <p><br></p>
                            <p>Thông tin sản phẩm</hp>
                           <p>${pdetail.description }</p><br>
                          
                            </div>
                     </div>
                         </div>
                    </div>