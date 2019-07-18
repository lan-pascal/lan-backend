package com.lanpascal.lanbackend;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LanBackendApplication {

    public static void main(String[] args) {



		MongoClientURI uri = new MongoClientURI(
				"mongodb+srv://admin:nU9lAneAm2AbRWLM@lan-pascal-cluster-djdkb.mongodb.net/test?retryWrites=true&w=majority");

		MongoClient mongoClient = new MongoClient(uri);
		MongoDatabase database = mongoClient.getDatabase("users");





		SpringApplication.run(LanBackendApplication.class, args);
    }

}
