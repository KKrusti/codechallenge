package com.spaceboost.challenge.exception;

public class KeywordNotFoundException extends RuntimeException {

    public KeywordNotFoundException(int keywordId) {
        super("keyword-not-found-" + keywordId);
    }

}
