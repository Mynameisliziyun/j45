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
			//����һ�����������ڿͻ��������ʾ����
			JspWriter out=pageContext.getOut();
			SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
			//�������
			out.write(sf.format(new Date()));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return super.doStartTag();
	}

	
}
