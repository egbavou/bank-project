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
                    <div class="col-md-6 mb-3">
                        <h1 class="title">${client.agency}</h1>
                    </div>
                    <div class="col-md-6 d-flex justify-content-end">
                        <a href="/clients/new" class="btn btn-primary btn-lg text-light">Nouveau client</a>
                    </div>
                    
                </div>
                <div class="row">

                    <div class="col-md-12">
                        <div class="card">
                          <div class="card-header">
                            <h4 class="card-title"> Liste des clients </h4>
                          </div>
                          <div class="card-body">
                            <div class="table-responsive">
                              <table class="table table-shopping">
                                <thead class="">
                                  <tr>
                                    <th class="text-center"></th>
                                    <th>Nom</th>
                                    <th>Prénom</th>
                                  </tr>
                                </thead>
                                <tbody>
                                    <c:forEach items="${clients}" var="client">
                                        <tr>
                                            <td>
                                                <div class="img-container">
                                                    <img src="/img/mike.jpg" alt="...">
                                                </div>
                                            </td>
                                            <td class="td-name">
                                                ${client.lastname}
                                            </td>
                                            <td>${client.firstname}</td>                                            
                                        </tr>
                                    
                                    </c:forEach>    
                                 
                                </tbody>
                              </table>
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
