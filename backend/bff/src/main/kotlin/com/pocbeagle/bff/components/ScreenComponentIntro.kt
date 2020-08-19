package com.pocbeagle.bff.components

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
                        textLogin(),
                        inputEmailText(placeholder = "Type data", styleId = "inputEmailText"),
                        textPassword(),
                        inputPasswordText(placeholder = "Type number",styleId = "inputNumberText"),
                        createButton()
                )
        ).applyStyle(Style
        (
                backgroundColor = "#C6C6C6",
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
                text = "Login",
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

    fun textLogin(
    ) = Text ("E-mail:")
            .applyStyle(Style(
                    margin = EdgeValue(
                            left = UnitValue(16.0, UnitType.REAL),
                            top = UnitValue(16.0, UnitType.REAL),
                            right = UnitValue(16.0, UnitType.REAL))))

    fun inputEmailText(
            placeholder: String,
            styleId: String
    ) = TextInput(
            placeholder = placeholder,
            styleId = styleId)
            .applyStyle(Style(
                    margin = EdgeValue(
                            left = UnitValue(16.0, UnitType.REAL),
                            top = UnitValue(5.0, UnitType.REAL),
                            right = UnitValue(16.0, UnitType.REAL))))
    fun textPassword(
    ) = Text("Senha:")
            .applyStyle(Style(
                    margin = EdgeValue(
                            left = UnitValue(16.0, UnitType.REAL),
                            top = UnitValue(16.0, UnitType.REAL),
                            right = UnitValue(16.0, UnitType.REAL))))
    fun inputPasswordText(
            placeholder: String,
            styleId: String
    ) = TextInput(
            placeholder = "Type your password",
            type = TextInputType.NUMBER)
            .applyStyle(Style(
                    margin = EdgeValue(
                            left = UnitValue(16.0, UnitType.REAL),
                            top = UnitValue(5.0, UnitType.REAL),
                            right = UnitValue(16.0, UnitType.REAL))))
}
