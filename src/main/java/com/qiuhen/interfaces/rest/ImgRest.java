package com.qiuhen.interfaces.rest;

import com.qiuhen.interfaces.pojo.APIResponse;
import com.qiuhen.interfaces.pojo.ImgU;
import com.qiuhen.interfaces.service.ImgSer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;

/**
 * @ProjectName: interfaces
 * @Package: com.qiuhen.interfaces.rest
 * @ClassName: FileRest
 * @Author: qiuhen
 * @Description: 文件处理控制器
 * @Date: 2020/5/8 10:22
 * @Version: 1.0
 */

@Controller
@RequestMapping("/img")
public class ImgRest {

    private static final Logger logger = LoggerFactory.getLogger(ImgRest.class);


    @Autowired
    private ImgSer imgSer;

    @GetMapping("/get")
    @ResponseBody
    public APIResponse get(ImgU imgU){
        logger.info("/getImgs");

        return imgSer.get(imgU);
    }

    @PostMapping("/add")
    @ResponseBody
    public APIResponse add(@RequestParam("file") MultipartFile file){
        logger.info("/addImg");

        return imgSer.add(file);
    }

    @DeleteMapping("/del/{id}")
    @ResponseBody
    public APIResponse del(@PathVariable String id){
        logger.info("/delimg");

        return imgSer.del(id);
    }

    @PostMapping("/edit")
    @ResponseBody
    public APIResponse edit(ImgU imgU){
        logger.info("/editImg");

        return imgSer.edit(imgU);
    }

    @GetMapping("/download")
    @ResponseBody
    public APIResponse download(HttpServletRequest re, HttpServletResponse res) throws IOException {
        logger.info("/download");
        APIResponse apiResponse = new APIResponse();
        String fileName = "20200425194848.png";
        if(fileName != null){
//            文件路径
            File file  = new File("C:\\Users\\qiuhen\\Desktop\\Vue.txt");
            if(file.exists()){
                res.setContentType("application/force-download");
                res.addHeader("Content-Dispostion","attachment;fileName="+fileName);
                byte[] buffer = new byte[1024];
                FileInputStream fis = null;
                BufferedInputStream bis = null;
                try{
                    fis = new FileInputStream(file);
                    bis = new BufferedInputStream(fis);
                    OutputStream os = res.getOutputStream();
                    int i = bis.read(buffer);
                    while(i != -1){
                        os.write(buffer,0,i);
                        i = bis.read(buffer);
                    }

                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    bis.close();
                    fis.close();
                    apiResponse.setMsg("downloa success");
                    return null;
                }

            }
        }
        apiResponse.setMsg("download failure");
        return null;


    }

    @PostMapping("/batch")
    public APIResponse handleFileUpload(HttpServletRequest request) {
        List<MultipartFile> files =
                ((MultipartHttpServletRequest) request).getFiles("file");

        return imgSer.handleFileUpload(files);
    }






}
