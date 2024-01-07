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

                    <c:forEach items="${agencies}" var="agency">
                        
                        <div class="card col-md-4 mr-1" style="margin-right: 2px;">
                            <img class="card-img-top" src="/img/evernote.png" alt="Card image cap">
                            <div class="card-body">
                              <h4 class="card-title">${agency.name}</h4>
                              <a href="javascript:;" class="btn btn-primary">Voir Liste des clients</a>
                            </div>
                        </div>
                        
                    </c:forEach>    
		

                    
                      
                      
                   
                </div>
            </div>

            <jsp:include page="footer.jsp" />
            
        </div>
    </div>
    <!--   Core JS Files   -->
    <jsp:include page="script.jsp" />
</body>

</html>
