package com.haikal.SpringSecurity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.haikal.SpringSecurity.Domain.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long>{

    Role findByName(String name);
    
}
