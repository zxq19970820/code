package com.zxq.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import java.io.File;
import java.io.IOException;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/14 19:16
 * 4
 */
@Controller
@RequestMapping("/file")
public class FileUpload implements ServletContextAware {


    private ServletContext servletContext;

    @GetMapping("/upload")
    public String toFileUpload() {
        System.out.println("跳转上传界面");
        return "fileUpload";
    }


    @PostMapping("/upload")
    public String doUpload(String name, @RequestParam("file") MultipartFile file, Model model) {
        //name：图片的名称
        //判断file是否为null
        if (!file.isEmpty()) {
            //不为空才执行上传
            try {
                //获取文件的字节数组
                byte[] bytes = file.getBytes();
                //创建file，文件上传之后的位置和名称
                File f = new File(servletContext.getRealPath("/upload/") + name);
//                File f = new File("C:\\Users\\admin\\Desktop\\新建文件夹\\ " + name);
                //写入
                FileUtils.writeByteArrayToFile(f, bytes);
                //上传成功
                model.addAttribute("msg", name + "上传成功!");

                System.out.println("上传成功");

            } catch (IOException e) {
                e.printStackTrace();
                //上传失败
                model.addAttribute("msg", name + "上传失败！");

                System.out.println("上传失败");

            }
        }
        //回到上传的页面
        return "fileUpload";
    }

    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
    }
}