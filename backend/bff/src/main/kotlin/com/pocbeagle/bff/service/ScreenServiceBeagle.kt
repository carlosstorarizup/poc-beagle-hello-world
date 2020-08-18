package com.pocbeagle.bff.service


import com.pocbeagle.bff.builder.ScreenBuilderIntro
import com.pocbeagle.bff.builder.ScreenBuilderPage
import org.springframework.stereotype.Service

@Service
class ScreenBeagleService {
    fun createScreenIntroBeagle() = ScreenBuilderIntro()

    fun createScreenPageBeagle(): ScreenBuilderPage = ScreenBuilderPage()
}