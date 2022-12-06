@file:JvmName("Lwjgl3Launcher")

package com.github.bijumon.mysticsnatch.lwjgl3

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration
import com.github.bijumon.mysticsnatch.MysticSnatch

/** Launches the desktop (LWJGL3) application. */
fun main() {
    Lwjgl3Application(MysticSnatch(), Lwjgl3ApplicationConfiguration().apply {
        setTitle("MysticSnatch")
        setWindowedMode(640, 480)
        setWindowIcon(*(arrayOf(128, 64, 32, 16).map { "libgdx$it.png" }.toTypedArray()))
    })
}
