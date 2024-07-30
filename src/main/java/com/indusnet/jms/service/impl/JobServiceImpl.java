package com.indusnet.jms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties.Job;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.indusnet.jms.common.ResponseModel;
import com.indusnet.jms.model.JobModel.JobModel;
import com.indusnet.jms.repository.JobRepository;
import com.indusnet.jms.service.IJobService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j


    
    public class JobServiceImpl implements IJobService{

        @Autowired
        Gson gson = new Gson();

        @Autowired JobRepository jobRepository;

        @Override
        public ResponseModel createJob(JobModel model) {
           
           

            ResponseModel responseObj = null;
    
            JobModel saveModel = JobModel.builder()
                    .title(model.getTitle())
                    .description(model.getDescription())
                    .company(model.getCompany())
                    .location(model.getLocation())
                    
                    .build();
    
                jobRepository.save(saveModel);
    
            log.info(gson.toJson(saveModel));
    
            responseObj = ResponseModel.builder()
                    .messageEn("Job Added Successfully")
                    .messageFr("Job Added Successfully")
                    .messageTypeId(1)
                    .statusCode(HttpStatus.OK)
                    .build();
    
            return responseObj;



    }

    

    @Override
    public List<JobModel> getAllJobs() {
        return jobRepository.findAll();
    }

    @Override
    public JobModel getJobById(String id) {
        return jobRepository.findById(id).orElse(null);
    }



    @Override
    public Job createJob(Job job) {
        
        throw new UnsupportedOperationException("Unimplemented method 'createJob'");
    }



    @Override
    public Job getJobById(Integer id) {
       
        throw new UnsupportedOperationException("Unimplemented method 'getJobById'");
    }



    

    
}