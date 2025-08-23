package com.example.wotd.vector

import androidx.compose.ui.graphics.vector.ImageVector
import com.example.wotd.vector.myiconpack.IcApp
import com.example.wotd.vector.myiconpack.IcEmail
import com.example.wotd.vector.myiconpack.IcGlobe
import com.example.wotd.vector.myiconpack.IcInfo
import com.example.wotd.vector.myiconpack.IcPerson
import com.example.wotd.vector.myiconpack.IcRefresh
import com.example.wotd.vector.myiconpack.IcSound
import com.example.wotd.vector.myiconpack.OrnamentForBg
import kotlin.collections.List as ____KtList

public object MyIconPack

private var __AllIcons: ____KtList<ImageVector>? = null

public val MyIconPack.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(IcApp, IcEmail, IcGlobe, IcInfo, IcPerson, IcRefresh, IcSound, OrnamentForBg)
    return __AllIcons!!
  }
