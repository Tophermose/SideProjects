<?PHP 
$problem=$_GET["problem"];
$choice=$_GET["choice"];
$b = 1;

if($problem=='1') {
	$x=(int)$_GET['numC'];
	for($i=1; $i<=$x; $i++){
		$b *= $i;
	}
	echo $b;
} else if ($problem=='2') {
	if($choice=='2') {
		$x=(float)$_GET['numD'];
		(float)$y=$x*$x;
		echo $y;
	} else if ($choice=='3') {
		$x=(float)$_GET['numD'];
		(float)$y=$x*4;
		echo $y;
	}
} else if($problem=='3') {
	$x=(int)$_GET['numA'];
	$y=(int)$_GET['numB'];
	$z=(float)($x+$y)/2;
	if($choice='5') {
		echo $z;
	} else {
		echo "Error";
	}
} else if ($problem=='4') {
	$x=(int)$_GET['numA'];
	$y=(int)$_GET['numB'];
	$z=(float)($x+$y)/2;
	if ($z>='90') {
		$a = 'A';
	} else if($z>='80') {
		$a = 'B';
	} else if($z>='70') {
		$a = 'C';
	} else if($z>='60') {
		$a = 'D';
	} else {
		$a = 'F';
	}
	echo $a;
}
?>