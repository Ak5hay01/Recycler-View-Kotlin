package com.akshayteli.recyclerviewdemo

import com.akshayteli.recyclerviewdemo.models.AndroidVersions

/**
 * Created by Akshay Teli on 22,March,2021
 */
class DataSource{

    companion object{

        fun createDataSet(): ArrayList<AndroidVersions>{
            val list = ArrayList<AndroidVersions>()
            list.add(
                AndroidVersions(
                    "Android Jelly Bean",
                    "Android Jelly Bean is the codename given to the tenth version of the Android mobile operating system developed by Google, spanning three major point releases (versions 4.1 through 4.3.1). Among the devices that run Android 4.3 are the Asus Nexus 7 (2013) and the LG Nexus 4.",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7a/Android_Jelly_Bean_Logo.svg/512px-Android_Jelly_Bean_Logo.svg.png"
                )
            )
            list.add(
                AndroidVersions(
                    "Android KitKat",
                    "Android KitKat is the codename for the eleventh Android mobile operating system, representing release version 4.4. Unveiled on September 3, 2013, KitKat focused primarily on optimizing the operating system for improved performance on entry-level devices with limited resources.",
                    "https://www.androidcentral.com/sites/androidcentral.com/files/topic_images/2016/android-kitkat-topic.png"
                )
            )
            list.add(
                AndroidVersions(
                    "Android Lolipop",
                    "Android Lollipop (codenamed Android L during development) is the fifth major version of the Android mobile operating system developed by Google and the 12th version of Android, spanning versions between 5.0 and 5.1.1",
                    "https://1yy04i3k9fyt3vqjsf2mv610yvm-wpengine.netdna-ssl.com/wp-content/uploads/2015/01/Android-5.0-Lollipop-Bugdroid.png"
                )
            )
            list.add(
                AndroidVersions(
                    "Android Marshmallow",
                    "Android Marshmallow (codenamed Android M during development) is the sixth major version of the Android operating system and the 13th version of Android. First released as a beta build on May 28, 2015, it was officially released on October 5, 2015, with the Nexus devices being the first to receive the update.",
                    "https://www.gizbot.com/img/2016/03/top-10-upcoming-android-marshmallow-smartphones-coming-soon-india-news-01-1456840829.jpg"
                )
            )

            list.add(
                AndroidVersions(
                    "Android Nougat",
                    "Android Nougat (codenamed Android N during development) is the seventh major version and 14th original version of the Android operating system. First released as an alpha test version on March 9, 2016, it was officially released on August 22, 2016, with Nexus devices being the first to receive the update. The LG V20 was the first smartphone released with Nougat.",
                    "https://www.absfly.com/wp-content/uploads/2017/04/12.jpg"
                )
            )
            list.add(
                AndroidVersions(
                    "Android Oreo",
                    "Android Oreo (codenamed Android O during development) is the eighth major release and the 15th version of the Android mobile operating system. It was first released as an alpha quality developer preview in March 2017 and released to the public on August 21, 2017.",
                    "https://cdn.pocket-lint.com/r/s/970x/assets/images/140500-phones-feature-lead-image1-yntzxzfgsb-jpg.webp?v1"
                )
            )
            list.add(
                AndroidVersions(
                    "Android Pie",
                    "Android Pie (codenamed Android P during development) is the ninth major release and the 16th version of the Android mobile operating system. It was first released as a developer preview on March 7, 2018, and was released publicly on August 6, 2018.",
                    "https://cdn.mos.cms.futurecdn.net/PWdgwo4kE7fNZZbM3Z9jp-970-80.jpg.webp"
                )
            )
            list.add(
                AndroidVersions(
                    "Android 10",
                    "Android 10 (codenamed Android Q during development) is the tenth major release and the 17th version of the Android mobile operating system. It was first released as a developer preview on March 13, 2019, and was released publicly on September 3, 2019.",
                    "https://bl.thgim.com/incoming/rnrz2q/article29330139.ece/alternates/PORTRAIT_355/Outlook-Image-4png"
                )
            )
            list.add(
                AndroidVersions(
                    "Android 11",
                    "Android 11 is the eleventh major release and 18th version of Android, the mobile operating system developed by the Open Handset Alliance led by Google.[3] It was released on September 8, 2020[4][5] and is the latest Android version to date.",
                    "https://images.idgesg.net/images/article/2020/02/android-11-100832680-large.jpg"
                )
            )

            return list
        }
    }
}