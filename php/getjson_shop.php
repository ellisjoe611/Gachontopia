<?php  

$link=mysqli_connect("localhost","ellisjoe","", "ellisjoe" );  
if (!$link)  
{  
    echo "Error: cannot access MySQL...";
    echo mysqli_connect_error();
    exit();  
}  
mysqli_set_charset($link,"utf8"); 

$sql="select * from shop";
$result=mysqli_query($link,$sql);
$data = array();   
if($result){  
    
    while($row=mysqli_fetch_array($result)){
        array_push($data, 
            array(
            'phone'=>$row[0],
            'shop_area'=>$row[1],
			'shop_addr'=>$row[2]
        ));
    }


	header('Content-Type: application/json; charset=utf8');
	$json = json_encode(array("shop"=>$data), JSON_PRETTY_PRINT+JSON_UNESCAPED_UNICODE);
	echo $json;

}  
else{  
    echo "Error: cannot process SQL..."; 
    echo mysqli_error($link);
} 

mysqli_close($link);     
?>
