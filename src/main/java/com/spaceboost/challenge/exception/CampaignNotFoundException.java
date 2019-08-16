package com.spaceboost.challenge.exception;

public class CampaignNotFoundException extends RuntimeException {


    public CampaignNotFoundException(int campaignId) {
        super(String.valueOf(campaignId));
    }

}
