package com.calf.daily.action;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/image.shtml")
public class ImageAction {
	
	@RequestMapping(name="m=singleImage",method=RequestMethod.POST)
	public void imgUpload(@RequestParam(value="upload",required=false)MultipartFile upload,HttpServletRequest req,HttpServletResponse res) throws IOException{
		String imgType="";
		String orifilename=upload.getOriginalFilename();
		imgType=orifilename.substring(orifilename.lastIndexOf(".")+1,orifilename.length());
		imgType=imgType.toLowerCase();
		upload.getContentType();
		res.setCharacterEncoding("utf-8");
		PrintWriter pw = res.getWriter();
		String callback=req.getParameter("CKEditorFuncNum");
		String expandedName = ""; // 文件扩展名
		if (imgType.equals("jpg")) {
			expandedName = ".jpg";
		} else if (imgType.equals("png")) {
			expandedName = ".png";
		} else if (imgType.equals("gif")) {
			expandedName = ".gif";
		} else if (imgType.equals("bmp")) {
			expandedName = ".bmp";
		} else {
			pw.println("<script type=\"text/javascript\">");
			pw.println("window.parent.CKEDITOR.tools.callFunction(" + callback
					+ ",''," + "'文件格式不正确（必须为.jpg/.gif/.bmp/.png文件）');");
			pw.println("</script>");
		}
		if (upload.getSize() > 2000 * 1024) {
			pw.println("<script type=\"text/javascript\">");
			pw.println("window.parent.CKEDITOR.tools.callFunction(" + callback
					+ ",''," + "'文件大小不得大于600k');");
			pw.println("</script>");
		}
		String uploadPath=req.getSession().getServletContext().getRealPath("resource/imgs");
		System.out.println(uploadPath);
		String fileName = java.util.UUID.randomUUID().toString(); // 采用时间+UUID的方式随即命名
		fileName += expandedName;
		System.out.println(fileName);
		File file= new File(uploadPath,fileName);
		upload.transferTo(file);
		pw.println("<script type=\"text/javascript\">");
		pw.println("window.parent.CKEDITOR.tools.callFunction(" + callback
				+ ",'" + req.getContextPath() + "/resource/imgs/" + fileName + "','')");
		pw.println("</script>");
	}
}
