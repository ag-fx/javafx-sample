package com.github.bschramke.jfxsample.view

import tornadofx.*

class MainView : View("Main View") {
    override val root = borderpane {
        setPrefSize(800.0, 600.0)
        top<ToolbarView>()
        center {
            label("Hello world")
        }
    }
}
