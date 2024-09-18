/***
 * Creating a Cricket Match, in which user creates their team and add their player with their specifications and choose their team. Afterward a match a playing between two teams.
 */

package Assignment_5;

import java.util.Scanner;

public class Cricket_Match {
	 
	/*
	 * It takes cricket team names from user and after that it create a team.
	 */
	public static void createTeam() {
		Scanner userInput = new Scanner(System.in);
		Constant constant = new Constant();
		System.out.println(constant.TEAM_SIZE);
		int teamSize = userInput.nextInt();		
		userInput.nextLine();  
		String[] teamName = new String[teamSize];
		for(int i = 0 ; i < teamSize ; i++) {
			System.out.println(constant.ENTER_STRING);
			String createTeamName = userInput.nextLine();
			teamName[i] = createTeamName ;
		}
		addPlayer(teamName);
	}
	
	/*
	 * It takes player name, their specification and ask them which team they choose.
	 */
	public static void addPlayer(String[] teamName) {
		Scanner userInput = new Scanner(System.in);
		Constant constant = new Constant();
		System.out.println(constant.ENTER_TEAM_SIZE);
		int teamSize = userInput.nextInt();
		userInput.nextLine();
		String[][] addPlayer = new String[teamSize][2];
		for(int i = 0 ; i < teamSize ; i++) {
			System.out.println(constant.ENTER_PLAYER_NAME);
			String playerName = userInput.nextLine();
			System.out.println(constant.ENTER_SPECIFICATION_OF_PLAYER);
			String playerSpecification = userInput.nextLine();
			addPlayer[i][0] = playerName;
			addPlayer[i][1] = playerSpecification;
			System.out.println(constant.TEAM_NAME);
			for(int j = 0 ; j < teamName.length ; j++) {
	            System.out.println((j + 1) + ". " + teamName[j]);
			}
			System.out.println(constant.ENTER_THE_TEAM_NUMBER);
			int teamNumber = userInput.nextInt();
			userInput.nextLine();
			if(teamNumber < 1 || teamNumber > teamName.length) {
				System.out.println(constant.INVALID_CHOICE);
			}else {
	           String selectedTeam = teamName[teamNumber -1];
				}
			}
		
	}
	
	/*
	 * It uses to show the available teams name
	 */
	public static void viewTeam(String createTeam) {
		 
	}
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		Constant constant = new Constant();
		System.out.println(constant.CREATE_TEAM);
		String createTeam = userInput.nextLine();
		switch(createTeam) {
			case "Create Team" : {
				createTeam();
			}
			case "View Teams" : {
				viewTeam(createTeam);
			}
		}
	}
}
