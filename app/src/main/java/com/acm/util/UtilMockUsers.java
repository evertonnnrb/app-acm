package com.acm.util;

import com.acm.model.User;

import java.util.ArrayList;
import java.util.List;

public class UtilMockUsers {
    public static List<User> getUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("admin@admin", "adm"));
        users.add(new User("bob@gmail.com", "xxx"));
        return users;
    }

}
