package com.example.technotestyandex.repository;

import com.example.technotestyandex.model.role.Role;
import com.example.technotestyandex.model.role.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(RoleName name);
}
