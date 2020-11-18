package com.zxq.controller;

import com.zxq.pojo.Student;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.List;
import java.util.UUID;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/14 18:54
 * 4
 */
@Controller
@RequestMapping("/student")
public class StudentController {


    @RequestMapping("/saveUser")
    public String saveUser(Student student) {
        System.out.println("后端接收到前端传的信息为" + student);
        return "loginSuccess";
    }


    @RequestMapping("/testServlet")
    public String testServlet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("testServlet获取servlet原生api....");
        System.out.println(request);
        System.out.println(response);

        HttpSession session = request.getSession();
        System.out.println(session);

        ServletContext servletContext = session.getServletContext();
        System.out.println(servletContext);

        return "loginSuccess";
    }

    /**
     * 文件上传
     *
     * @throws Exception
     */
    @RequestMapping(value = "/fileupload")
    public String fileupload(HttpServletRequest request) throws Exception {
        System.out.println(request);
// 先获取到要上传的文件目录
        String path = request.getSession().getServletContext().getRealPath("/uploads");
// 创建File对象，一会向该路径下上传文件
        File file = new File(path);
// 判断路径是否存在，如果不存在，创建该路径
        if (!file.exists()) {
            file.mkdirs();
        }
// 创建磁盘文件项工厂
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload fileUpload = new ServletFileUpload(factory);
// 解析request对象
        List<FileItem> list = fileUpload.parseRequest(request);
// 遍历
        for (FileItem fileItem : list) {
// 判断文件项是普通字段，还是上传的文件
            if (fileItem.isFormField()) {
            } else {
// 上传文件项
// 获取到上传文件的名称
                String filename = fileItem.getName();
// 上传文件
                fileItem.write(new File(file, filename));
// 删除临时文件
                fileItem.delete();
            }
        }
        return "loginSuccess";
    }


    /**
     * SpringMVC方式的文件上传
     *
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/fileupload2")
    public String fileupload2(HttpServletRequest request, MultipartFile upload) throws
            Exception {

        System.out.println("SpringMVC方式的文件上传...");
// 先获取到要上传的文件目录
        String path = request.getSession().getServletContext().getRealPath("/uploads/");
// 创建File对象，一会向该路径下上传文件
//        File file = new File("C:\\Users\\admin\\Desktop\\新建文件夹");
        File file = new File(path);
// 判断路径是否存在，如果不存在，创建该路径
        if (!file.exists()) {
            file.mkdirs();
        }
// 获取到上传文件的名称
        String filename = upload.getOriginalFilename();
        String uuid = UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
// 把文件的名称唯一化
        filename = uuid + "_" + filename;
// 上传文件
        upload.transferTo(new File(path, filename));
        return "loginSuccess";
    }


    /**
     * SpringMVC跨服务器方式的文件上传
     *
     * @param
     * @return
     * @throws Exception
     */
//    @RequestMapping(value = "/fileupload3")
//    public String fileupload3(MultipartFile upload) throws Exception {
//        System.out.println("SpringMVC跨服务器方式的文件上传...");
//// 定义图片服务器的请求路径
//        String path = "http://localhost:9090/springmvc2_war/uploads/";
//// 获取到上传文件的名称
//        String filename = upload.getOriginalFilename();
//        String uuid = UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
//// 把文件的名称唯一化
//        filename = uuid + "_" + filename;
//// 向图片服务器上传文件
//// 创建客户端对象
//        Client client = Client.create();
//// 连接图片服务器
//        WebResource webResource = client.resource(path + filename);
//// 上传文件
//        webResource.put(upload.getBytes());
//        return "loginSuccess";
//    }
}
