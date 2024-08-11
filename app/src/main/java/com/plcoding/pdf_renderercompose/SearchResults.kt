package com.plcoding.pdf_renderercompose

import android.graphics.RectF

data class SearchResults(
    val page: Int,
    val results: List<RectF>
)
