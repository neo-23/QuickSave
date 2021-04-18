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
                                <a href="https://dl.dropboxusercontent.com/s/deroi5nwm6u7gdf/advice.png" class="btn dropbox-saver"></a>
                                <div class="g-savetodrive"
                                     data-src="//farm66.staticflickr.com/65535/51122291939_bc487f22c8.jpg"
                                     data-filename="My Statement.jpg"
                                     data-sitename="My Company Name">
                                </div>
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
<script type="text/javascript" src="https://www.dropbox.com/static/api/2/dropins.js" id="dropboxjs" data-app-key="64p2oui81es69ny"></script>
<script src="https://apis.google.com/js/platform.js" async defer></script>
<jsp:include page="footer.jsp" />