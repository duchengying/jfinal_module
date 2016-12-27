package com.jxtpro.controller;

import com.jfinal.core.Controller;
import com.jfinal.kit.Ret;
import com.jfinal.upload.UploadFile;

public class FileUploadController extends Controller {
	
	public void index(){
		// 百度编辑器加载出按钮图标前 会将所有控件的路径 先通过config.json
		// 文件加载出来(包括上传图片路径，视频路径等路径都是通过config.json 文件读取的)
		// 所以某些控件点击不了 是因为 config.json文件没有找到 或者是文件里面的路径有问题
		if ("config".equals(getPara("action"))) {
			// 这里千万注意 "config.json" 文件前方的目录一定要正确
			render("/ueditor1_4_3-utf8-jsp/jsp/config.json");
			return;
		}
		// "upfile" 来自 config.json 中的 imageFieldName 配置项
		UploadFile uf = getFile("upfile");
		String fileName = uf.getFileName();
		String[] typeArr = fileName.split("\\.");
		Ret ret = Ret.create("state", "SUCCESS")
		.put("url", "/j-web-ueditor/upload/" + fileName)//其中jfinal_demo 是项目名
		.put("title", fileName)
		.put("original", uf.getOriginalFileName())
		.put("type", "." + typeArr[1]) // 这里根据实际扩展名去写
		.put("size", uf.getFile().length());
		renderJson(ret.getData());
	}

}
