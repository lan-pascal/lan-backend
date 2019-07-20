# lan-backend

# DEV SETUP

To connect to the database in the Atlas cloud, copy the env vars from here: https://github.com/orgs/lan-pascal/teams/backend/discussions/1/



# Local Setup


* Add your environment variables:

 	``export MONGO_URI=mongodb://localhost:27017``
 	
 	``export MONGO_DB=lan-pascal``
* Download MongoDb Community Server
	https://www.mongodb.com/download-center/community?jmp=docs
	
* Run the server:

	``mongod.exe``
	
* Run the project

	``mvn clean install``
	``mvn spring-boot:run``
