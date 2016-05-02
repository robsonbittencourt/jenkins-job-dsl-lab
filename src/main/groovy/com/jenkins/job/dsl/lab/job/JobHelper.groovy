package com.jenkins.job.dsl.lab.job

import javaposse.jobdsl.dsl.DslFactory
import javaposse.jobdsl.dsl.Job

class JobHelper {

	public static Job createJob(DslFactory dslFactory, String name) {
		def Job job = dslFactory.job(name)
		job
	}
}
