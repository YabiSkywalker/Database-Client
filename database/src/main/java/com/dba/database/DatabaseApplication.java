package com.dba.database;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;




public class DatabaseApplication {
	public static void main(String[] args) throws Exception {

		SpringApplication.run(DatabaseApplication.class, args);
		client c = new client();

		//Temporary intake system
		Scanner sc = new Scanner(System.in);
		//String search = sc.nextLine();

		int index = c.rowCount;
		String[] entry = {String.valueOf(index), "YABI", "YABI", "YABI", "YABI", "JED", "JED", "JED", "JED", "JED", "JED", "JED", "JED", "JED", "JED"};
		//System.out.println(Arrays.toString(entry));
		c.createEntry(entry);
		//c.readFrom();

		//String[] resolution = {"404", "errorMessage", "technology", "uc4Client", "application", "developer", "jobPlan", "job", "stepsToReproduce", "resolution", "pillar", "sdlc", "valueStream", "requester"};
		//client.updateCell();



		//guiBuilder g = new guiBuilder();


	}
}



