package com.github.bschramke.jfxsample.theme

import javafx.scene.paint.Color
import tornadofx.*

open class BaseTheme(colors: ThemeColors) : Stylesheet() {

    companion object {
        val glyphIcon by cssclass("glyph-icon")
        val header by cssclass()
        val sidebar by cssclass()
    }

    init {
        root {
            backgroundColor += colors.windowBackground
            fill = colors.text
            textFill = colors.text

            s("*") {
                fill = colors.text
                textFill = colors.text
            }
        }
        toolBar {
            backgroundColor += colors.background

            button {
                backgroundColor += colors.background

                and(hover) {
                    backgroundColor += colors.primary
                }
            }
        }
        header {
            backgroundColor += colors.background
        }
        sidebar {
            backgroundColor += colors.background
            button {
                backgroundColor += colors.background

                and(hover) {
                    backgroundColor += colors.primary
                }
            }
        }

        glyphIcon {
            fill = colors.text
            textFill = colors.text
        }
    }

    interface ThemeColors {
        val windowBackground: Color
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