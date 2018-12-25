package com.github.zxj5470.kartlin

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.PlatformDataKeys
import com.jetbrains.lang.dart.sdk.DartSdkUtil

class Action : AnAction("Kartlin") {
    override fun actionPerformed(e: AnActionEvent) {
        val project = e.getData(PlatformDataKeys.PROJECT) ?: return
        /**
         * @return [String] "/usr/lib/dart" in Linux
         */
        val dartPath = DartSdkUtil.getFirstKnownDartSdkPath() ?: return
    }
}