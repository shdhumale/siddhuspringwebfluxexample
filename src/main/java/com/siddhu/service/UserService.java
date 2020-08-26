package com.siddhu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siddhu.dao.UserRepository;
import com.siddhu.model.User;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
 
@Service
public class UserService implements IUserService {
     
    @Autowired
    UserRepository userRepo;
 
    public void create(User e) {
    	userRepo.save(e).subscribe();
    }
 
    public Mono<User> findById(Integer id) {
        return userRepo.findById(id);
    }
 
    public Flux<User> findByName(String name) {
        return userRepo.findByName(name);
    }
 
    public Flux<User> findAll() {
        return userRepo.findAll();
    }
 
    public Mono<User> update(User e) {
        return userRepo.save(e);
    }
 
    public Mono<Void> delete(Integer id) {
        return userRepo.deleteById(id);
    }
 
}