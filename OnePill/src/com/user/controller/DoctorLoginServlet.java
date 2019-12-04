package com.user.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class DoctorLoginServlet
 */
@WebServlet("/DoctorLoginServlet")
public class DoctorLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoctorLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("下载文件");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		File file = new File("E:/javaGit/onePill/OnePill/iu.png");
		if (!file.exists()) {
			file.createNewFile();
		}
		InputStream is = request.getInputStream();
		// 设置文件存储路径( 项目根路径 )
		FileOutputStream fos = new FileOutputStream(file);
		
		// 读取
		byte[] temp = new byte[255];
		int len;
		while((len = is.read(temp))!=-1){
			fos.write(temp,0,len);
		}
		
		// 返回响应
		response.getWriter().append("上传成功");
	}

}
