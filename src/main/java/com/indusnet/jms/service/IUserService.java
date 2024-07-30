package com.indusnet.jms.service;


import org.springframework.stereotype.Service;

import com.indusnet.jms.common.ResponseModel;
import com.indusnet.jms.model.JobModel.JobModel;
import com.indusnet.jms.model.JobModel.UserModel;

import jakarta.validation.Valid;
@Service
public interface IUserService{

    ResponseModel createJob(@Valid JobModel model);

    ResponseModel saveUser(ResponseModel responseModel);
    UserModel updateUser(String id, UserModel user);
}