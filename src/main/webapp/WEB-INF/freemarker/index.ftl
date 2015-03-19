

<html lang="en">
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
  <body style="background:none;">

 <header>
	 <section>
	 <div class="container">
		<div class="row">
		 <div class="col-lg-12" style="text-align:center"><h1>Adressbuch</h1></div>
		</div>
	 </div>
	 </section>
 </header>
 
 	 <div class="container">
		<div class="row">
		 <hr>
		 <div class="col-lg-6 col-lg-offset-4">

			<ul>
				<li><a href="${rc.getContextPath()}/suchen">Adresse Suchen</a></li>
				<li><a href="${rc.getContextPath()}/adresse">Neue Adresse speichern</a></li>
			</ul>
		
		 </div>
		</div>
 	</div>
 
  </body>
</html>