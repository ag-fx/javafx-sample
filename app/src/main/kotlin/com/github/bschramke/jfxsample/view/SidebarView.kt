package com.github.bschramke.jfxsample.view

import com.github.bschramke.jfxsample.theme.BaseTheme
import de.jensd.fx.glyphs.materialicons.MaterialIcon
import de.jensd.fx.glyphs.materialicons.MaterialIconView
import javafx.scene.Parent
import tornadofx.*

class SidebarView : View() {
    override val root = vbox {
        addClass(BaseTheme.sidebar)
        button("Test", MaterialIconView(MaterialIcon.DASHBOARD, "2em"))
    }
}