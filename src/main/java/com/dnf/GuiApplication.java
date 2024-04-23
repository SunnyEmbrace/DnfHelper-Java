package com.dnf;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//@SpringBootApplication
//@Slf4j
public class GuiApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(GuiApplication.class);
        // 禁止打印banner
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
    }

    public void run(String... args) {
        // 设置 DISPLAY 环境变量
        System.setProperty("java.awt.headless", "false");

        EventQueue.invokeLater(() -> {
            Frame frame = new Frame("贪吃蛇");

            //设置布局
            frame.setLayout(null);
            //坐标
            frame.setBounds(0, 0, 300, 400);
            frame.setBackground(new Color(0x00281F));

            //创建面板
            Panel panel = new Panel();
            //panel设置坐标，相对于frame
            panel.setBounds(50, 30, 200, 300);
            panel.setBackground(new Color(0x480050));

            Button button = new Button();
            button.setLabel("click");

            //构造一个ActionListener，去满足addActionListener()监听事件的需求
            MyActionListener listener = new MyActionListener();
            button.addActionListener(listener);

            panel.add(button);

            //窗口添加画板
            frame.add(panel);
            frame.setVisible(true);

            //监听关闭窗口事件
            frame.addWindowListener(new WindowAdapter() {
                //关闭窗口
                @Override
                public void windowClosing(WindowEvent e) {
                    System.out.println("windowClosing");
                    System.exit(0);
                }
            });
        });
    }
}

class MyActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("aaa");
    }
}