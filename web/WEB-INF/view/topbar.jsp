<jsp:include page="header.jsp" />
<div class="nav">
    <div class="container-fluid">
        <nav class="navbar navbar-expand-md bg-dark navbar-dark">
            <a href="#" class="navbar-brand">MENU</a>
            <button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse justify-content-between" id="navbarCollapse">
                <div class="navbar-nav mr-auto">
                    <a href="index.html" class="nav-item nav-link">Home</a>
                </div>
                <div class="navbar-nav ml-auto">
                    <div class="nav-item dropdown">
                        <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown">${userSignInInfo}</a>
                        <div class="dropdown-menu">
                            <a href="#" class="dropdown-item">Settings</a>
                            <a href="#" class="dropdown-item" onclick="logout()">Logout</a>
                        </div>
                    </div>
                </div>
            </div>
        </nav>
    </div>
</div>
<div class="bottom-bar">
    <div class="container-fluid">
        <div class="row align-items-center">
            <div class="col-md-3">
            </div>
            <div class="col-md-6">
                <form action="home" method="post">
                <div class="search">
                    <input type="text" name="searchText" placeholder="Search here">
                    <button><i class="fa fa-search"></i></button>
                </div>
                </form>
            </div>
            <div class="col-md-3">
            </div>
        </div>
    </div>
</div>
<script>
    function logout() {
        window.location.href = "logout";
    }
</script>