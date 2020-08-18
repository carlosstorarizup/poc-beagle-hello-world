package com.pocbeagle.bff.service


import com.pocbeagle.bff.builder.ScreenBuilderIntro
import org.springframework.stereotype.Service

@Service
class ScreenBeagleService {
    fun createScreenIntroBeagle() = ScreenBuilderIntro()
}