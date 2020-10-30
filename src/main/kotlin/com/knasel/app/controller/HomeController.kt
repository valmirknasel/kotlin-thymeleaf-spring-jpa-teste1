package com.knasel.app.controller

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.ModelAndView

@RestController
@RequestMapping("/")
class HomeController {
    val logger:Logger = LoggerFactory.getLogger(javaClass)

    fun home():String {
      logger.info("at home!")
        return "index"
    }
}