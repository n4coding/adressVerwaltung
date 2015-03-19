



<html lang="de">
  <head>
 <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>AddressBook</title>
    <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet'  type='text/css'>
	<script src="http://code.jquery.com/jquery-1.10.2.js"></script>

    <!-- Bootstrap -->
    <link href="../resources/css/bootstrap.min.css" rel="stylesheet">
	<link rel="stylesheet" href="../resources/css/bootstrap-multiselect.css" type="text/css"/>
    <link href="${rc.getContextPath()}../resources/css/myStyle.css" rel="stylesheet">
    <link href='http://fonts.googleapis.com/css?family=PT+Sans+Narrow' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Bree+Serif' rel='stylesheet' type='text/css'>
   
	<script src="../resources/js/jquery-2.1.0.min.js"></script>
	<script src="../resources/js/bootstrap.min.js"></script>
	<script src="../resources/js/meinjs.js"></script>
	<script type="text/javascript" src="../resources/js/bootstrap-multiselect.js"></script>
	<link href='http://fonts.googleapis.com/css?family=Lora:700' rel='stylesheet' type='text/css'>   
  </head>

 <body class="maingradient">

<div class="container">
    <div class="row">
        <div class="col-md-12">
            <div class="well well-sm">
                <form action="${rc.getContextPath()}/ergebnis" class="form-horizontal" method="get">
                
                    <fieldset>
                        <legend class="text-center header">Suchen</legend>

                        <div class="form-group">
                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
                            <div class="col-md-8">
                                <input id="name" name="name" type="text" placeholder="Name" class="form-control">
                            </div>
                        </div>
                        <div class="form-group">
                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
                            <div class="col-md-8">
                                <input id="vorname" name="vorname" type="text" placeholder="Vorname" class="form-control">
                            </div>
                        </div>
                        
                        <div class="form-group">
                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
                            <div class="col-md-8">
                                <input id="strasse" name="strasse" type="text" placeholder="Strasse" class="form-control" >
                            </div>
                        </div>
                        
                        <div class="form-group">
                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
                            <div class="col-md-8">
                                <input id="plz" name="plz" type="text" placeholder="PLZ" class="form-control" >
                            </div>
                        </div>
                        <div class="form-group">
                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
                            <div class="col-md-8">
                                <input id="ort" name="ort" type="text" placeholder="Ort" class="form-control" >
                            </div>
                        </div>
                        
                        <div class="form-group">
                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-phone-square bigicon"></i></span>
                            <div class="col-md-8">
                                <input id="telefon" name="telefon" type="text" placeholder="Telefon" class="form-control">
                            </div>
                        </div>

                        

                        <div class="form-group">
                            <div class="col-md-12 text-center">
                                <button type="submit" class="btn btn-primary btn-lg">Suchen</button>
                            </div>
                        </div>
                    </fieldset>
                </form>
            </div>
        </div>
    </div>
</div>



  </body>
</html>