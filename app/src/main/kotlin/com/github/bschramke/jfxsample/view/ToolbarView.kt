package com.github.bschramke.jfxsample.view

import com.github.bschramke.jfxsample.theme.BaseTheme
import de.jensd.fx.glyphs.materialicons.MaterialIcon
import de.jensd.fx.glyphs.materialicons.MaterialIconView
import tornadofx.*

class ToolbarView : View("Top View") {
    override val root = hbox {
        addClass(BaseTheme.header)
        toolbar {
            button("tada", MaterialIconView(MaterialIcon.ACCOUNT_BOX, "2em"))
        }
    }
}