package mianShi.xiancheng.xianChengPool;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/11/6 18:07
 * 4
 */

// DiscardOldestPolicy策略, 是在线程池没被关闭的情况下, 丢弃任务等待队列中最早的任务。
// 然后重新尝试运行该任务。
public class demo4  implements RejectedExecutionHandler {

    public void rejectedExecution(Runnable r, ThreadPoolExecutor e) {
        if (!e.isShutdown()) {
            e.getQueue().poll();
            e.execute(r);
        }
    }
}
