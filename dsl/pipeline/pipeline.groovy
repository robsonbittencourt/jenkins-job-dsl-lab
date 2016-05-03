import javaposse.jobdsl.dsl.views.DeliveryPipelineView.Sorting

('Dummy Pipeline Example') {
	pipelineInstances(5)
	columns(1)
	sorting(Sorting.LAST_ACTIVITY)
	updateInterval(10)
	enableManualTriggers(true)
	showAvatars(true)
	showChangeLog(true)
	allowPipelineStart()
	pipelines { component('Dummy Pipeline Example', 'jenkins-job-dsl-lab build') }
}
