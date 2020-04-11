package com.github.bschramke.jfxsample

import com.github.bschramke.jfxsample.theme.DarkTheme
import com.github.bschramke.jfxsample.views.MainView
import javafx.application.Application.launch
import tornadofx.*

class SampleApp : App(MainView::class, DarkTheme::class) {
    init {
        reloadStylesheetsOnFocus()
        reloadViewsOnFocus()
        dumpStylesheets()
    }
}

fun main(args: Array<String>) {
    launch(SampleApp::class.java, *args)
}
