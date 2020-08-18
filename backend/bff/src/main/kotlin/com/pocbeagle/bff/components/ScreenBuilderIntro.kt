package com.pocbeagle.bff.components

import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.applyStyle
import br.com.zup.beagle.widget.core.*
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.ui.Text
import br.com.zup.beagle.widget.ui.TextInput

class ScreenComponentIntro {

    fun getIntroComponent(
    ): Container {
        return Container(
                children = listOf(
                        textLogin(placeholder = "E-mail",styleId = "textLogin"),
                        inputEmailText(placeholder = "Type your Email here ...", styleId = "inputEmailText"),
                        textPassword(placeholder = "Password",styleId = "textPassword"),
                        inputPasswordText(placeholder = "Type password here...",styleId = "inputPasswordText")
                )
        ).applyStyle(Style
        (
                backgroundColor = "#C6C6C6",
                margin = EdgeValue(
                        left = UnitValue(60.0, UnitType.REAL),
                        right = UnitValue(60.0, UnitType.REAL)),
                flex = Flex(justifyContent = JustifyContent.CENTER, grow = 1.0)
        )
        )
    }

    fun textLogin(
            placeholder: String,
            styleId: String
    ) = Text ("E-mail:")
            .applyStyle(Style(
                    margin = EdgeValue(
                            left = UnitValue(16.0, UnitType.REAL),
                            top = UnitValue(16.0, UnitType.REAL),
                            right = UnitValue(16.0, UnitType.REAL),
                            bottom = UnitValue(4.0, UnitType.REAL))))

    fun inputEmailText(
            placeholder: String,
            styleId: String
    ) = TextInput(
            placeholder = placeholder,
            styleId = styleId)
            .applyStyle(Style(
                    margin = EdgeValue(
                            left = UnitValue(16.0, UnitType.REAL),
                            right = UnitValue(16.0, UnitType.REAL),
                            bottom = UnitValue(8.0, UnitType.REAL))))

    fun textPassword(
            placeholder: String,
            styleId: String

    ) = Text("Senha:")
            .applyStyle(Style(
                    margin = EdgeValue(
                            left = UnitValue(16.0, UnitType.REAL),
                            right = UnitValue(16.0, UnitType.REAL),
                            bottom = UnitValue(4.0, UnitType.REAL))))


    fun inputPasswordText(
            placeholder: String,
            styleId: String
    ) = TextInput(
            placeholder = "Senha",
            type = TextInputType.PASSWORD)
            .applyStyle(Style(
                    margin = EdgeValue(
                            left = UnitValue(16.0, UnitType.REAL),
                            right = UnitValue(16.0, UnitType.REAL))))


}
