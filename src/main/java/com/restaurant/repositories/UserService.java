package com.restaurant.repositories;

import com.restaurant.entity.UsersEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService {

    @PersistenceContext
    private EntityManager entityManager;
    // Save a user
    public UsersEntity saveUser(UsersEntity user) {
        entityManager.persist(user);
        return user;
    }

    // Update a user
    public UsersEntity updateUser(UsersEntity user) {
        return entityManager.merge(user);
    }

    // Get a user by ID
    public Optional<UsersEntity> getUserById(Long id) {
        UsersEntity user = entityManager.find(UsersEntity.class, id);
        return Optional.ofNullable(user);
    }

    // Delete a user by ID
    public void deleteUserById(Long id) {
        UsersEntity user = entityManager.find(UsersEntity.class, id);
        if (user != null) {
            entityManager.remove(user);
        }
    }

    // Get all users
    public List<UsersEntity> getAllUsers() {
        return entityManager.createQuery("SELECT u FROM UsersVO u", UsersEntity.class).getResultList();
    }

    // Find a user by username
    public Optional<UsersEntity> findByUserName(String userName) {
        List<UsersEntity> result = entityManager.createQuery(
            "SELECT u FROM UsersVO u WHERE u.userName = :userName", UsersEntity.class)
            .setParameter("userName", userName)
            .getResultList();
        return result.isEmpty() ? Optional.empty() : Optional.of(result.get(0));
    }

    // Check if a username exists
    public boolean existsByUserName(String userName) {
        Long count = entityManager.createQuery(
            "SELECT COUNT(u) FROM UsersVO u WHERE u.userName = :userName", Long.class)
            .setParameter("userName", userName)
            .getSingleResult();
        return count > 0;
    }
}
