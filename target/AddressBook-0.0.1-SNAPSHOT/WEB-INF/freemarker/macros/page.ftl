<#macro rahmen>

<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Sportkurse</title>
    <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet'  type='text/css'>
	<script src="http://code.jquery.com/jquery-1.10.2.js"></script>

    <!-- Bootstrap -->
    <link href="../resources/css/bootstrap.min.css" rel="stylesheet">
	<link rel="stylesheet" href="../resources/css/bootstrap-multiselect.css" type="text/css"/>
    <link href="../resources/css/myStyle.css" rel="stylesheet">
    <link href='http://fonts.googleapis.com/css?family=PT+Sans+Narrow' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Bree+Serif' rel='stylesheet' type='text/css'>
   
	<script src="../resources/js/jquery-2.1.0.min.js"></script>
	<script src="../resources/js/bootstrap.min.js"></script>
	<script src="../resources/js/meinjs.js"></script>
	<script type="text/javascript" src="../resources/js/bootstrap-multiselect.js"></script>
	<link href='http://fonts.googleapis.com/css?family=Lora:700' rel='stylesheet' type='text/css'>
    
</head>
<body class="maingradient">


<!-- Initialize the plugin: -->
<script type="text/javascript">
	$(document).ready(function() {
		$('.multiselect').multiselect();
	});
</script>


    <#nested>



<section class="footerSection paddingtop100">
	<div class="container"><center>
		<footer class="row" style="padding-top:20px">
			<div class="col col-md-12 col-xl-12 col-xs-12">
			<ol ">
				<li-unstyled><a href="impressum.html" style="color:#bbbbbb">Impressum</a></li>
				<li-unstyled><a href="kontakt.html" style="color:#bbbbbb">Kontakt</a></li>
			</ol>
			</div>
		</center></footer>
</section>






</body>

</html>


</#macro>