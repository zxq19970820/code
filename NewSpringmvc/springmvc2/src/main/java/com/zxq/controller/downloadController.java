package com.zxq.controller;

import com.zxq.domain.DownloadRecord;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.sql.Timestamp;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/22 16:16
 * 4
 */
@Controller
public class downloadController {

    @RequestMapping("/testHttpMessageDown1")
    public ResponseEntity<byte[]> download( @RequestBody(required = true) HttpServletRequest request) throws IOException {

        File file = new File("C:\\Users\\admin\\Desktop\\新建文本文档.txt");
        byte[] body = null;
        InputStream is = new FileInputStream(file);
        int count=0;
        if (count==0){
            count=is.available();
        }
        body = new byte[count];
        is.read(body);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "attchement;filename=" + file.getName());
        HttpStatus statusCode = HttpStatus.OK;
        ResponseEntity<byte[]> entity = new ResponseEntity<byte[]>(body, headers, statusCode);
        return entity;
    }


    @RequestMapping("/testHttpMessageDown2")
    public static void download(String fileName, String filePath,
                                HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        //声明本次下载状态的记录对象
        DownloadRecord downloadRecord = new DownloadRecord(fileName, filePath, request);
        //设置响应头和客户端保存文件名
        response.setCharacterEncoding("utf-8");
        response.setContentType("multipart/form-data");
        response.setHeader("Content-Disposition", "attachment;fileName=" + fileName);
        //用于记录以完成的下载的数据量，单位是byte
        long downloadedLength = 0l;
        try {
            //打开本地文件流
            InputStream inputStream = new FileInputStream(filePath);
            //激活下载操作
            OutputStream os = response.getOutputStream();

            //循环写入输出流
            byte[] b = new byte[2048];
            int length;
            while ((length = inputStream.read(b)) > 0) {
                os.write(b, 0, length);
                downloadedLength += b.length;
            }

            // 这里主要关闭。
            os.close();
            inputStream.close();
        } catch (Exception e) {
            downloadRecord.setStatus(DownloadRecord.STATUS_ERROR);
            throw e;
        }
        downloadRecord.setStatus(DownloadRecord.STATUS_SUCCESS);
        downloadRecord.setEndTime(new Timestamp(System.currentTimeMillis()));
        downloadRecord.setLength(downloadedLength);
        //存储记录
    }


//        @RequestMapping(value = "/DownLoad/{fileName}/{fileType}", method = RequestMethod.GET)
//        public ResponseEntity<byte[]> download(HttpServletRequest request, @PathVariable String fileName,
//                                               @PathVariable String fileType) throws IOException {
////            File file = new File("D:\\Apks\\" + fileName + "." + fileType);
//            File file = new File("C:\\Users\\admin\\Desktop" + fileName + "." + fileType);
//            byte[] body = null;
//            InputStream is = new FileInputStream(file);
//            body = new byte[is.available()];
//            is.read(body);
//            HttpHeaders headers = new HttpHeaders();
//            headers.add("Content-Disposition", "attchement;filename=" + file.getName());
//            HttpStatus statusCode = HttpStatus.OK;
//            ResponseEntity<byte[]> entity = new ResponseEntity<>(body, headers, statusCode);
//            return entity;
//
//    }
}
