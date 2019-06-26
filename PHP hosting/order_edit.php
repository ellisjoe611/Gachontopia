<?php
$link=mysqli_connect("localhost","user","pw", "user" );  
	
	$client_phone = $_POST["client_phone"];
	$shop_area = $_POST["shop_area"];
	$home_addr = $_POST["home_addr"];
	$date_in = $_POST["date_in"];
	$date_out = $_POST["date_out"];
	$status = $_POST["status"];
	$new_status = $_POST["new_status"];
	
	$statement = mysqli_prepare($con, "UPDATE `ellisjoe`.`order` SET `status` = ? where (`client_phone`,`shop_area`,`home_addr`,`date_in`,`date_out`,`status`) = (?,?,?,?,?,?)");
	mysqli_stmt_bind_param($statement, "sssssss", $new_status, $client_phone, $shop_area, $home_addr, $date_in, $date_out, $status);
	mysqli_stmt_execute($statement);
	
	$statement = mysqli_prepare($con, "SELECT * FROM `order` WHERE (`client_phone`,`shop_area`,`home_addr`,`date_in`,`date_out`,`status`) = (?,?,?,?,?,?)");
	mysqli_stmt_bind_param($statement, "ssssss", $client_phone, $shop_area, $home_addr, $date_in, $date_out, $new_status);
	mysqli_stmt_execute($statement);

	mysqli_stmt_store_result($statement);
	mysqli_stmt_bind_result($statement, $client_phone, $shop_area, $home_addr, $date_in, $date_out, $new_status);
	
	$response = array();
	$response["success"] = false;
	
	while(mysqli_stmt_fetch($statement)) {
		$response["success"] = true;
	}
	
	echo json_encode($response);
?>