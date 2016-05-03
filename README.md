# jenkins-job-dsl-lab

Projeto para testar a job-dsl do Jenkins

### Como utilizar

* Instale o Jenkins ou use um previamente instalado
* Instale os seguintes plugins: Git plugin, Gradle plugin e Job DSL
* Crie um job chamado *Seed Job* com a seguinte estrutura
* Gerenciamento de código fonte → url: `git@github.com:robsonbittencourt/jenkins-job-dsl-lab.git`
* Gerenciamento de código fonte → branch: `master`
* Invoke Gradle script → Use Gradle Wrapper: `true`
* Invoke Gradle script → Tasks: `clean test`
* Process Job DSLs → DSL Scripts: `dsl/*/*.groovy`
* Process Job DSLs → Additional classpath: `src/main/groovy`
* Execute este job
 
Irá ser criado automágicamente um job para o build deste próprio projeto.

### Mais informações e material de apoio

* [Repositório oficial](https://github.com/jenkinsci/job-dsl-plugin)
* [Wiki](https://github.com/jenkinsci/job-dsl-plugin/wiki)
* [API](https://jenkinsci.github.io/job-dsl-plugin/)
* [Criando pipelines de entrega contínua multilinguagem com Docker e Jenkins](https://www.infoq.com/br/presentations/pipelines-de-entrega-continua-multilinguagem-com-docker-e-jenkins)
* [cdeasy](https://github.com/camiloribeiro/cdeasy) 
* [Using Jenkins Job DSL for Job Lifecycle Management](https://blog.codecentric.de/en/2015/10/using-jenkins-job-dsl-for-job-lifecycle-management/)
* [Job Dsl Example](https://github.com/sheehan/job-dsl-gradle-example)


