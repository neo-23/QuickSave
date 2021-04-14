<jsp:include page="topbar.jsp" />
<!-- Product List Start -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="product-view">
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-12">
                <div class="row">
                    <c:forEach items="${photoUrls}" var="photoUrl">
                    <div class="col-md-3">
                        <div class="product-item">
                            <div class="product-title">
                            </div>
                            <div class="product-image">
                                <a href="product-detail.html">
                                    <img src="${photoUrl}" alt="Product Image">
                                </a>
                            </div>
                            <div class="product-price">
                                <h3></h3>
                                <a class="btn" href=""><i class="fa fa-save"></i>Save Now</a>
                            </div>
                        </div>
                    </div>
                    </c:forEach>
                </div>
            </div>
        </div>
        <br/>
        <br/>
        <br/>
    </div>
</div>
<!-- Product List End -->
<jsp:include page="footer.jsp" />