package com.dichotome.profilebar.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment

abstract class TabFragment : Fragment() {
    companion object {
        const val ARGS_TITLE = "title"
    }
    var title: String?
        get() = arguments?.getString(TabFragment.ARGS_TITLE)
        set(title) {
            val args = arguments ?: Bundle()
            arguments = args.apply {
                putString(TabFragment.ARGS_TITLE, title)
            }
        }
}