package com.qiuhen.interfaces.service;

import com.qiuhen.interfaces.mapper.ImgUMapper;
import com.qiuhen.interfaces.pojo.APIResponse;
import com.qiuhen.interfaces.pojo.ImgU;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @ProjectName: interfaces
 * @Package: com.qiuhen.interfaces.service
 * @ClassName: ImgSer
 * @Author: qiuhen
 * @Description: img服务层
 * @Date: 2020/5/8 10:30
 * @Version: 1.0
 */
@Service
public class ImgSer {

    private static final Logger log = LoggerFactory.getLogger(ImgSer.class);

    private static  final  String FILE_PATH = "/home/img";

    @Autowired
    private ImgUMapper imgMapper;

    public APIResponse get(ImgU img) {
        List<ImgU> list = imgMapper.select(img);
        APIResponse res = new APIResponse();
        res.setCode("200");
        res.setData(list);
        return res;
    }

    public APIResponse add(MultipartFile file) {
        APIResponse res = new APIResponse();
        ImgU imgU = new ImgU();
        try {
            if(file.isEmpty()){
            res.setMsg("file is empty");
            return res;
        }
        String fileName = file.getOriginalFilename();
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        log.info("上传的文件名为："+fileName+"  h后缀名为："+suffixName);
        String path = FILE_PATH+fileName;
        File dest = new File(path);
        if(!dest.getParentFile().exists()){
            dest.getParentFile().mkdirs();
        }
            file.transferTo(dest);
            imgU.setId(UUID.randomUUID().toString());
            imgU.setName(fileName);
            imgU.setImgUrl(path);
            imgU.setTime(new Date());
            imgU.setAuthor("qiuhen");
            int i = imgMapper.insert(imgU);
            res.setCode("0");
            res.setData(imgU);
            return res;
        } catch (IOException e) {
            e.printStackTrace();
        }
        res.setMsg("file upload failure");
        return res;

    }

    public APIResponse del(String id) {
        APIResponse res = new APIResponse();
        int i = imgMapper.deleteByPrimaryKey(id);
        res.setCode("200");
        res.setData(i);
        return res;
    }

    public APIResponse edit(ImgU img) {
        APIResponse res = new APIResponse();
        int imgU = imgMapper.updateByPrimaryKey(img);
        res.setCode("200");
        res.setData(imgU);
        return res;
    }

    public APIResponse handleFileUpload(List<MultipartFile> files) {
        APIResponse apiResponse = new APIResponse();
        MultipartFile file = null;
        BufferedOutputStream stream = null;
        for (int i = 0; i < files.size(); ++i) {
            file = files.get(i);
            if (!file.isEmpty()) {
                try {
                    byte[] bytes = file.getBytes();
                    stream = new BufferedOutputStream(new FileOutputStream(
                            new File(FILE_PATH + file.getOriginalFilename())));
                    stream.write(bytes);// 写入
                    stream.close();
                } catch (Exception e) {
                    stream = null;
                    apiResponse.setMsg("the \" + i + \" file upload failure");
                    return apiResponse;
                }
            } else {
                apiResponse.setMsg("the \" + i + \" file is empty");
                return apiResponse;
            }
        }
        apiResponse.setMsg("upload success");
        return apiResponse;
    }
}
