package com.github.bschramke.jfxsample.view

import de.jensd.fx.glyphs.materialicons.MaterialIcon
import de.jensd.fx.glyphs.materialicons.MaterialIconView
import tornadofx.*

class ToolbarView : View("Top View") {
    override val root = hbox {
        toolbar {
            button(text = "tada", graphic = MaterialIconView(MaterialIcon.ACCOUNT_BOX, "2em"))
        }
    }
}