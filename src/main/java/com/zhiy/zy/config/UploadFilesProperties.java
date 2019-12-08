package com.zhiy.zy.config;

import com.zhiy.zy.domain.dto.UploadFiles;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
@ConfigurationProperties(prefix = "file")
public class UploadFilesProperties {
    /* 上传文件 路径字段*/
    private UploadFiles uploadFiles = new UploadFiles();

    public UploadFiles getUploadFiles() {
        return uploadFiles;
    }

    public void setUploadFiles(UploadFiles uploadFiles) {
        this.uploadFiles = uploadFiles;
    }
}
