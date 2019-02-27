package com.dichotome.collapsingbar.util.view.extensions

import android.animation.ValueAnimator
import android.view.ViewPropertyAnimator
import com.dichotome.profilebar.util.view.profileBar.AnimationHelper
import com.dichotome.profilebar.util.view.profileBar.LinearAnimationHelper
import com.dichotome.profilebar.util.view.profileBar.PlainAnimationHelper


fun ViewPropertyAnimator.addTo(collection: MutableCollection<ViewPropertyAnimator>) = apply {
    collection.add(this)
}

fun <V : ValueAnimator> V.addTo(collection: MutableCollection<in V>) = apply {
    collection.add(this)
}

fun <H : AnimationHelper> H.addTo(collection: MutableCollection<in H>) = apply {
    collection.add(this)
}

fun Collection<AnimationHelper>.evaluateAll() = forEach {
    when (it) {
        is LinearAnimationHelper -> it.evaluate()
        is PlainAnimationHelper -> it.evaluateXY()
    }
}

fun Collection<AnimationHelper?>.cancelAll() = forEach {
    it?.cancel()
}