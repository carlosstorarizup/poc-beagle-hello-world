package com.pocbeagle.bff.builder

import br.com.zup.beagle.annotation.BeaglePreview
import br.com.zup.beagle.core.Style
import br.com.zup.beagle.widget.layout.*
import com.pocbeagle.bff.components.ScreenComponentIntro

class ScreenBuilderIntro : ScreenBuilder {

    @BeaglePreview
    override fun build() = Screen(
            style = Style(
                    backgroundColor = "#363636"),
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
}