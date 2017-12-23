package org.java.tag;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTagSupport;

public class FirstTag extends BodyTagSupport {

	@Override
	public int doStartTag() throws JspException {
		
		try {
			//产生一个流，用于在客户端输出显示内容
			JspWriter out=pageContext.getOut();
			SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
			//输出内容
			out.write(sf.format(new Date()));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return super.doStartTag();
	}

	
}
