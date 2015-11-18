<!doctype html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title>UFG - Cálculo de combustível</title>
    <!-- Bootstrap -->
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
    <!--Pulling Awesome Font -->
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
<![endif]-->
</head>
<body>
   
    <div class="container">
    <div class="row">
      <div class="col-md-offset-5 col-md-6">

            <div class="form-group">
            <h1>Qual combustível?</h1>
            <h6>Digite o valor da Gasolína:</h6>
            <input type="text" name="valorGasolina" class="form-control" placeholder="Valor da Gasolína" value ="${param.valorGasolina }" />
            </br>
            <h6>Digite o valor do Álcool:</h6>
            <input type="text" name="valorAlcool" class="form-control" placeholder="Valor do Álcool" value ="${param.valorAlcool }"/>
            </br>
            <div class="wrapper">
            <span class="group-btn">    
                <input type="submit" value="Calcular" class="btn btn-primary btn-md">
            </span>
            </div>
            </div>
       
        </div>
    </div>
</div>
   
   
   
   
   
   
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script
        src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script
        src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</body>
</html>