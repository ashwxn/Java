<html>
<body><caption><center>Student Marks Entry</caption><p>
<table border=3 cellspacing=3 cellpadding=3>
<tr><tn>name<th>reg.no<th>dept
<form method="post">
Name=<input type="text" name="name"><br/>
Reg=<input type="text" name="reg"><br/>
Dept=<input type="text" name="dept"><br/>
MC:<input type="number" name="MC"/><br/>
MCE:<input type="number" name="MCE"/><br/>
ST:<input type="number" name="ST"/><br/>
PE:<input type="number" name="PE"/><br/>
AI:<input type="number" name="AI"/><br/>
<input type="Submit" name ="Submit" value="Submit">
</form> 
<?php
if(isset($_POST['Submit']))
{
$name=$_POST["name"];
$reg=$_POST["reg"];
$dept=$_POST["dept"];
$sub1=$_POST["MC"];
$sub2=$_POST["MCE"];
$sub3=$_POST["ST"];
$sub4=$_POST["PE"];
$sub5=$_POST["AI"];
$total=$sub1+$sub2+$sub3+$sub4+$sub5;
$avg=$total/5;
if($avg>90)$grade="0";
elseif(($avg>70)&&($avg<80))
$grade="B";
elseif(($avg>60)&&($avg<70))
$grade="C";
elseif(($avg>50)&&($avg<60))
$grade="D";
else
$grade="FAIL";
echo"<align='center'><b>MARK STATEMENT FOR VI SEMESTER</b></align>";
echo"<table border='1'>";
echo"<tr>","<th>NAME</th>","<td>$name</td>","</tr>";
echo"<tr>","<th>REGISTER NUMBER</th>","<td>$reg</td>","</tr>";
echo"<tr>","<th>DEPARTMENT</th>","<td>$dept</td>","</tr>";
echo"<tr>","<th>MOBILE COMPUTING</th>","<td>$sub1</td>","</tr>";
echo"<tr>","<th>MICROCONTROLLER&EMBEDDED SYSTEM</th>","<td>$sub2</td>","</tr>";
echo"<tr>","<th>SOFTWARE TESTING</th>","<td>$sub3</td>","</tr>";
echo"<tr>","<th>PROFESSIONAL  ETHICS</th>","<td>$sub4</td>","</tr>";
echo"<tr>","<th>ARTIFICIAL INTELLIGENCE</th>","<td>$sub5</td>","</tr>";
echo"<tr>","<th>TOTAL</th>","<td>$total</td>","</tr>";
echo"<tr>","<th>AVERAGE</th>","<td>$avg</td>","</tr>";
echo"<tr>","<th>GRADE</th>","<td>$grade</td>","</tr>";
}
?>
</body>
</html>
