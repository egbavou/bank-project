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
                    <h1 class="title">${client.agency.name}</h1>
                </div>
                <div class="row">

                  <div class="col-md-12">
                    <div class="card ">
                      <div class="card-header ">
                        <h4 class="card-title">Nouveau client</h4>
                      </div>
                      <div class="card-body ">

                        <c:url var="save_client_url" value="/clients/store"/>

                        <!-- modelAttribute="client" -->
                        <form action="${save_client_url}" method="post" >
                          <label>Nom</label>
                          <div class="form-group">
                            <input type="text" class="form-control" placeholder="Entrer le nom du client"  id="lastname" name="lastname" path="lastname">
                          </div>

                          <label>Prénom</label>
                          <div class="form-group">
                            <input type="text" class="form-control" placeholder="Entrer le prénom du client" path="firstname">
                          </div>

                          <label>Adresse</label>
                          <div class="form-group">
                            <input type="text" class="form-control" placeholder="Entrer l'adresse du client" path="adress">
                          </div>

                          <div class="form-group">
                            <label for="exampleFormControlSelect1">Choisir l'Agence</label>
                            <select class="form-control" id="exampleFormControlSelect1" path="agency">
                              <c:forEach items="${agencies}" var="agency">
                                <option value="${agency}"> ${agency.name} </option>
                              </c:forEach>    
                            </select>
                          </div>

                          <div class="form-group">
                            <label for="exampleFormControlSelect1">Choisir un conseiller pour un client</label>
                            <select class="form-control" id="exampleFormControlSelect1" path="advisor">
                              <c:forEach items="${advisors}" var="advisor">
                                <option value="${advisor}"> ${advisor.lastname} ${advisor.firstname}</option>
                              </c:forEach>    
                            </select>
                          </div>
                          
                          <div class="card-footer ">
                            <button type="submit" class="btn btn-primary btn-lg text-light">Ajouter un nouveau client</button>
                          </div>
                          
                        </form>
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
