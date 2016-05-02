package com.jenkins.job.dsl.lab.job

import javaposse.jobdsl.dsl.DslFactory
import javaposse.jobdsl.dsl.Job

class JobHelper {

	public static Job createJob(DslFactory dslFactory, String name) {
		def Job job = dslFactory.job(name)
		job
	}

	public static Job addGitRepo(Job job, String repo, String repoBranch) {
		job.scm {
			git {
				remote {
					name('origin')
					url(repo)
				}
				branch(repoBranch)
			}
		}
		job
	}

	public static Job addGradleStep(Job job, String step) {
		job() {
			steps {
				gradle { tasks(step) }
			}
		}
		job
	}
}
