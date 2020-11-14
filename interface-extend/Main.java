interface Election {
   void setParty(String party);
   void setCandidate(String candidate);
}

interface Voting extends Election {
   void votesScored(int votes);
   void ballotsCovered(int ballots);
}

class Democrat implements Voting {
	int votes, ballots;
	String candidate, party;
	
	public void setParty (String newParty) {
		party = newParty;
	}	

	public void setCandidate (String newCandidate) {
		candidate = newCandidate;
	}
	
	public void votesScored (int newVotes) {
		votes = newVotes;
	}
	
	public void ballotsCovered (int newBallots) {
		ballots = newBallots;
	}
	
	public void printStates() { 
		System.out.println("Party: " + party);
		System.out.println("Candidate: " + candidate);
		System.out.println("Ballots Covered: " + ballots);
		System.out.println("Votes Scored: " + votes);
	}
}

class Main { 
	
	public static void main (String[] args) { 
	
		Democrat democrat = new Democrat();
		
		democrat.setParty("Democrat");
		democrat.setCandidate("Joe Biden");
		democrat.ballotsCovered(264);
		democrat.votesScored(696969);
		democrat.printStates();
	} 
} 
