package com.pocbeagle.bff.controller


import com.pocbeagle.bff.service.ScreenBeagleService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ScreenController(
        private val screenBeagleService: ScreenBeagleService
) {
    @GetMapping("/intro")
    fun getIntroScreen() = screenBeagleService.createScreenIntroBeagle()

    @GetMapping("/page")
    fun getPageScreen() = screenBeagleService.createScreenPageBeagle()


}