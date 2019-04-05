package com.cdtlab.coffeeapi.controllers;

import javax.servlet.http.HttpServletRequest;

import com.cdtlab.coffeeapi.dto.UserDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 */
@RestController
@RequestMapping(value="/api/users")
public class UserController {

    // @Autowired
    // private UserService service;

    @RequestMapping(value="/", method=RequestMethod.POST)
    public ResponseEntity<?> createUser(@RequestBody UserDTO user, HttpServletRequest request) {
        return null;
    }

    @RequestMapping(value="/{id}", method=RequestMethod.PUT)
    public ResponseEntity<?> updateUser(@PathVariable String id, @RequestBody UserDTO user, HttpServletRequest request) {
        return null;
    }

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public ResponseEntity<?> deleteUser(@PathVariable String id, HttpServletRequest request) {
        return null;
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public ResponseEntity<?> getUser(@PathVariable String id, HttpServletRequest request) {
        return null;
    }

    @RequestMapping(value="/", method=RequestMethod.GET)
    public ResponseEntity<?> allUsers(HttpServletRequest request) {
        return null;
    }

    
}