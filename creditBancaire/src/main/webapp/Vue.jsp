<%@page import = "web.Model"%>
<%Model model = (Model)request.getAttribute("creditModel");%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/style.css">
    <title>Credit Bancaire</title>
</head>
<body>

<div class="container">
    <div class="row">
        <div class="col-md-6 col-md-offset-3">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h3 class="panel-title">Simulateur de crédit</h3>
                </div>
                <div class="panel-body">
                    <form action="mensualite.php" method="POST">
                        <div class="form-group">
                            <label class="control-label">Montant</label>
                            <input class="form-control" type="text" name="montant" value="<%= model.getMontant() %>">
                        </div>
                        <div class="form-group">
                            <label class="control-label">Taux</label>
                            <input class="form-control" type="text" name="taux" value="<%= model.getTaux() %>">
                        </div>
                        <div class="form-group">
                            <label class="control-label">Durée</label>
                            <input class="form-control" type="text" name="duree" value="<%= model.getDuree() %>">
                        </div>
                        <button class="btn btn-success" type="submit">Calculer</button>
                    </form>
                    <div class="spacer">
                        <h4>Résultat :</h4>
                        <div class="resultat-label">
                            <label>Mensualité :</label>
                        </div>
                        <div class="resultat-valeur panel panel-default">
                            <div class="panel-body">
                                <label><%= model.getMensualite() %></label>
                            </div>
                        </div>
                        
                    </div>
                    
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
