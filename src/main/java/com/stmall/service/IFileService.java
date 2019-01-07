package com.stmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by liweqnaun on 2019/1/6.
 */
public interface IFileService {
    String upload(MultipartFile file, String path);

}
