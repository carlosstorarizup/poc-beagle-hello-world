package com.pocbeagle.bff.components

import br.com.zup.beagle.core.CornerRadius
import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.applyFlex
import br.com.zup.beagle.ext.applyStyle
import br.com.zup.beagle.widget.action.Alert
import br.com.zup.beagle.widget.action.Navigate
import br.com.zup.beagle.widget.action.Route
import br.com.zup.beagle.widget.core.*
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.ui.Button
import br.com.zup.beagle.widget.ui.Text
class ScreenComponentPage {

    fun getPageComponent(
    ): Container {
        return Container(
                children = listOf(
                        text(),
                        createButton()
                )
        ).applyStyle(Style
        (
                margin = EdgeValue(
                        top = UnitValue(40.0, UnitType.PERCENT))
        ))
    }

    fun text(
    ) = Text("Bem vindo")
            .applyStyle(Style
    (
            flex = Flex(flexDirection = FlexDirection.COLUMN),
            margin = EdgeValue(
                     left = UnitValue(40.0, UnitType.PERCENT))
    ))

    fun createButton(): Button {
        return Button(
          "Alert ",
                onPress = listOf(
                  Alert(
                  "Botão server-driven",
                          "Hello World",
                           labelOk = "TOP"
        )))
    }
}