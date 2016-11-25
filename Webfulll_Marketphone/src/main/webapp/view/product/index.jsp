   <%@page contentType="text/html" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
          <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
           <%@ taglib uri="http://www.springframework.org/tags/form" prefix="tag"%>
          <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
  	<div class="product_item">
                    	<div class="nav nav-pills nav-stacked menu-left">
						<ul class="nav nav-pills">
							<li class="active"><a href="" data-toggle="tab">ALL</a></li>
							<c:forEach var="category" items="${Lcate }">
								<li><a href="${pageContext.request.contextPath }/cate?idcategory=${category.idcategory}">${category.name }</a></li>
								</c:forEach>
						</ul>
					</div>
				<div class="nav nav-pills nav-stacked choose-list">
					<div class="btn-group">
						<button type="button" class="btn btn-default dropdown-toggle supply" data-toggle="dropdown">
							LỰA CHỌN
							<span class="caret"></span>
						</button>
					
						<ul class="dropdown-menu">
							<li>
							
							</li>
						</ul>
					</div>
				<div class="btn-group">
						<button type="button" class="btn btn-default dropdown-toggle supply" data-toggle="dropdown">
							KHU VỰC
							<span class="caret"></span>
						</button>
						<ul class="dropdown-menu">
							<li>
							<c:forEach var="loca" items="${location }">
								<a href="${pageContext.request.contextPath }/location?idlocation=${loca.idlocation}">${loca.name}</a>
											</c:forEach>
							</li>
							
						</ul>
			
					</div>
				<div class="btn-group">
						<button type="button" class="btn btn-default dropdown-toggle supply" data-toggle="dropdown">
							LOẠI
							<span class="caret"></span>
						</button>
						<ul class="dropdown-menu">
							<li><a href="#">MÀN HÌNH LỚN</a></li>
							<li><a href="#">MÀN HÌNH NHỎ</a></li>
							<li><a href="#">MÀN HÌNH VỪA</a></li>
						</ul>
                    </div>
                    </div>
                    <p><br/></p>
                   <div class="list-product">
				<c:forEach var="phone" items="${Lproduct }" varStatus="status">
				<c:set var="price" value="${phone.price }"></c:set>
             <div class="col-sm-3">
            		<div class="product-box">
                        <img src="<%=request.getContextPath() %>/resource/img/${phone.image}">
                        <div class="product-detail">
                            <a href="${pageContext.request.contextPath }/detail?idproduct=${phone.idproduct}" class="btn btn-default detail">XEM CHI TIẾT</a>
                        </div>
                   <!--      <div class="descrip-product"> -->
                   <div class="product-new">
                        </div>
                          <h3>${phone.name}</h3>
                         <p><fmt:formatNumber value="${price }" 
            type="currency"/></p>
                            <h4>Khu vực:${phone.locat.name}</h4>
                            <h4>Lượt xem:${phone.view}</h4>
                    </div>
                    
                         </div>
                         
                      </c:forEach>
                    </div>
                    <p><br/></p>
                    <c:url value="/" var="page"></c:url>
                    <ul class="pagination" style="float:right">
                    	<li><a href="#" aria-label="Previous"> <span
							aria-hidden="true">&laquo;</span>
					</a></li>
                    <c:forEach var="i" begin="0" end="${totalPage }">
						<li>
                            <a href="${page }${i}">
                            <c:out value="${i }"></c:out>
                            </a>
                        </li>
                        </c:forEach>
                        <li><a href="#" aria-label="Next"> <span
							aria-hidden="true">&raquo;</span>
					</a></li>
                    </ul>
          
        </div>
                    <div class="product_item"> 	
        <div class="nav nav-pills nav-stacked menu-product-newest">
					<h2>SẢN PHẨM MỚI NHẤT</h2>
					</div>
		       <div class="list-product">
				<c:forEach var="phone" items="${newest }" varStatus="status">
             <div class="col-sm-3">
            		<div class="product-box">
                        <img src="<%=request.getContextPath() %>/resource/img/${phone.image}">
                        <div class="product-detail">
                            <a href="${pageContext.request.contextPath }/detail?idproduct=${phone.idproduct}" class="btn btn-default detail">XEM CHI TIẾT</a>
                        </div>
                        <div class="product-new">
                        <img alt="new" class="new" src="resource/img/new.png">
                        </div>
                      <h3>${phone.name}</h3>
                         <p>Giá:${phone.price }</p>
                            <h4>Lượt view:${phone.view}</h4>
                            <h4>Khu vực:${phone.locat.name}</h4>
                    </div>
                         </div>
                      </c:forEach>          
                    </div>
                    </div> 
 