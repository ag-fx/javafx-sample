package com.github.bschramke.jfxsample.views

import com.github.bschramke.jfxsample.theme.DarkTheme
import de.jensd.fx.glyphs.materialicons.MaterialIcon
import de.jensd.fx.glyphs.materialicons.MaterialIconView
import javafx.scene.Node
import tornadofx.*

class MainView : View("Main View") {
    override val root = borderpane {
        setPrefSize(800.0, 600.0)
        top {
            toolbar {
                button(text = "tada", graphic = MaterialIconView(MaterialIcon.ACCOUNT_BOX, "2em"))
            }
        }
        center {
            label("Hello world")
        }
    }
}
