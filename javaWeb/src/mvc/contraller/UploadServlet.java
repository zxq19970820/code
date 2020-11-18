package mvc.contraller;

import mvc.biz.impl.productBizImpl;
import mvc.biz.productBiz;
import mvc.pojo.Product;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

import java.util.List;
import java.util.UUID;

@WebServlet(name = "UploadServlet", urlPatterns = "/UploadServlet")
public class UploadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Product p = new Product();

        //创建工厂对象
        DiskFileItemFactory factory = new DiskFileItemFactory();

        //创建解析请求
        ServletFileUpload upload = new ServletFileUpload(factory);

        //解析 请求request
        try {
            List<FileItem> items = upload.parseRequest(request);

            //遍历处理
            for (FileItem item : items) {

                //表单元素名字
                String name = item.getFieldName();

                //判断是否是（普通表单元素）文件元素
                if (item.isFormField()) {

                    //根据字段名，做相应处理
                    if ("pname".equals(name)) {
                        String value = item.getString("UTF-8");//这是获取普通字段值
                        p.setPname(value);
//                        System.out.println("商品名称是：" + value);
                    }
                    //根据文件名,做相应处理
                    else if ("details".equals(name)) {
                        String value = item.getString("UTF-8");
                        p.setDetails(value);
                        //System.out.println("商品描述是：" + value);
                    } else if ("price".equals(name)) {
                        String value = item.getString("UTF-8");
                        p.setPrice(Double.parseDouble(value));
                    } else if ("count".equals(name)) {
                        String value = item.getString("UTF-8");
                        p.setCount(Integer.parseInt(value));
                    }

                } else {
//这是获取字段集，值
//                   String fileName= item.getString("UTF-8");

                    //获取文件名
                    String fileName = item.getName();

                    //设置文件上传路径

                    //设置文件夹----------上下文（存贮了项目里所有信息）  在项目根目录下设置upload文件夹
                    String path = request.getServletContext().getRealPath("/upload/");

                    File dir = new File(path);

                    //如果目录不存在，先创建
                    if (!dir.exists()) {
                        dir.mkdirs();
                    }

                    //避免图片名字重复的方式
                    /* 1.随机数
                     * 2.时间戳  获取当前时间的毫秒数
                     * 3.UUID 建议使用，号称永不重复
                     */

                    String str = UUID.randomUUID().toString();
                    str = String.join("", str.split("-"));
                    String newName = str + fileName.substring(fileName.lastIndexOf("."));


                    //创建目标文件对象   上传的文件将写到目标文件
                    File file = new File(dir, newName);

                    //将上传的文件写到服务器上指定的文件夹中
                    try {
                        item.write(file);
                        System.out.println("上传图片成功");
                        p.setImage(path + newName);
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("上传图片失败");
                    }

                }
            }


        } catch (FileUploadException e) {
            e.printStackTrace();
        }


        //判断图片是否上传成功
        if (p.getImage() != null) {

            //调用biz
            productBiz biz = new productBizImpl();
            if (biz.add(p)) {
                System.out.println("添加商品成功");

            } else {
                System.out.println("添加商品失败");
            }


        } else {
            System.out.println("添加失败");
        }
//跳转
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
