package model;

public class User {
    private String username;
    private int verificationLevel;
    private double trustScore;

    public User(String username, int verificationLevel, double trustScore) {
        this.setUsername(username);
        this.verificationLevel = verificationLevel;
        this.trustScore = trustScore;
    }

    public int getVerificationLevel() {
        return verificationLevel;
    }

    public double getTrustScore() {
        return trustScore;
    }

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}

