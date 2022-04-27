package org.kelvintam.instagramclone.data

import org.kelvintam.instagramclone.R

sealed class TopNavigationItem(var route: String, var icon: Int, var title: String) {
    object Stories : TopNavigationItem("stories", R.drawable.ic_baseline_photo_camera_24, "Stories")
    object DirectMessage :
        TopNavigationItem("directMessage", R.drawable.ic_baseline_send_24, "Direct Message")
}

sealed class BotNavigationItem(var route: String, var icon: Int, var title: String) {
    object Feed : BotNavigationItem("feed", R.drawable.ic_baseline_home_24, "Feed")
    object Search : BotNavigationItem("search", R.drawable.ic_baseline_search_24, "Search")
    object Create : BotNavigationItem("create", R.drawable.ic_baseline_add_box_24, "Create")
    object Notifications :
        BotNavigationItem("notifications", R.drawable.ic_baseline_notifications_24, "Notifications")

    object Profile : BotNavigationItem("profile", R.drawable.ic_baseline_person_24, "Profile")
}
