     <%@page contentType="text/html" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<p><br></p>
                	<div class="detail_item">
                    	
                <div class="nav nav-stacked">
                <c:set var="price" value="${pdetail.price }"></c:set>
           	<div class="search-advanted-detail">
           	     	<div class="search-advanted-detail-drp" style="padding: 15px">
                		 <div class="dropdown">
    <button class="btn btn-default dropdown-toggle" type="button" data-toggle="dropdown">Tìm kiếm nâng cao
    <span class="caret"></span></button>
    <ul class="dropdown-menu">
    <div class="col-sm-4">
      <li class="dropdown-header">Mức giá</li>
      <li><a href="#">Dưới 3 triệu</a></li>
      <li><a href="#">3 triệu- 6 triệu</a></li>
      <li><a href="#">6 triệu- 9 triệu</a></li>
      </div>
      <div class="col-sm-4">
      <li class="dropdown-header">Hãng sản xuất</li>
     <c:forEach var="supply" items="${listsupply }">
      <li><a href="#">${supply.name }</a></li>
      </c:forEach>
      </div>
       <div class="col-sm-4">
      <li class="dropdown-header">Khu vực</li>
     <c:forEach var="location" items="${listlocation }">
      <li><a href="#">${location.name }</a></li>
      </c:forEach>
      </div>
    </ul>
  		</div>
  			</div>
                	</div>
                	<p><br></p>
             <div class="col-sm-3">
                       <div class="product-box">
                         <img src="<%=request.getContextPath() %>/resource/img/${pdetail.image}" style="height: auto">                 
                        </div>
                        </div>
                        <div class=col-sm-9>
                        <div class="information-detail-product-tittle">
                        	${pdetail.name}
                        </div>
                        <div class="detail-information">
                        <div class="information-detail-product-other">
                        GIÁ TIỀN: <span><fmt:formatNumber value="${price }" 
            type="currency"/></span>
            </div>
                                <div class="information-detail-product-other">
                       <span>${pdetail.view } lượt xem</span>
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
                    <p><br></p>
                    <div class="specification-detail">
                    	<div class="specification-detail-title">
                    		THÔNG SỐ KỸ THUẬT
                    	</div>
                    	<div class="specification-detail-product">
                    	<table class="specification-detail-product-tb">
                    		<tbody>
                    			<tr>
                    				<td style="text-align: right;  padding-right: 5px; border-left: none;border-top: none;">
                    					<strong>CPU</strong>
                    				</td>
                    				<td style="border-right: none; padding-right: 8px; border-top: none; color: #288ad6">
                    					${pdetail.detailproduct.cpu} 
                    				</td>
                    				</tr>
                    				<tr>
                    				<td style="text-align: right;  padding-right: 5px; border-left: none;border-top: none;">
                    					<strong>CHIPSET</strong>
                    				</td>
                    					<td style="border-right: none; padding-right: 8px; border-top: none; color: #288ad6">
                    					${pdetail.detailproduct.chipset} 
                    				</td>
                    				</tr>
                    						<tr>
                    				<td style="text-align: right;   padding-right: 5px; border-left: none;border-top: none;">
                    					<strong>RAM</strong>
                    				</td>
                    					<td style="border-right: none; padding-right: 8px; border-top: none; color: #288ad6">
                    					${pdetail.detailproduct.ram} 
                    				</td>
                    					</tr>
                    						<tr>
                    				<td style="text-align: right;  padding-right: 5px; border-left: none;border-top: none;">
                    					<strong>OPTICAL</strong>
                    				</td>
                    					<td style="border-right: none; padding-right: 8px; border-top: none; color: #288ad6">
                    					${pdetail.detailproduct.optical} 
                    				</td>
                    				       </tr>
                    				<tr>
                    				<td style="text-align: right;    padding-right: 5px; border-left: none;border-top: none;">
                    					<strong>GRAPHIC</strong>
                    				</td>
                    					<td style="border-right: none; padding-right: 8px; border-top: none; color: #288ad6">
                    					${pdetail.detailproduct.graphic} 
                    				</td>
                    				</tr>
                    				<tr>
                    				<td style="text-align: right;    padding-right: 5px; border-left: none;border-top: none;">
                    					<strong>DISPLAY</strong>
                    				</td>
                    					<td style="border-right: none; padding-right: 8px; border-top: none;">
                    					${pdetail.detailproduct.display} 
                    				</td>
                    				</tr>
                    				<tr>
                    				<td style="text-align: right;   padding-right: 5px; border-left: none;border-top: none;">
                    					<strong>OS</strong>
                    				</td>
                    					<td style="border-right: none; padding-right: 8px; border-top: none; color: #288ad6">
                    					${pdetail.detailproduct.os} 
                    				</td>
                    			</tr>
                    				<tr>
                    				<td style="text-align: right;   padding-right: 5px; border-left: none;border-top: none;">
                    					<strong>NETWORK</strong>
                    				</td>
                    					<td style="border-right: none; padding-right: 8px; border-top: none; color: #288ad6">
                    					${pdetail.detailproduct.network} 
                    				</td>
                    			</tr>
                    				<tr>
                    				<td style="text-align: right;   padding-right: 5px; border-left: none;border-top: none;">
                    					<strong>I/O</strong>
                    				</td>
                    					<td style="border-right: none; padding-right: 8px; border-top: none; color: #288ad6">
                    					${pdetail.detailproduct.io} 
                    				</td>
                    			</tr>  
                    				<tr>
                    				<td style="text-align: right;   padding-right: 5px; border-left: none;border-top: none;">
                    					<strong>OTHER</strong>
                    				</td>
                    					<td style="border-right: none; padding-right: 8px; border-top: none; color: #288ad6">
                    					${pdetail.detailproduct.other} 
                    				</td>
                    			</tr>
                    		</tbody>
                    	</table>
                    	</div>
                    </div>
                    <p>${comment.customer.name }</p>
                    <span>${comment.content }</span>
                <form method="post" action="comment">
                    <div class="specification-detail-title">
                    	Bình luận-Nhận xét
                    </div>
                    <div class="specification-detail-comment">
                    	<textarea class="comment-item" name="content"></textarea>
                    	<input type="text" class="comment_name" placeholder="Họ và tên" name="name">
                    	<input type="email" class="comment_email" placeholder="Email" name="email">
                    	   <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/><br>
                    	<button type="submit" class="comment_send">Gửi</button>
                    </div>
                    </form>
            