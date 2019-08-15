package com.example.ZHAFIRUAS.click;

import com.example.ZHAFIRUAS.entity.Friends;

import java.util.ArrayList;

// 10116368 ZHAFIR MAHDI IF-8  10/8/2019

public interface LoadFriendsCallback {
    void preExecute();
    void postExecute(ArrayList<Friends> friends);
}
