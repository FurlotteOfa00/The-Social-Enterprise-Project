<?php

//Opening tag

//Including necessary files

require_once("config.php");
require_once("models/database.php");

// Create the database connection

$db = new Database($database_host, $database_name, $database_user, $database_password);

//Create the user signup function

function createUser($firstName, $lastName, $email, $password){
	global $db;
	$sql = "INSERT INTO users (first_name, last_name, email, password) VALUES ('$firstName', '$lastName', '$email', '$password');";
	$result = $db->query($sql);
	return $result;
}

//Create the user login function

function loginUser($username, $password){
	global $db;
	$sql = "SELECT * FROM users WHERE email='$username' AND password='$password'";
	$result = $db->query($sql);	
	if ($result->num_rows > 0){
		return true;
	} else {
		return false;
	}	
}

//Create the user profile function

function getUserProfile($userId){
	global $db;
	$sql = "SELECT * FROM users WHERE id=$userId";
	$result = $db->query($sql);
	return $result;
}

//Create the Social enterprise search function

function searchEnterprises($searchTerm){
	global $db;
	$sql = "SELECT * FROM enterprises WHERE name LIKE '%$searchTerm%' OR description LIKE '%$searchTerm%' OR address LIKE '%$searchTerm%' OR city LIKE '%$searchTerm%' OR country LIKE '%$searchTerm%'";
	$result = $db->query($sql);
	return $result;
}

//Create the enterprise following function

function followEnterprise($userId, $enterpriseId){
	global $db;
	$sql = "INSERT INTO followers (user_id, enterprise_id) VALUES ($userId, $enterpriseId);";
	$result = $db->query($sql);
	return $result;
}

//Create the enterprise unfollow function

function unfollowEnterprise($userId, $enterpriseId){
	global $db;
	$sql = "DELETE FROM followers WHERE user_id=$userId AND enterprise_id=$enterpriseId";
	$result = $db->query($sql);
	return $result;
}

//Create the enterprise add function

function addEnterprise($name, $address, $address2, $city, $state, $country, $zip, $description){
	global $db;
	$sql = "INSERT INTO enterprises (name, address, address2, city, state, country, zip, description) VALUES ('$name', '$address', '$address2', '$city', '$state', '$country', '$zip', '$description');";
	$result = $db->query($sql);
	return $result;
}

//Create the enterprise update function

function updateEnterprise($enterpriseId, $name, $address, $address2, $city, $state, $country, $zip, $description){
	global $db;
	$sql = "UPDATE enterprises SET name='$name', address='$address', address2='$address2', city='$city', state='$state', country='$country', zip='$zip', description='$description' WHERE id=$enterpriseId";
	$result = $db->query($sql);
	return $result;
}

//Create the enterprise delete function

function deleteEnterprise($enterpriseId){
	global $db;
	$sql = "DELETE FROM enterprises WHERE id=$enterpriseId;";
	$result = $db->query($sql);
	return $result;
}

//Create the enterprise get followers function

function getEnterpriseFollowers($enterpriseId){
	global $db;
	$sql = "SELECT * FROM followers WHERE enterprise_id=$enterpriseId";
	$result = $db->query($sql);
	return $result;
}

//Create the enterprise get donations function

function getEnterpriseDonations($enterpriseId){
	global $db;
	$sql = "SELECT * FROM donations WHERE enterprise_id=$enterpriseId";
	$result = $db->query($sql);
	return $result;
}

//Create the donation add function

function addDonation($enterpriseId, $userId, $amount){
	global $db;
	$sql = "INSERT INTO donations (enterprise_id, user_id, amount) VALUES ($enterpriseId, $userId, $amount);";
	$result = $db->query($sql);
	return $result;
}

//Create the donation delete function

function deleteDonation($donationId){
	global $db;
	$sql = "DELETE FROM donations WHERE id=$donationId;";
	$result = $db->query($sql);
	return $result;
}

//Closing tag

?>