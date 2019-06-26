<?php  

$link=mysqli_connect("localhost","user","pw", "user" );  
if (!$link)  
{  
    echo "Error: cannot access MySQL...";
    echo mysqli_connect_error();
    exit();  
}  
mysqli_set_charset($link,"utf8"); 

$sql="SELECT * FROM `order` ORDER BY `date_in` DESC";
$result=mysqli_query($link,$sql);
$data = array();   
if($result){  
    
    while($row=mysqli_fetch_array($result)){
        array_push($data, 
            array(
            'client_phone'=>$row[0],
            'shop_area'=>$row[1],
			'home_addr'=>$row[2],
			'date_in'=>$row[3],
			'date_out'=>$row[4],
			'status'=>$row[5],
        ));
    }


	header('Content-Type: application/json; charset=utf8');
	$json = json_encode(array("order"=>$data), JSON_PRETTY_PRINT+JSON_UNESCAPED_UNICODE);
	echo $json;

}  
else{  
    echo "Error: cannot process SQL..."; 
    echo mysqli_error($link);
} 

mysqli_close($link);     
?>