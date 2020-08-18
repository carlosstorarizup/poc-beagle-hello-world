package com.pocbeagle.bff.builder

import br.com.zup.beagle.core.Style
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.layout.SafeArea
import br.com.zup.beagle.widget.layout.Screen
import com.pocbeagle.bff.components.ScreenComponentIntro

fun createScreenIntro() = Screen(
        style = Style(
                backgroundColor = "#C6C6C6"),
        safeArea = SafeArea(
                top = true,
                leading = true,
                bottom = true,
                trailing = true
        ),
        child = Container(
                children = listOf(
                        ScreenComponentIntro().getIntroComponent()

                       )))



