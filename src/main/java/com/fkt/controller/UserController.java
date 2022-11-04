package com.fkt.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@Slf4j
@RestController
public class UserController{

    @Autowired
    private MessageSource messageSource;

    @GetMapping("/{userId}")
    public ResponseEntity<?> getOneUser(@PathVariable("userId") Long userId){
        String msg = messageSource.getMessage(
                    "user.controller.not.found.by.id",
                    new String[]{userId.toString()},
                    LocaleContextHolder.getLocale());
            log.info(msg);
        return new ResponseEntity<>(msg,HttpStatus.OK);
    }
}