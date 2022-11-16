package com.dongyang.step4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 * 
 */
@WebServlet("/calcStep4")
public class CalculatorStep4 extends HttpServlet {
  
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Cookie[] cookies = request.getCookies();
		String exp ="0";
		if(cookies != null){			
			for(Cookie c : cookies){
				if(c.getName().equals("exp")){
					exp = c.getValue();
					break;
					}				
			}	
		}
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out=response.getWriter();
		out.write("<!DOCTYPE html>");
		out.write("<html>");
		out.write("<head>");
		out.write("<meta charset=\"utf-8\">");
		out.write("<title>계산기-step4</title>");
		out.write("<style>");
		out.write("input { width:50px; height:50px}");
		out.write(".output {height:50px; background-color:#e9e9e9; text-align:right; padding:0px 5px; font-size:24px;font-weight:bold;}");
		out.write("</style>");
		out.write("</head>");
		out.write("<body>");
		out.write("<form action=\"calcAction\" method=\"post\">");
		out.write("	<table>");
		out.write("		<tr>");
		out.printf("			<td colspan=\"4\" class=\"output\"> %s </td>", exp);
		out.write("		</tr>");
		out.write("		<tr>");
		out.write("			<td><input type=\"submit\" name=\"operator\" value=\"CE\"></td>");
		out.write("			<td><input type=\"submit\" name=\"operator\" value=\"C\"></td>");
		out.write("			<td><input type=\"submit\" name=\"operator\" value=\"BS\"></td>");
		out.write("			<td><input type=\"submit\" name=\"operator\" value=\"/\"></td>");
		out.write("		</tr>");
		out.write("		<tr>");
		out.write("			<td><input type=\"submit\" name=\"value\" value=\"7\"></td>");
		out.write("			<td><input type=\"submit\" name=\"value\" value=\"8\"></td>");
		out.write("			<td><input type=\"submit\" name=\"value\" value=\"9\"></td>");
		out.write("			<td><input type=\"submit\" name=\"operator\" value=\"*\"></td>");
		out.write("		</tr>");
		out.write("		<tr>");
		out.write("			<td><input type=\"submit\" name=\"value\" value=\"4\"></td>");
		out.write("			<td><input type=\"submit\" name=\"value\" value=\"5\"></td>");
		out.write("			<td><input type=\"submit\" name=\"value\" value=\"6\"></td>");
		out.write("			<td><input type=\"submit\" name=\"operator\" value=\"-\"></td>");
		out.write("		</tr>");
		out.write("		<tr>");
		out.write("			<td><input type=\"submit\" name=\"value\" value=\"1\"></td>");
		out.write("			<td><input type=\"submit\" name=\"value\" value=\"2\"></td>");
		out.write("			<td><input type=\"submit\" name=\"value\" value=\"3\"></td>");
		out.write("			<td><input type=\"submit\" name=\"operator\" value=\"+\"></td>");
		out.write("		</tr>");
		out.write("		<tr>");
		out.write("			<td><input type=\"submit\" name=\"operator\" value=\" \"></td>");
		out.write("			<td><input type=\"submit\" name=\"value\" value=\"0\"></td>");
		out.write("			<td><input type=\"submit\" name=\"dot\" value=\".\"></td>");
		out.write("			<td><input type=\"submit\" name=\"operator\" value=\"=\"></td>");
		out.write("		</tr>		");		
		out.write("	</table>");
		out.write("</form>");
		out.write("</body>");
		out.write("</html>	");	
		
		
		
		
		
	}



}
