package com.pocbeagle.bff.builder

import br.com.zup.beagle.annotation.BeaglePreview
import br.com.zup.beagle.core.Style
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.layout.SafeArea
import br.com.zup.beagle.widget.layout.Screen
import br.com.zup.beagle.widget.layout.ScreenBuilder
import com.pocbeagle.bff.components.ScreenComponentIntro
import com.pocbeagle.bff.components.ScreenComponentPage


class ScreenBuilderPage : ScreenBuilder {

    @BeaglePreview
    override fun build() = Screen(

            child = Container(
                    children = listOf(
                            ScreenComponentPage().getPageComponent()
                    )))
}