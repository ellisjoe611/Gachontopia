<?php  

$link=mysqli_connect("localhost","ellisjoe","", "ellisjoe" );  
if (!$link)  
{  
    echo "Error: cannot access MySQL...";
    echo mysqli_connect_error();
    exit();  
}  
mysqli_set_charset($link,"utf8"); 

$sql="select * from person";
$result=mysqli_query($link,$sql);
$data = array();   
if($result){  
    
    while($row=mysqli_fetch_array($result)){
        array_push($data, 
            array(
            'phone'=>$row[0],
            'password'=>$row[1],
			'type'=>$row[2],
			'home_area'=>$row[3],
			'home_addr'=>$row[4]
        ));
    }


	header('Content-Type: application/json; charset=utf8');
	$json = json_encode(array("person"=>$data), JSON_PRETTY_PRINT+JSON_UNESCAPED_UNICODE);
	echo $json;

}  
else{  
    echo "Error: cannot process SQL..."; 
    echo mysqli_error($link);
} 

mysqli_close($link);     
?>
