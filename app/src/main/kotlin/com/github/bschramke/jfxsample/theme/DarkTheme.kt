package com.github.bschramke.jfxsample.theme

import javafx.scene.paint.Color
import tornadofx.*

class DarkTheme : BaseTheme(Colors) {

    object Colors:ThemeColors {
        override val background: Color
            get() = c("#0A0B18")
        override val text: Color
            get() = c("#E1E1E1")
        override val primary: Color
            get() = c("#4638C2")
        override val secondary: Color
            get() = c("#4c4f54")
        override val success: Color
            get() = c("#45A164")
        override val danger: Color
            get() = c("#D16767")
        override val warning: Color
            get() = c("#E1A82D")
        override val info: Color
            get() = c("#4799EB")
        override val light: Color
            get() = c("#20202A")
        override val dark: Color
            get() = c("#181924")
    }
}