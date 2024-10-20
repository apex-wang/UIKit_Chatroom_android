package com.hyphenate.chatroom.service.model

import com.hyphenate.chatroom.service.ChatUserInfo
import com.hyphenate.chatroom.service.UserEntity

fun UserInfoProtocol.transfer() = ChatUserInfo().run {

    this.userId = this@transfer.userId
    this.nickname = this@transfer.nickname
    this.avatarUrl = this@transfer.avatarURL
    this.gender = this@transfer.gender
    this.ext = this@transfer.identify
    this
}

fun UserInfoProtocol.toUser() = UserEntity(userId, nickname, avatarURL, gender, identify)
data class UserInfoProtocol(
    val userId: String,
    val nickname: String? = "",
    val avatarURL: String? = "",
    val gender: Int = 0,
    var identify:String? = ""
)