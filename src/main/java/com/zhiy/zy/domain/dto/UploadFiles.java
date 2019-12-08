package com.zhiy.zy.domain.dto;

/**
 * 文件上传类
 */
public class UploadFiles {
    /* 静态资源路径 */
    private String staticImgPath;
    private String staticBgmPath;
    private String staticVideoPath;
    /* 上传至本地路径 */
    private String uploadImgPath;
    private String uploadBgmPath;
    private String uploadVideoPath;

    public String getStaticImgPath() {
        return staticImgPath;
    }

    public void setStaticImgPath(String staticImgPath) {
        this.staticImgPath = staticImgPath;
    }

    public String getStaticBgmPath() {
        return staticBgmPath;
    }

    public void setStaticBgmPath(String staticBgmPath) {
        this.staticBgmPath = staticBgmPath;
    }

    public String getStaticVideoPath() {
        return staticVideoPath;
    }

    public void setStaticVideoPath(String staticVideoPath) {
        this.staticVideoPath = staticVideoPath;
    }

    public String getUploadImgPath() {
        return uploadImgPath;
    }

    public void setUploadImgPath(String uploadImgPath) {
        this.uploadImgPath = uploadImgPath;
    }

    public String getUploadBgmPath() {
        return uploadBgmPath;
    }

    public void setUploadBgmPath(String uploadBgmPath) {
        this.uploadBgmPath = uploadBgmPath;
    }

    public String getUploadVideoPath() {
        return uploadVideoPath;
    }

    public void setUploadVideoPath(String uploadVideoPath) {
        this.uploadVideoPath = uploadVideoPath;
    }
}
