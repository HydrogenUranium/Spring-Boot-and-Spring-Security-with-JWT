package com.haikal.SpringSecurity.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.haikal.SpringSecurity.Domain.Role;
import com.haikal.SpringSecurity.Domain.User;
import com.haikal.SpringSecurity.Repository.RoleRepository;
import com.haikal.SpringSecurity.Repository.UserRepo;

import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@Slf4j
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public User saveUser(User user) {
        log.info("Saving new user {} to database", user.getName());
        return userRepo.save(user);

    }

    @Override
    public Role saveRole(Role role) {
        log.info("Saving new role {} to database", role.getName());
        return roleRepository.save(role);
    }

    @Override
    public void addRoletoUser(String username, String rolename) {
        log.info(" Add role {} to user {} ", rolename, username);
        User user = userRepo.findByUsername(username);
        Role role = roleRepository.findByName(rolename);

        user.getRoles().add(role);

    }

    @Override
    public User getUser(String username) {
        log.info("fechting user ", username);
        return userRepo.findByUsername(username);
    }

    @Override
    public List<User> getListUser() {
        return userRepo.findAll();
    }

}
