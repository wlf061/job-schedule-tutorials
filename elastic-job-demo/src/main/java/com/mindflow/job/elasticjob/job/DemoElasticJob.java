package com.mindflow.job.elasticjob.job;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @date 2017-02-28 20:15
 */
public class DemoElasticJob implements SimpleJob {

    @Override
    public void execute(ShardingContext context) {
        System.out.println("execute...");
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("huahua");
    }
}
