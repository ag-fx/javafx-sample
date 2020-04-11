package com.github.bschramke.jfxsample

import com.github.bschramke.jfxsample.views.MainView
import javafx.application.Application.launch
import tornadofx.*

class SampleApp : App(MainView::class) {
    init {
        reloadStylesheetsOnFocus()
        reloadViewsOnFocus()
    }
}

fun main(args: Array<String>) {
    launch(SampleApp::class.java, *args)
}
