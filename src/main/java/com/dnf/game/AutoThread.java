package com.dnf.game;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public class AutoThread {
    private final Logger logger = LoggerFactory.getLogger(AutoThread.class.getName());

    private volatile boolean autoSwitch;

    /**
     * 自动开关
     */

    public void autoSwitch() {
        if (!autoSwitch) {
            Thread thread = new Thread(this::autoThread);
            thread.start();
            autoSwitch = true;
            logger.info("自动刷图 - [ 开启 ]");
        } else {
            autoSwitch = false;
            logger.info("自动刷图 - [ 结束 ]");
        }
    }


    private void autoThread() {
        while (autoSwitch) {
            try {
                Thread.sleep(200);
                logger.info("自动刷图线程：{}", Instant.now());
            } catch (Exception e) {
                logger.error("自动刷图线程异常：{}", e.getMessage());
            }
        }
    }

    /**
     * 进入城镇
     */
    private void enterTown() {

    }

    /**
     * 城镇处理
     */
    private void townHandle() {

    }

    /**
     * 选择地图
     */
    private void selectMap() {

    }

    /**
     * 进入地图
     */
    private void enterMap() {

    }

    /**
     * 过图处理
     */
    private void passMap(){

    }

    /**
     * 通过boss
     */
    private void passBoss(){

    }

    /**
     * 退出地图
     */
    private void quitMap() {

    }
}
