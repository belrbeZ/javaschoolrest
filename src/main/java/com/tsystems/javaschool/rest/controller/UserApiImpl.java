package com.tsystems.javaschool.rest.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tsystems.javaschool.rest.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;

@Controller
public class UserApiImpl implements UserApi {
    @Override
    public Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    @Override
    public Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    @Override
    public Optional<String> getAcceptHeader() {
        return Optional.empty();
    }

    @Override
    public ResponseEntity<Void> createUser(User body) {
        return null;
    }

    @Override
    public ResponseEntity<Void> createUsersWithArrayInput(List<User> body) {
        User user = new User();
        return null;
    }

    @Override
    public ResponseEntity<Void> createUsersWithListInput(List<User> body) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteUser(String username) {
        return null;
    }

    @Override
    public ResponseEntity<User> getUserByName(String username) {
        return null;
    }

    @Override
    public ResponseEntity<String> loginUser(String username, String password) {
        return null;
    }

    @Override
    public ResponseEntity<Void> logoutUser() {
        return null;
    }

    @Override
    public ResponseEntity<Void> updateUser(String username, User body) {
        return null;
    }
}
