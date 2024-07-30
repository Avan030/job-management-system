package com.indusnet.jms.service.impl;

import com.indusnet.jms.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indusnet.jms.common.ResponseModel;
import com.indusnet.jms.model.JobModel.JobModel;
import com.indusnet.jms.model.JobModel.UserModel;
import com.indusnet.jms.repository.UserRepository;

import jakarta.validation.Valid;
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;

    

    @Override
    public UserModel updateUser(String id, UserModel user) {
        UserModel existingUser = userRepository.findById(id).orElse(null);
        if (existingUser != null) {
            existingUser.setName(user.getName());
            existingUser.setEmail(user.getEmail());
            existingUser.setSkills(user.getSkills());
            existingUser.setResume(user.getResume());
            existingUser.setCoverLetter(user.getCoverLetter());
            return userRepository.save(existingUser);
        }
        return null;
    }

    @Override
    public ResponseModel createJob(@Valid JobModel model) {
        
        throw new UnsupportedOperationException("Unimplemented method 'createJob'");
    }

    @Override
    public ResponseModel saveUser(ResponseModel responseModel) {
        return userRepository.save(saveUser(responseModel));
        
    }

}