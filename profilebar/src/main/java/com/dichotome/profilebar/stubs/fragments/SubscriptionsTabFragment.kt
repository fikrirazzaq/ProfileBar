package com.dichotome.profilebar.stubs.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.dichotome.profilebar.R
import com.dichotome.profilebar.stubs.TabListItem
import com.dichotome.profilebar.stubs.TabListAdapter
import com.dichotome.profilebar.ui.tabPager.TabFragment
import kotlinx.android.synthetic.main.fragment_profile_tab.*

class SubscriptionsTabFragment : TabFragment() {
    companion object {
        fun newInstance(tabTitle: String) = SubscriptionsTabFragment().apply {
            title = tabTitle
        }
    }
    val subList = arrayListOf(
        TabListItem(
            "2019 The Amazing Spider-Man #2",
            "https://banner2.kisspng.com/20180405/hde/kisspng-superman-logo-batman-spider-man-computer-icons-superheroes-5ac5ebd3bcd9d8.2131948915229204037735.jpg"
        ),
        TabListItem(
            "2018 Star Wars #55",
            "https://cdn3.iconfinder.com/data/icons/superheroes-line/256/avengers-superhero-sign-logo-512.png"
        ),
        TabListItem(
            "Esteemed comic book author #1",
            "https://banner2.kisspng.com/20180405/hde/kisspng-superman-logo-batman-spider-man-computer-icons-superheroes-5ac5ebd3bcd9d8.2131948915229204037735.jpg"
        ),
        TabListItem(
            "Superior comic book writer",
            "https://cdn3.iconfinder.com/data/icons/superheroes-line/256/avengers-superhero-sign-logo-512.png"
        ),
        TabListItem(
            "2019 Batman: Rebirth #26",
            "https://banner2.kisspng.com/20180405/hde/kisspng-superman-logo-batman-spider-man-computer-icons-superheroes-5ac5ebd3bcd9d8.2131948915229204037735.jpg"
        ),
        TabListItem(
            "Superior comic book writer",
            "https://cdn3.iconfinder.com/data/icons/superheroes-line/256/avengers-superhero-sign-logo-512.png"
        ),
        TabListItem(
            "Esteemed comic book author #1",
            "https://banner2.kisspng.com/20180405/hde/kisspng-superman-logo-batman-spider-man-computer-icons-superheroes-5ac5ebd3bcd9d8.2131948915229204037735.jpg"
        ),
        TabListItem(
            "Superior comic book writer",
            "https://cdn3.iconfinder.com/data/icons/superheroes-line/256/avengers-superhero-sign-logo-512.png"
        ),
        TabListItem(
            "Esteemed comic book author #1",
            "https://banner2.kisspng.com/20180405/hde/kisspng-superman-logo-batman-spider-man-computer-icons-superheroes-5ac5ebd3bcd9d8.2131948915229204037735.jpg"
        ),
        TabListItem(
            "Superior comic book writer",
            "https://cdn3.iconfinder.com/data/icons/superheroes-line/256/avengers-superhero-sign-logo-512.png"
        ),
        TabListItem(
            "Esteemed comic book author #1",
            "https://banner2.kisspng.com/20180405/hde/kisspng-superman-logo-batman-spider-man-computer-icons-superheroes-5ac5ebd3bcd9d8.2131948915229204037735.jpg"
        ),
        TabListItem(
            "Superior comic book writer",
            "https://cdn3.iconfinder.com/data/icons/superheroes-line/256/avengers-superhero-sign-logo-512.png"
        ),
        TabListItem(
            "Esteemed comic book author #1",
            "https://banner2.kisspng.com/20180405/hde/kisspng-superman-logo-batman-spider-man-computer-icons-superheroes-5ac5ebd3bcd9d8.2131948915229204037735.jpg"
        ),
        TabListItem(
            "Superior comic book writer",
            "https://cdn3.iconfinder.com/data/icons/superheroes-line/256/avengers-superhero-sign-logo-512.png"
        ),
        TabListItem(
            "Esteemed comic book author #1",
            "https://banner2.kisspng.com/20180405/hde/kisspng-superman-logo-batman-spider-man-computer-icons-superheroes-5ac5ebd3bcd9d8.2131948915229204037735.jpg"
        ),
        TabListItem(
            "Superior comic book writer",
            "https://cdn3.iconfinder.com/data/icons/superheroes-line/256/avengers-superhero-sign-logo-512.png"
        ),
        TabListItem(
            "Esteemed comic book author #1",
            "https://banner2.kisspng.com/20180405/hde/kisspng-superman-logo-batman-spider-man-computer-icons-superheroes-5ac5ebd3bcd9d8.2131948915229204037735.jpg"
        ),
        TabListItem(
            "Superior comic book writer",
            "https://cdn3.iconfinder.com/data/icons/superheroes-line/256/avengers-superhero-sign-logo-512.png"
        ),
        TabListItem(
            "Esteemed comic book author #1",
            "https://banner2.kisspng.com/20180405/hde/kisspng-superman-logo-batman-spider-man-computer-icons-superheroes-5ac5ebd3bcd9d8.2131948915229204037735.jpg"
        ),
        TabListItem(
            "Superior comic book writer",
            "https://cdn3.iconfinder.com/data/icons/superheroes-line/256/avengers-superhero-sign-logo-512.png"
        ),
        TabListItem(
            "Esteemed comic book author #1",
            "https://banner2.kisspng.com/20180405/hde/kisspng-superman-logo-batman-spider-man-computer-icons-superheroes-5ac5ebd3bcd9d8.2131948915229204037735.jpg"
        ),
        TabListItem(
            "Superior comic book writer",
            "https://cdn3.iconfinder.com/data/icons/superheroes-line/256/avengers-superhero-sign-logo-512.png"
        ),
        TabListItem(
            "Esteemed comic book author #1",
            "https://banner2.kisspng.com/20180405/hde/kisspng-superman-logo-batman-spider-man-computer-icons-superheroes-5ac5ebd3bcd9d8.2131948915229204037735.jpg"
        ),
        TabListItem(
            "Superior comic book writer",
            "https://cdn3.iconfinder.com/data/icons/superheroes-line/256/avengers-superhero-sign-logo-512.png"
        )
    )

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?) =
        inflater.inflate(R.layout.fragment_profile_tab, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = tabRecyclerView

        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter =
            TabListAdapter(
                subList,
                R.layout.item_tab_subscriptions,
                true
            )
    }
}