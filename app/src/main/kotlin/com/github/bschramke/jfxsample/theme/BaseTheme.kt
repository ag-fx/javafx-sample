package com.github.bschramke.jfxsample.theme

import javafx.scene.paint.Color
import tornadofx.*

open class BaseTheme(colors: ThemeColors) : Stylesheet() {

    companion object {
        val glyphIcon by cssclass("glyph-icon")
    }

    init {
        root {
            backgroundColor += colors.background
            fill = colors.text
            textFill = colors.text

            s("*") {
                backgroundColor += colors.background
                fill = colors.text
                textFill = colors.text
            }
        }

        glyphIcon {
            fill = colors.text
            textFill = colors.text
        }
    }

    interface ThemeColors {
        val background: Color
        val text: Color
        val primary: Color
        val secondary: Color
        val success: Color
        val danger: Color
        val warning: Color
        val info: Color
        val light: Color
        val dark: Color
    }
}