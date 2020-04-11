package com.github.bschramke.jfxsample.views

import tornadofx.*

class MainView : View("Main View") {
    override val root = borderpane {
        setPrefSize(800.0, 600.0)
        center {
            label("Hello world")
        }
    }
}
