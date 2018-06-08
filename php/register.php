<?php
	$con = mysqli_connect("localhost", "ellisjoe", "", "ellisjoe");
	
	//First, get the input from client(android)
	$phone = $_POST["phone"];
	$password = $_POST["password"];
	$type = $_POST["type"];
	$home_area = $_POST["home_area"];
	$home_addr = $_POST["home_addr"];
	
	$statement = mysqli_prepare($con, "SELECT phone FROM person WHERE phone = ?");
	mysqli_stmt_bind_param($statement, "s", $phone);
	mysqli_stmt_execute($statement);	
	
	mysqli_stmt_store_result($statement);
	mysqli_stmt_bind_result($statement, $phone);
	
	$notExist = array();
	$notExist["success"] = true;
	while(mysqli_stmt_fetch($statement)) {
		$notExist["success"] = false;
	}
	
	if($notExist["success"] == false){
		echo json_encode($notExist);
	}
	else{
		//Second, execute MySQL statement to store the result on '$statement'
		$statement = mysqli_prepare($con, "insert into person values (?,?,?,?,?)");
		mysqli_stmt_bind_param($statement, "sssss", $phone, $password, $type, $home_area, $home_addr);
		mysqli_stmt_execute($statement);
	
		$statement = mysqli_prepare($con, "SELECT * FROM person WHERE phone = ? AND password = ?");
		mysqli_stmt_bind_param($statement, "ss", $phone, $password);
		mysqli_stmt_execute($statement);
	
		//Store the result from MySQL statement into each elements on '$statement'
		mysqli_stmt_store_result($statement);
		mysqli_stmt_bind_result($statement, $phone, $password, $type, $home_area, $home_addr);
	
		//Third, prepare to send result data called '$response' on JSON
		$response = array();
		$response["success"] = false;
	
		while(mysqli_stmt_fetch($statement)) {
			$response["success"] = true;
		}
	
		//Finally, gather all data '$response' into JSON
		echo json_encode($response);
	}
?>