<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <jsp:include page="head.jsp" />
</head>

<body class="">
    <div class="wrapper ">
        
        <jsp:include page="sidebar.jsp" />

        <div class="main-panel">

            <!-- Navbar -->
            <jsp:include page="nav.jsp" />
            <!-- End Navbar -->

            <div class="content">
                <div class="row">
                    <div class="col-lg-3 col-md-6 col-sm-6">
                        <div class="card card-stats">
                          <div class="card-body ">
                            <div class="row">
                              <div class="col-5 col-md-4">
                                <div class="icon-big text-center icon-warning">
                                  <i class="nc-icon nc-globe text-warning"></i>
                                </div>
                              </div>
                              <div class="col-7 col-md-8">
                                <div class="numbers">
                                  <p class="card-category"> Agences</p>
                                  <p class="card-title"> ${totalAgencies} <p>
                                </div>
                              </div>
                            </div>
                          </div>
                          
                        </div>
                      </div>
                </div>
            </div>

            <jsp:include page="footer.jsp" />
            
        </div>
    </div>
    <!--   Core JS Files   -->
    <jsp:include page="script.jsp" />

</body>

</html>
