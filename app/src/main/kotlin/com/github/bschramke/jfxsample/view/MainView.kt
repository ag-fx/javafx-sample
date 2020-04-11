package com.github.bschramke.jfxsample.views

import com.github.bschramke.jfxsample.theme.DarkTheme
import tornadofx.*

class MainView : View("Main View") {
    override val root = borderpane {
        setPrefSize(800.0, 600.0)
        top {
            toolbar {
                label("Hello Toolbar")
            }
        }
        center {
            label("Hello world")
        }
    }
}
