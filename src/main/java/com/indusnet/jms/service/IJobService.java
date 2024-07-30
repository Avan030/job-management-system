package com.indusnet.jms.service;
import java.util.List;

import org.springframework.boot.autoconfigure.batch.BatchProperties.Job;

import com.indusnet.jms.common.ResponseModel;
import com.indusnet.jms.model.JobModel.JobModel;

import jakarta.validation.Valid;

public interface IJobService{

    ResponseModel createJob(@Valid JobModel model);

    List<JobModel> getAllJobs();
    JobModel getJobById(String id);
    Job createJob(Job job);

    Job getJobById(Integer id);
}