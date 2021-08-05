package com.data.model;

public class Customer
{
    Long customerId;
    int contractId;
    String geozone;
    String teamcode;
    String projectcode;
    int buildduration;

    public Long getCustomerId()
    {
        return customerId;
    }

    public void setCustomerId( Long customerId )
    {
        this.customerId = customerId;
    }

    public int getContractId()
    {
        return contractId;
    }

    public void setContractId( int contractId )
    {
        this.contractId = contractId;
    }

    public String getGeozone()
    {
        return geozone;
    }

    public void setGeozone( String geozone )
    {
        this.geozone = geozone;
    }

    public String getTeamcode()
    {
        return teamcode;
    }

    public void setTeamcode( String teamcode )
    {
        this.teamcode = teamcode;
    }

    public String getProjectcode()
    {
        return projectcode;
    }

    public void setProjectcode( String projectcode )
    {
        this.projectcode = projectcode;
    }

    public int getBuildduration() {return buildduration; }

    public void setBuildduration( int buildduration )
    {
        this.buildduration = buildduration;
    }
}

