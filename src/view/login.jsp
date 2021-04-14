<jsp:include page="header.jsp" />
<div class="login">
    <div class="container-fluid">
        <div class="row">
            <div class="col-lg-4">
            </div>
            <div class="col-lg-3">
                <div class="login-form">
                    <div class="row">
                        <form action="login" method="post">
                            <div class="col-md-12">
                                <label>E-mail</label>
                                <input class="form-control" id="userEmail" name="userEmail" type="text" placeholder="E-mail">
                            </div>
                            <div class="col-md-12">
                                <label>Password</label>
                                <input class="form-control" id="userPassword" name="userPassword" type="password" placeholder="Password">
                            </div>
                            <div class="col-md-12">
                                <div class="custom-control custom-checkbox">
                                    <input type="checkbox" class="custom-control-input" id="newaccount">
                                    <label class="custom-control-label" for="newaccount">Keep me signed in</label>
                                </div>
                            </div>
                            <div class="col-md-12">
                                <button class="btn" type="submit">Submit</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
            <div class="col-lg-5">
            </div>
        </div>
    </div>
</div>
<jsp:include page="footer.jsp" />