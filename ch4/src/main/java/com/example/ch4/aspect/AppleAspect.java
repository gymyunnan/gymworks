package com.example.ch4.aspect;

import com.example.ch4.pojo.Apple;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@Aspect
@Component
public class AppleAspect {
    @Pointcut("@annotation(com.example.ch4.annotation.TestApple)")
    public void myPointCut(){
    }

    @Before("myPointCut()")
    public void before(JoinPoint jp) {
        //被增强方法的参数数组
        Object[] args = jp.getArgs();
        //args.length 参数的长度大于0  args[0] 第一个参数为Apple类型
        if (args.length > 0 && args[0] instanceof Apple) {
            Apple apple = (Apple) args[0];
            // 将苹果信息写入文本文件
            writeAppleInfoToTextFile(apple);
            System.out.println("写入成功！！！");
        }
    }

    private void writeAppleInfoToTextFile(Apple apple) {
        try {
            File file = new File("apple_info.txt");
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter writer = new FileWriter(file, true);
            writer.write("id：" + apple.getId() +", 重量：" + apple.getWeight() + ", 价格：" + apple.getPrice() + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
