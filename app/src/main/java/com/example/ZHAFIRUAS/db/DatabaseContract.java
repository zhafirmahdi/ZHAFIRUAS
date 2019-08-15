package com.example.ZHAFIRUAS.db;

import android.provider.BaseColumns;

// 10116368 ZHAFIR MAHDI IF-8  10/8/2019

public class DatabaseContract {
    static String TABLE_FRIENDS = "friends";

    static final class FriendsColumn implements BaseColumns {
        static String NIM = "nim";
        static String NAMA = "nama";
        static String KELAS = "kelas";
        static String TELEPON = "telepon";
        static String EMAIL = "email";
        static String SOSMED = "sosmed";

    }
}

