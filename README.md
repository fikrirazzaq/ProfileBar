# ProfileBar
Custom animated AppbarLayout designed as a profile screen

![zoom_resized](https://user-images.githubusercontent.com/31614124/54141780-fc161200-442e-11e9-84e6-225942c3d5b4.gif)

## Supported Android versions
* API 22 and higher
Earlier versions are to be added soon

## Supported technologies
* Databinding
* Livedata

## Features
* Collapsing toolbar
* Zoomable photo image
* Tabs pager
* Option menu
* Landscape and portrait orientations

## Setup

### Adding a dependency
1. In *build.gradle(Project)* add as follows:
```
allprojects {
    repositories {
    ...
    maven {
        url "https://jitpack.io"
    }
```
2. In *build.gradle(Module)* add the following code:

* With databinding:
```
android {
    ...
    dataBinding {
        enabled = true
    }
}
...
implementation "com.github.DichotoMe.ProfileBar:profilebarBinding:1.1"
```

* Without databinding:
```
implementation "com.github.DichotoMe.ProfileBar:profilebar:1.1"
```

### Building a layout
Place a ProfileBar and a TabPager inside a **CoordinatorLayout** as follows:
```
<androidx.coordinatorlayout.widget.CoordinatorLayout 
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:id="@+id/coordinator"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <com.dichotome.profilebar.ui.profileBar.ProfileBar
        android:id="@+id/profileBar"
        android:layout_width="match_parent"
        android:layout_height="300dp" />

    <com.dichotome.profilebar.ui.tabPager.TabPager
        android:id="@+id/profilePager"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:layout_behavior="@string/appbar_scrolling_view_behavior" />

</androidx.coordinatorlayout.widget.CoordinatorLayout>
```
**Note:** if you are using databinding, set `<layout>` as your root tag and specify the data to be bound:
```
<layout>
    <data>
        <variable ... />
    </data>
    
    ...
    <androidx.coordinatorlayout.widget.CoordinatorLayout
        android:id="@+id/coordinator"...>
    ...
</layout>
```

### Hooking up data
**Note:** all of the values listed are optional

#### Parameters featured:
*

* With databinding:

*1. In layout.xml*
```
<data>
    <variable name="logic"
    ... />
</data>
<com.dichotome.profilebar.ui.profileBar.ProfileBar
    android:id="@+id/profileBar"
    
    app:photo="@{logic.photo}"
    app:wallpaper="@{logic.wallpaper}" 
    app:subtitle="@{logic.subtitle}"
    app:title="@{logic.title}" 
    ... />
    
<com.dichotome.profilebar.ui.tabPager.TabPager 
    android:id="@+id/profilePager"
    app:fragments="@{logic.pagerFragments}" 
    ... />
```
**See a full example [here](https://github.com/DichotoMe/ProfileBar/blob/master/app/src/main/res/layout/fragment_profile_with_adapters.xml "XML binding example")**

*2. In code:*
```
profileBar.setupWithViewPager(profilePager)
```
**See a full example [here](https://github.com/DichotoMe/ProfileBar/blob/master/app/src/main/java/com/dichotome/profilebarapp/ui/mainBinding/ProfileBindingActivity.kt "Activity binding example")**


* Without databinding:

    *In code:*
```
profileBar.apply {
            photoDrawable = photo
            subtitleText = "Joined on 19 April 2017"
            titleText = "Pavlo Bondan"
            wallpaperDrawable = wallpaper
            tabsEnabled = true
        }
profilePager.fragments = pagerFragments

profileBar.setupWithViewPager(profilePager)
```
**See a full example [here](https://github.com/DichotoMe/ProfileBar/blob/master/app/src/main/java/com/dichotome/profilebarapp/ui/main/ProfileActivity.kt "Activity no binding example")**
