# Job-Schedule-tutorials
分布式任务调度框架教程, 包括: Quartz、Elastic-Job和TBSchedule.

## Quartz
[Using the Quartz Scheduler](https://docs.spring.io/spring/docs/current/spring-framework-reference/html/scheduling.html)

## Elastic-Job
[Elastic-Job 2.x](https://github.com/dangdangdotcom/elastic-job)

#分布式elastic-job 测试
elastic-job 同一个ip 不支持分片，需要将其打包，发布到不同的服务器上：
step1:E:\study\job-schedule-tutorials1\elastic-job-demo>mvn clean install
step2: 将target拷贝到服务器执行 java -jar XXXX.jar （依赖的jar包没有拷贝道elasric-job-demo.jar中，存放在target的lib中）
PS: 如果 sharding-total-count =1， 当前只有一个server会执行这个job，类似于quartz
