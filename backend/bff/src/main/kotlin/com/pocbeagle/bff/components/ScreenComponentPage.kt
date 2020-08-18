package com.pocbeagle.bff.components

import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.applyFlex
import br.com.zup.beagle.ext.applyStyle
import br.com.zup.beagle.widget.core.*
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.ui.Text
class ScreenComponentPage {

    fun getPageComponent(
    ): Container {
        return Container(
                children = listOf(
                        textLogin(placeholder = "Uma pagina", styleId = "pagina")
                )
        )
    }

    fun textLogin(
            placeholder: String,
            styleId: String
    ) = Text("Bem vindo")
            .applyStyle(Style(
                    margin = EdgeValue(
                            left = UnitValue(16.0, UnitType.REAL),
                            top = UnitValue(16.0, UnitType.REAL),
                            right = UnitValue(16.0, UnitType.REAL)
                    )))
}