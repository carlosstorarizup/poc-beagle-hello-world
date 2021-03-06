package com.pocbeagle.bff.components

import br.com.zup.beagle.core.CornerRadius
import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.applyStyle
import br.com.zup.beagle.widget.action.Alert
import br.com.zup.beagle.widget.action.Navigate
import br.com.zup.beagle.widget.action.Route
import br.com.zup.beagle.widget.core.*
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.ui.Button
import br.com.zup.beagle.widget.ui.Text
import br.com.zup.beagle.widget.ui.TextInput

class ScreenComponentIntro {

    fun getIntroComponent(
    ): Container {
        return Container(
                children = listOf(
                        textSample(),
                        textInputSample(),
                        textPassword(),
                        inputPasswordText(),
                        createButton()
                )
        ).applyStyle(Style
        (
                backgroundColor = "#C6C6C6",
                cornerRadius = CornerRadius(25.0),
                margin = EdgeValue(
                        top = UnitValue(30.0, UnitType.PERCENT),
                        left = UnitValue(60.0, UnitType.REAL),
                        right = UnitValue(60.0, UnitType.REAL)),
                flex = Flex(justifyContent = JustifyContent.CENTER, grow = 1.0)
        )
        )
    }

    fun createButton(): Button {
        return Button(
            text = "Navigation",
                onPress = listOf(
                 Navigate.PushView(
                 Route.Remote("http://localhost:8080/page")))

                ).applyStyle(Style(
                margin = EdgeValue(
                        left = UnitValue(16.0, UnitType.REAL),
                        top = UnitValue(16.0, UnitType.REAL),
                        right = UnitValue(16.0, UnitType.REAL),
                        bottom = UnitValue(16.0, UnitType.REAL))))

    }

    fun textSample() = Text ("Text Sample:")
            .applyStyle(Style(
                    margin = EdgeValue(
                            left = UnitValue(16.0, UnitType.REAL),
                            top = UnitValue(16.0, UnitType.REAL),
                            right = UnitValue(16.0, UnitType.REAL))))

    fun textInputSample() = TextInput(
            placeholder = "Text Input Sample")
            .applyStyle(Style(
                    margin = EdgeValue(
                            left = UnitValue(16.0, UnitType.REAL),
                            top = UnitValue(5.0, UnitType.REAL),
                            right = UnitValue(16.0, UnitType.REAL))))

    fun textPassword() = Text("Number Sample:")
            .applyStyle(Style(
                    margin = EdgeValue(
                            left = UnitValue(16.0, UnitType.REAL),
                            top = UnitValue(16.0, UnitType.REAL),
                            right = UnitValue(16.0, UnitType.REAL))))


    fun inputPasswordText(
    ) = TextInput(
            placeholder = "Number Input Sample",
            type = TextInputType.NUMBER)
            .applyStyle(Style(
                    margin = EdgeValue(
                            left = UnitValue(16.0, UnitType.REAL),
                            top = UnitValue(5.0, UnitType.REAL),
                            right = UnitValue(16.0, UnitType.REAL))))


}
