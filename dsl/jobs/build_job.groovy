package jobs

import javaposse.jobdsl.dsl.DslFactory
import javaposse.jobdsl.dsl.Job

import com.jenkins.job.dsl.lab.job.JobHelper

Job jenkins_job_dsl_lab_build =  JobHelper.createJob(this as DslFactory, "jenkins-job-dsl-lab build")