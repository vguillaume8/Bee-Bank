package com.beebank.Bee.Bank.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

import javax.servlet.http.HttpServletRequest
import java.sql.Timestamp

/**
 * Global exception handler.
 */
@ControllerAdvice
class ExceptionController {

    @ExceptionHandler(Exception.class)
    def handle(HttpServletRequest req, Exception ex) {

        def body = [
                message: ex.message,
                cause: ex.cause,
                timestamp: new Timestamp(System.currentTimeMillis()),
        ]

        return new ResponseEntity<?>(body, HttpStatus.INTERNAL_SERVER_ERROR)
    }
}
