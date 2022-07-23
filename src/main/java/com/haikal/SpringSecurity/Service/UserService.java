package com.haikal.SpringSecurity.Service;

import java.util.List;


import com.haikal.SpringSecurity.Domain.Role;
import com.haikal.SpringSecurity.Domain.User;


public interface UserService {

    User saveUser(User user);

    Role saveRole(Role role);

    void addRoletoUser(String username, String rolename);

    User getUser(String username);

    List<User> getListUser();
}
