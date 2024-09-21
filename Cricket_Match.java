/***
 * Creating a Cricket Match, in which user creates their team and add their player with their specifications. Afterward a  match a playing between two teams selected by the user. And who win the match is Shown.
 * Created by - Kiran Choudhary
 * Date - 17 September 2024
 */

package Assignment_5;

import java.util.Scanner;

public class Cricket_Match {
	
	private static String[] teamName = new String[0];
	private static String[][] addPlayer = new String[0][];
	 
	/*
	 * It takes cricket team names and players of that team with their specification from user and after that it create a team.
	 */
	public static void createTeam(Scanner userInput, Constant constant) {
	    boolean continueCreatingTeams = true;
	    while (continueCreatingTeams) {
	        System.out.println(constant.TEAM_SIZE);
	        int teamSize = userInput.nextInt();
	        userInput.nextLine(); //Consume the Newline Character
	        String[] newTeams = new String[teamName.length + teamSize];
	        String[][] newPlayers = new String[teamName.length + teamSize][];
	        for (int i = 0; i < teamName.length; i++) {
	            newTeams[i] = teamName[i];
	            newPlayers[i] = addPlayer[i];
	        }
	        teamName = newTeams;
	        addPlayer = newPlayers;
	        for (int i = 0; i < teamSize; i++) {
	            String createTeamName;
	            boolean isDuplicateTeam;
	            do {
	            	isDuplicateTeam = false;
	                System.out.println("Enter team name for team " + (teamName.length - teamSize + i + 1) + ":");
	                createTeamName = userInput.nextLine();
	                for (String existingTeam : teamName) {
	                    if (existingTeam != null && existingTeam.equalsIgnoreCase(createTeamName)) {
	                        System.out.println(constant.DUPLICATE_TEAM);
	                        isDuplicateTeam = true;
	                        break;
	                    }
	                }
	            } while (isDuplicateTeam);
	            teamName[teamName.length - teamSize + i] = createTeamName;
	            int playerSize = 0;
	            while (true) {
	                System.out.println(constant.PLAYER_SIZE);
	                playerSize = userInput.nextInt();
	                userInput.nextLine(); 
	                if (playerSize < 11) {
	                    System.out.println(constant.INVALID_TEAM_PLAYER_SIZE);
	                } else {
	                    break;
	                }
	            }
	            newPlayers[teamName.length - teamSize + i] = new String[playerSize * 2];
	            for (int j = 0; j < playerSize; j++) {
	                System.out.println(constant.PLAYER_NAME);
	                String playerName = userInput.nextLine();
	                String playerSpecification = "";
	                boolean validChoice = false;
	                while (!validChoice) {
	                    System.out.println(constant.PLAYER_SPECIFICATION);
	                    System.out.println(constant.BATSMAN);
	                    System.out.println(constant.BOWLER);
	                    String choice = userInput.nextLine();
	                    if (choice.equals("1")) {
	                        playerSpecification = constant.BATSMAN;
	                        validChoice = true;
	                    } else if (choice.equals("2")) {
	                        playerSpecification = constant.BOWLER;
	                        validChoice = true;
	                    } else {
	                        System.out.println(constant.INVALID_CHOICE);
	                    }
	                }
	                newPlayers[teamName.length - teamSize + i][j * 2] = playerName;
	                newPlayers[teamName.length - teamSize + i][j * 2 + 1] = playerSpecification;
	            }
	        }
	        System.out.println(constant.MORE_TEAM_CREATE_CHOICE);
	        System.out.println(constant.CREATE_MORE_TEAM);
	        System.out.println(constant.EXIT);
	        String choice = userInput.nextLine();
	        if (choice.equals("2")) {
	            continueCreatingTeams = false;
	        }
	    }
	}
	
	/*
	 * It uses to show the team name which are already created and ask the user whether they want to start the match between these teams or exit to main function.
	 */
	public static void viewTeam(Scanner userInput, Constant constant) {
		 if(teamName == null || teamName.length == 0) {
			 System.out.println(constant.NO_TEAMS);
			 return;
		 }
		 System.out.println(constant.CREATED_TEAMS);
		 for(int i = 0 ; i < teamName.length ; i++) {
			 System.out.println((i + 1) + ". " + teamName[i]);
		 }
		 System.out.println(constant.CHOICE);
		 System.out.println(constant.START_MATCH);
		 System.out.println(constant.EXIT);
		 String selectedOption = userInput.nextLine();
		 switch(selectedOption) {
		 	case "1" : {
		 		if(teamName.length < 2 ) {
		 			System.out.println(constant.NOT_ENOUGH_TEAM);
		 		}else {
		 			cricketMatch(teamName, addPlayer);
		 		}
		 		break;
		 	}
		 	case "2" : {
		 		break;
		 	}
		 	default : 
		 		System.out.println(constant.INVALID_CHOICE);
		 }
	}
	
	/*
	 * In this function the Cricket Match is started, it show in which teams match is started and who win the tose and who win the match.
	 */
	public static void cricketMatch(String[] teamName, String[][] addPlayer) {
		Scanner userInput = new Scanner(System.in);
		Constant constant = new Constant();
		System.out.println(constant.PLAY_MATCH);
		System.out.println(constant.CREATED_TEAMS);
		for(int i = 0 ; i < teamName.length ; i++) {
			System.out.println((i + 1) + ". " + teamName[i]);
		}
		System.out.println(constant.TEAMS_OF_MATCH);
		System.out.println(constant.FIRST_TEAM);
		int firstTeamSelect = userInput.nextInt();
		userInput.nextLine();
		if(firstTeamSelect < 1 || firstTeamSelect > teamName.length) {
			System.out.println(constant.INVALID_CHOICE);
			return;
		}
	    int secondTeamSelect = 0 ;
	    while(true) {
		System.out.println(constant.SECOND_TEAM);
		secondTeamSelect = userInput.nextInt();
		userInput.nextLine();
		if(secondTeamSelect < 1 || secondTeamSelect > teamName.length) {
			System.out.println(constant.INVALID_CHOICE);
			continue;
			}
			if(firstTeamSelect == secondTeamSelect) {
				System.out.println(constant.ALREADY_SELECTED_TEAM);
			}
			break;
		}
		int selectedFirstTeamIndex = firstTeamSelect - 1;
		System.out.println("Team: " + teamName[selectedFirstTeamIndex]);
		System.out.println(constant.PLAYERNAME_AND_PLAYERSPECIFICATION);
		for(int j = 0 ; j < addPlayer[selectedFirstTeamIndex].length; j+=2) {
			String playerName = addPlayer[selectedFirstTeamIndex][j];
			String playerSpecification = addPlayer[selectedFirstTeamIndex][j + 1];
			System.out.println("Player " + (j / 2 + 1) + ": " + playerName + " - " + playerSpecification);
		}
		int selectedSecondTeamIndex = secondTeamSelect - 1;
		System.out.println("Team: " + teamName[selectedSecondTeamIndex]);
		System.out.println(constant.PLAYERNAME_AND_PLAYERSPECIFICATION);
		for(int j = 0 ; j < addPlayer[selectedSecondTeamIndex].length; j+=2) {
			String playerName = addPlayer[selectedSecondTeamIndex][j];
			String playerSpecification = addPlayer[selectedSecondTeamIndex][j + 1];
			System.out.println("Player " + (j / 2 + 1) + ": " + playerName + " - " + playerSpecification);
		}
		System.out.println(constant.SELECTED_PLAYER_TEAM1);
	    String[] selectedFirstTeamPlayers = selectPlayerTeam(userInput, constant, addPlayer[selectedFirstTeamIndex]);		
		System.out.println(constant.SELECTED_PLAYER_TEAM2);
	    String[] selectedSecondTeamPlayers = selectPlayerTeam(userInput, constant, addPlayer[selectedSecondTeamIndex]);		
	    char playAgain;
	    do {
	    System.out.println(constant.TOTAL_OVERS);
	    int overs = userInput.nextInt();
	    System.out.println("Match between " + teamName[firstTeamSelect - 1] + " and " + teamName[secondTeamSelect - 1] + " has been set up!");
	    System.out.println(constant.TOSE);
	    System.out.println(constant.HEAD);
	    System.out.println(constant.TAIL);
	    System.out.println(constant.TOSE_SELCTION);
	    int toseChoice = userInput.nextInt();
	    userInput.nextLine();
	    if(toseChoice == 1) {
	    	System.out.println(constant.TOSE_WIN_TEAM1);
	    	int firstTeamScore  = batting(selectedFirstTeamPlayers, overs, userInput);
	    	System.out.println("Target score for Team-2: " + firstTeamScore);
	    	int secondTeamScore = batting(selectedSecondTeamPlayers, overs, userInput);
	    	System.out.println(constant.FINAL_SCORE);
	    	System.out.println(teamName[firstTeamSelect - 1] + ": " + firstTeamScore);
	    	System.out.println(teamName[secondTeamSelect - 1] + ": " + secondTeamScore);
	    	if (firstTeamScore > secondTeamScore) {
	    	    System.out.println("Winner: " + teamName[firstTeamSelect - 1]);
	    	} else if (secondTeamScore > firstTeamScore) {
	    	    System.out.println("Winner: " + teamName[secondTeamSelect - 1]);
	    	} else {
	    	    System.out.println(constant.MATCH_TIE);
	    	}
	    	System.out.println(constant.REPEAT_GAME);
	    	String continueGame = userInput.nextLine();
	    	if(continueGame.equals("Y") || continueGame.equals("y")) {
	    	System.out.println(constant.TEAM_PLAY);
	    	batting(selectedFirstTeamPlayers, overs, userInput);
	    	}else {
	    		System.out.println(constant.GAME_ENDED);
	    	}
	    }else if(toseChoice == 2) {
	    	System.out.println(constant.TOSE_WIN_TEAM2);
	    	int firstTeamScore = batting(selectedSecondTeamPlayers, overs, userInput);
	    	System.out.println("Target score for Team-2: " + firstTeamScore);
	    	System.out.println(constant.REPEAT_GAME);
	    	String continueGame = userInput.nextLine();
	    	if(continueGame.equals("Y") || continueGame.equals("y")) {
	    	System.out.println(constant.TEAM_PLAY);
	    	batting(selectedFirstTeamPlayers, overs, userInput);
	    	}
	    }else {
	    	System.out.println(constant.INVALID_CHOICE);
	    }
	    System.out.println(constant.MORE_MATCH);
	    playAgain = userInput.next().charAt(0);
	    userInput.nextLine();
	    }while(playAgain == 'Y' || playAgain == 'y');
	    System.out.println(constant.THANKS_FOR_MATCH);
	    userInput.close();
	}
	/*
	 * In this function the players for match from each team is selected.
	 */
	public static String[] selectPlayerTeam(Scanner userInput, Constant constant,String[] addPlayer) {
		String[] selectedPlayers = new String[11];
	    boolean[] selected = new boolean[addPlayer.length / 2];
	    int selectedPlayerCount = 0;
	    while (selectedPlayerCount < 11) {
	        System.out.println("Select player number (1 to " + (addPlayer.length / 2) + "): ");
	        int playerNumber = userInput.nextInt();
	        userInput.nextLine();
	        
	        if (playerNumber < 1 || playerNumber > (addPlayer.length / 2)) {
	            System.out.println(constant.INVALID_PLAYER_NUMBER);
	            continue;
	        }
	        
	        if (selected[playerNumber - 1]) {
	            System.out.println(constant.SELECTED_PLAYER);
	            continue;
	        }
	        
	        selected[playerNumber - 1] = true;
	        selectedPlayers[selectedPlayerCount] = addPlayer[(playerNumber - 1) * 2]; 
	        selectedPlayerCount++;
	        System.out.println("Player " + playerNumber + " selected.");
	    }
	    return selectedPlayers;
	}
	
	/*
	 * In this function Batting is done. 
	 */
	public static int batting(String[] selectTeamPlayer, int overs, Scanner userInput) {
		Constant constant = new Constant();
  	  int strikerIndex = 0; 	    	
  	  int nonStrikerIndex = 1;
  	  int nextPlayerIndex = 2;  
  	  int wicket = 0;
  	  int totalRuns = 0;
  	  int totalBall = 0;
  	  int ballInOver = 0;
  	  int over = 0; 
  	  int[] playerRuns = new int[11];
  	  System.out.println("Team-1 Striker: " + selectTeamPlayer[strikerIndex]);	
  	  System.out.println("Team-1 Non-Striker: " + selectTeamPlayer[nonStrikerIndex]);
	  while(wicket < 11 && totalBall < overs*6) {
		   System.out.println("\nOver: " + (over + 1) + " | Ball: " + (ballInOver + 1));
		  System.out.println();
		  System.out.println(constant.RUN);
		  System.out.println(constant.WIDE);
		  System.out.println(constant.NO_BALL);
		  System.out.println(constant.WICKET);
		  String selection = userInput.nextLine();
		  switch(selection) {
		  	case "1" : {
		  		System.out.println(constant.RUN_TAKEN);
		  		int runs = userInput.nextInt();
		  		userInput.nextLine();
		  		playerRuns[strikerIndex] += runs;
		  		totalRuns += runs;
	  			totalBall++;	
	  			ballInOver++;
		  		if(runs % 2 != 0) {
		  			String temp = selectTeamPlayer[strikerIndex];
		  			selectTeamPlayer[strikerIndex] = selectTeamPlayer[nonStrikerIndex];
		  			selectTeamPlayer[nonStrikerIndex] = temp;
		  			int tempRun = playerRuns[strikerIndex];
		  			playerRuns[strikerIndex] = playerRuns[nonStrikerIndex];
		  			playerRuns[nonStrikerIndex] = tempRun;
		  		}	    	      
		  		System.out.println(totalRuns + " / " + wicket);
		    	System.out.println("Team-1 Striker: " + selectTeamPlayer[strikerIndex]);	
		    	System.out.println("Team-1 Non-Striker: " + selectTeamPlayer[nonStrikerIndex]);
		  		break;
		  	}
		  	case "2" : {
		  		totalRuns += 1;
    	        System.out.println(totalRuns + " / " + wicket);
    	        System.out.println("Team-1 Striker: " + selectTeamPlayer[strikerIndex]);
    	        System.out.println("Team-1 Non-Striker: " + selectTeamPlayer[nonStrikerIndex]);
		  		break;
		  	}
		  	case "3" : {
		  		totalRuns += 1;
    	        System.out.println(totalRuns + " / " + wicket);
    	        System.out.println("Team-1 Striker: " + selectTeamPlayer[strikerIndex]);
    	        System.out.println("Team-1 Non-Striker: " + selectTeamPlayer[nonStrikerIndex]);
		  		break;
		  	}
		  	case "4" : {
		  		System.out.println("Oh no! Player " + selectTeamPlayer[strikerIndex] + " is OUT!");
		  		wicket++;
		  		totalBall++;
		  		ballInOver++;
	    	    if(nextPlayerIndex < 11) {
	    	    	strikerIndex = nextPlayerIndex;
	    	    	nextPlayerIndex++;  
	    	    }
	    	    System.out.println(totalRuns + " / " + wicket);
	    	    System.out.println("Team-1 New Striker: " + selectTeamPlayer[strikerIndex]);
	    	    System.out.println("Team-1 Non-Striker: " + selectTeamPlayer[nonStrikerIndex]);
		  		break;
		  	}
		  	default : 
		  		System.out.println(constant.INVALID_CHOICE);
		  }
		  if (ballInOver == 6) {
	            over++; 
	            ballInOver = 0; 
	        }
	  }
	  System.out.println(constant.BATTING_COMPLETED);
	  System.out.println(constant.FINAL_SCORE);
	    for (int i = 0; i < selectTeamPlayer.length; i++) {
	        System.out.println(selectTeamPlayer[i] + ": " + playerRuns[i] + " runs");
	    }
	    return totalRuns;
	} 
	
	/*
	 * It's the Main class
	 */
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		Constant constant = new Constant();
	    System.out.println(constant.WELCOME);
        char repeatMain;
		do {
			System.out.println(constant.USER_CHOICE);
			System.out.println(constant.CREATE_TEAM);
			System.out.println(constant.VIEW_TEAM);
			System.out.println(constant.START_MATCH);
			System.out.println(constant.CHOICE);
			String createTeam = userInput.nextLine();
			switch(createTeam) {
				case "1" : {
					boolean createTeamName = true;
					while(createTeamName) {
						System.out.println(constant.PERFORM);
						System.out.println(constant.CREATE_A_TEAM);
						System.out.println(constant.EXIT);
						System.out.println(constant.CHOICE);
						String choice = userInput.nextLine();
						switch(choice) {
							case "1" : {
								createTeam(userInput, constant);
								break;
							}
							case "2" : {
								createTeamName = false;
								break;
							}
							default : {
	                            System.out.println(constant.INVALID_CHOICE);
	                            break;
							}
						}
					}
					break;
				}
				case "2" : {
					viewTeam(userInput, constant);
					break;
				}
				case "3" : {
					if(teamName == null || teamName.length < 2 ) {
						System.out.println(constant.NOT_ENOUGH_TEAM);
					}else {
						cricketMatch(teamName, addPlayer);
					}
					break;
				}
				default:
					System.out.println(constant.INVALID_INPUT);
					break;
			}
			System.out.println(constant.REPEAT_GAME);
			repeatMain = userInput.next().charAt(0);
			userInput.nextLine();
		}while(repeatMain == 'Y' || repeatMain == 'y');
	    System.out.println(constant.GAME_ENDED);
	}
}