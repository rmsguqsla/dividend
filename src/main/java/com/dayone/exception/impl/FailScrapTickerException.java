package com.dayone.exception.impl;

import com.dayone.exception.AbstractException;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
public class FailScrapTickerException extends AbstractException {

    private String ticker;

    @Override
    public int getStatusCode() {
        return HttpStatus.BAD_REQUEST.value();
    }

    @Override
    public String getMessage() {
        return "failed to scrap ticker -> " + ticker;
    }
}
