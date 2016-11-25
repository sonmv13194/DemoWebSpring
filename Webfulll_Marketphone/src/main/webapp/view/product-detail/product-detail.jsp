     <%@page contentType="text/html" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
                	<div class="detail_item">              	
                <div class="nav nav-stacked">
                <c:set var="price" value="${pdetail.price }"></c:set>
                	<div class="search-advanted-detail">
                		 <div class="dropdown">
    <button class="btn btn-default dropdown-toggle" type="button" data-toggle="dropdown">Tutorials
    <span class="caret"></span></button>
    <ul class="dropdown-menu">
      <li class="dropdown-header">Dropdown header 1</li>
      <li><a href="#">HTML</a></li>
      <li><a href="#">CSS</a></li>
      <li><a href="#">JavaScript</a></li>
      <li class="divider"></li>
      <li class="dropdown-header">Dropdown header 2</li>
      <li><a href="#">About Us</a></li>
    </ul>
  </div>
                	</div>
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
                    					${pdetail.detailproduct.cpu} 
                    				</td>
                    					</tr>
                    						<tr>
                    				<td style="text-align: right;  padding-right: 5px; border-left: none;border-top: none;">
                    					<strong>HDD</strong>
                    				</td>
                    					<td style="border-right: none; padding-right: 8px; border-top: none; color: #288ad6">
                    					${pdetail.detailproduct.hdd} 
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
                    					<strong>WEIGTH</strong>
                    				</td>
                    					<td style="border-right: none; padding-right: 8px; border-top: none;">
                    					${pdetail.detailproduct.weight} 
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
                    					<strong>SCREEN</strong>
                    				</td>
                    					<td style="border-right: none; padding-right: 8px; border-top: none; color: #288ad6">
                    					${pdetail.detailproduct.screen} 
                    				</td>
                    			</tr>
                    				<tr>
                    				<td style="text-align: right;   padding-right: 5px; border-left: none;border-top: none;">
                    					<strong>MICRO SD</strong>
                    				</td>
                    					<td style="border-right: none; padding-right: 8px; border-top: none; color: #288ad6">
                    					${pdetail.detailproduct.microsd} 
                    				</td>
                    			</tr>
                    				<tr>
                    				<td style="text-align: right;   padding-right: 5px; border-left: none;border-top: none;">
                    					<strong>CAMERA</strong>
                    				</td>
                    					<td style="border-right: none; padding-right: 8px; border-top: none; color: #288ad6">
                    					${pdetail.detailproduct.camera} 
                    				</td>
                    			</tr>
                    				<tr>
                    				<td style="text-align: right;   padding-right: 5px; border-left: none;border-top: none;">
                    					<strong>CONNECTION</strong>
                    				</td>
                    					<td style="border-right: none; padding-right: 8px; border-top: none; color: #288ad6">
                    					${pdetail.detailproduct.connection} 
                    				</td>
                    			</tr>
                    				<tr>
                    				<td style="text-align: right;   padding-right: 5px; border-left: none;border-top: none;">
                    					<strong>BATTERY</strong>
                    				</td>
                    					<td style="border-right: none; padding-right: 8px; border-top: none; color: #288ad6">
                    					${pdetail.detailproduct.batteries} 
                    				</td>
                    			</tr>
                    				<tr>
                    				<td style="text-align: right;   padding-right: 5px; border-left: none;border-top: none;">
                    					<strong>SIZE</strong>
                    				</td>
                    					<td style="border-right: none; padding-right: 8px; border-top: none; color: #288ad6">
                    					${pdetail.detailproduct.size} 
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
                         <p><br></p>
                        <form method="post" action="">
                    <div class="specification-detail-title">
                    	Bình luận-Nhận xét
                    </div>
                    <div class="specification-detail-comment">
                    	<textarea class="comment-item"></textarea>
                    	<input type="text" class="comment_name" placeholder="Họ và tên">
                    	<input type="email" class="comment_email" placeholder="Email">
                    </div>
                    </form>
            