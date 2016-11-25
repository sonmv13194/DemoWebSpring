            <%@page contentType="text/html" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
          <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
          <p><br></p>
                	<div class="product_item">
                    	<div class="col-sm-12">
                    			<div class="product-page-tittle">
                    				<a href="${pageContext.request.contextPath }/home" class="product-page-tittle-item">Home</a>
                    				<span class="glyphicon glyphicon-menu-right" style=" float: left;width: 14px;height: 14px;margin: 12px 0 0 0;"></span>
    <a href="${pageContext.request.contextPath }/cate?idcategory=${name.idcategory}" class="product-page-tittle-item">${name.name }</a>
    <span class="glyphicon glyphicon-menu-right" style=" float: left;width: 14px;height: 14px;margin: 12px 0 0 0;"></span>
                    			<div class="input-group">
                <div class="input-group-btn search-panel">
                    <button type="button" class="btn btn-default dropdown-toggle findadvanted-productdetail" data-toggle="dropdown">
                    	<span id="search_concept">
                Tìm theo: Mức giá, Hãng sản xuất, Khu vực...</span> <span class="caret"></span>
                    </button>
                    <ul class="dropdown-menu" role="menu">
                     <div class="col-sm-4">
      <li class="dropdown-header">Mức giá</li>
      <li><a href="#">Dưới 3 triệu</a></li>
      <li><a href="#">3 triệu- 6 triệu</a></li>
      <li><a href="#">6 triệu- 9 triệu</a></li>
      </div>
      <div class="col-sm-4">
      <li class="dropdown-header">Hãng sản xuất</li>
     <c:forEach var="supply" items="${Lsup }">
      <li><a href="${pageContext.request.contextPath }/supply?idsupplier=${supply.idsupplier}">${supply.name }</a></li>
      </c:forEach>
      </div>
       <div class="col-sm-4">
      <li class="dropdown-header">Khu vực</li>
     <c:forEach var="location" items="${location }">
      <li><a href="">${location.name }</a></li>
      </c:forEach>
      </div>
                    </ul>
                   
                </div>
                
            </div>
            
                    			</div>
                    			
            
              
                    	<p><br></p>
                    	<div class="nav nav-pills nav-stacked">
                     <div class="list-product">
                <c:forEach var="phone" items="${find.listproduct }" varStatus="status">
             <div class="col-sm-3">
                       <div class="product-box">
                         <img src="<%=request.getContextPath() %>/resource/img/${phone.image}">
                        <div class="product-detail">
                            <a href="${pageContext.request.contextPath }/detail?idproduct=${phone.idproduct}" class="btn btn-default detail">XEM CHI TIẾT</a>
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
                    </div>
                    <p><br/></p>
                    <ul class="pagination" style="float:right">
                        <li class="active">
                            <a href="#">1</a>
                        </li>
                        <li>
                            <a href="#">2</a>
                        </li>
                        <li>
                            <a href="#">3</a>
                        </li>
                        <li>
                            <a href="#">Trang Tiếp</a>
                        </li>
                    </ul>
                    </div>