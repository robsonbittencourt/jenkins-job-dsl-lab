package jobs

import javaposse.jobdsl.dsl.DslFactory
import javaposse.jobdsl.dsl.Job

import com.jenkins.job.dsl.lab.job.JobHelper

Job job_dsl_lab_build = JobHelper.createJob(this as DslFactory, "jenkins-job-dsl-lab build")
JobHelper.addGitRepo(job_dsl_lab_build, "https://github.com/robsonbittencourt/jenkins-job-dsl-lab", "master")
JobHelper.addGradleStep(job_dsl_lab_build, "clean test")