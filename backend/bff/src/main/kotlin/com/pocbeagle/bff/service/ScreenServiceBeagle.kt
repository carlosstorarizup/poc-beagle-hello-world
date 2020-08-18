package com.pocbeagle.bff.service


import com.pocbeagle.bff.components.ScreenBuilderIntro
import org.springframework.stereotype.Service

@Service
class ScreenBeagleService {
    fun createScreenBeagle() = ScreenBuilderIntro()
}