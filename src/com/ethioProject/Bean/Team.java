package com.ethioProject.Bean;

public class Team {
    String id;
    String teamName;

    public Team( String id,String teamName){
        this.id=id;
        this.teamName=teamName;
    }

    public void setId(String id){
        this.id=id;

    }
    public void setTeamName(String teamName){
        this.teamName=teamName;
    }
    public String getId(){
        return id;
    }
    public String getTeamName(){
        return teamName;
    }
}