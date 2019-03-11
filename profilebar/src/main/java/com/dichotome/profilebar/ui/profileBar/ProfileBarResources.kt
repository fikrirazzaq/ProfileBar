package com.dichotome.profilebar.ui.profileBar

import android.graphics.drawable.Drawable
import android.view.View
import android.widget.*
import androidx.viewpager.widget.ViewPager
import com.dichotome.profilebar.ui.ProfileOptionWindow
import com.dichotome.profilebar.ui.ProfileTabLayout
import com.dichotome.profileshared.views.SquareRoundedImageView

interface ProfileBarResources {
    var tabsEnabled: Boolean

    var tabsSelectedColor: Int
    var tabsUnselectedColor: Int
    var tabsIndicatorColor: Int

    var wallpaper: Drawable?
    var photo: Drawable?

    var fontColor: Int
    var title: String?
    var titleSize: Float
    var subtitle: String?
    var subtitleSize: Float

    var dimDrawable: Drawable?
    var bottomGlowDrawable: Drawable?

    var photoFrameColor: Int
    var photoFrameDrawable: Drawable

    fun setupWithViewPager(viewPager: ViewPager)
}