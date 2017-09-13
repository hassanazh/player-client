package server;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Player {
    private String ranking;
    private String seasonId;
    private String seasonName;
    private String tournamentId;
    private String tournamentRegionId;
    private String tournamentRegionCode;
    private String regionCode;
    private String tournamentName;
    private String tournamentShortName;
    private String firstName;
    private String lastName;
    private String playerId;
    private Boolean isActive;
    private Boolean isOpta;
    private String teamId;
    private String teamName;
    private String playedPositions;
    private String age;
    private String height;
    private String weight;
    private String positionText;
    private String apps;
    private String subOn;
    private String minsPlayed;
    private String rating;
    private String goal;
    private String assistTotal;
    private String yellowCard;
    private String redCard;
    private String shotsPerGame;
    private String aerialWonPerGame;
    private String manOfTheMatch;
    private String name;
    private Boolean isManOfTheMatch;
    private String playedPositionsShort;
    private String passSuccess;

    public Player(String ranking,
            String seasonId,
            String seasonName,
            String tournamentId,
            String tournamentRegionId,
            String tournamentRegionCode,
            String regionCode,
            String tournamentName,
            String tournamentShortName,
            String firstName,
            String lastName,
            String playerId,
            Boolean isActive,
            Boolean isOpta,
            String teamId,
            String teamName,
            String playedPositions,
            String age,
            String height,
            String weight,
            String positionText,
            String apps,
            String subOn,
            String minsPlayed,
            String rating,
            String goal,
            String assistTotal,
            String yellowCard,
            String redCard,
            String shotsPerGame,
            String aerialWonPerGame,
            String manOfTheMatch,
            String name,
            Boolean isManOfTheMatch,
            String playedPositionsShort,
            String passSuccess){
        this.ranking = ranking ;
        this.seasonId = seasonId;
        this.seasonName = seasonName;
        this.tournamentId = tournamentId;
        this.tournamentRegionId = tournamentRegionId;
        this.tournamentRegionCode = tournamentRegionCode;
        this.regionCode = regionCode;
        this.tournamentName = tournamentName;
        this.tournamentShortName = tournamentShortName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.playerId = playerId;
        this.isActive = isActive;
        this.isOpta = isOpta;
        this.teamId = teamId;
        this.teamName = teamName;
        this.playedPositions = playedPositions;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.positionText = positionText;
        this.apps = apps;
        this.subOn = subOn;
        this.minsPlayed = minsPlayed;
        this.rating = rating;
        this.goal = goal;
        this.assistTotal = assistTotal;
        this.yellowCard = yellowCard;
        this.redCard = redCard;
        this.shotsPerGame = shotsPerGame;
        this.aerialWonPerGame = aerialWonPerGame;
        this.manOfTheMatch = manOfTheMatch;
        this.name = name;
        this.isManOfTheMatch = isManOfTheMatch;
        this.playedPositionsShort = playedPositionsShort;
        this.passSuccess = passSuccess;
    }

    public String getAerialWonPerGame() {
        return aerialWonPerGame;
    }

    public String getAge() {
        return age;
    }

    public String getApps() {
        return apps;
    }

    public String getAssistTotal() {
        return assistTotal;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getGoal() {
        return goal;
    }

    public String getHeight() {
        return height;
    }

    public String getLastName() {
        return lastName;
    }

    public String getManOfTheMatch() {
        return manOfTheMatch;
    }

    public String getMinsPlayed() {
        return minsPlayed;
    }

    public String getName() {
        return name;
    }

    public String getPassSuccess() {
        return passSuccess;
    }

    public String getPlayedPositions() {
        return playedPositions;
    }

    public String getPlayedPositionsShort() {
        return playedPositionsShort;
    }

    public String getPlayerId() {
        return playerId;
    }

    public String getPositionText() {
        return positionText;
    }

    public String getRanking() {
        return ranking;
    }

    public String getRating() {
        return rating;
    }

    public String getRedCard() {
        return redCard;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public String getSeasonId() {
        return seasonId;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getShotsPerGame() {
        return shotsPerGame;
    }

    public String getSubOn() {
        return subOn;
    }

    public String getTeamId() {
        return teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getTournamentId() {
        return tournamentId;
    }

    public String getTournamentName() {
        return tournamentName;
    }

    public String getTournamentRegionCode() {
        return tournamentRegionCode;
    }

    public String getTournamentRegionId() {
        return tournamentRegionId;
    }

    public String getTournamentShortName() {
        return tournamentShortName;
    }

    public String getWeight() {
        return weight;
    }

    public String getYellowCard() {
        return yellowCard;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public Boolean getIsManOfTheMatch() {
        return isManOfTheMatch;
    }

    public Boolean getIsOpta() {
        return isOpta;
    }
}
