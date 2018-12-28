package com.sl.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>
 * PostConstruct 注解
 * PreDestroy 注解
 * </p>
 *
 * @author kqyang
 * @date 2018-12-27 11:31:22
 */
public class AnnotationServlet extends HttpServlet {
    /**
     * 设置日期格式,精确到毫秒
     */
    SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss.SSS");

    public AnnotationServlet() {
        System.out.println("时间：" + df.format(new Date()) + "执行构造函数...1");
    }

    @Override
    public void destroy() {
        this.log("时间：" + df.format(new Date()) + "执行destroy()方法...6");
        //super.destroy(); // Just puts "destroy" string in log
        // Put your code here
    }

    /**
     * 被@PostConstruct 注解修饰的方法会在构造函数之后，init() 方法之前运行
     */
    @PostConstruct
    public void someMethod() {
        //this.log("执行@PostConstruct修饰的someMethod()方法...");//注意：这样会出错
        System.out.println("时间：" + df.format(new Date()) + "执行@PostConstruct修饰的someMethod()方法...2");
    }

    /**
     * 被@PreDestroy 注解修饰的方法会在destroy() 方法之后运行，在servlet 被彻底卸载之前
     */
    @PreDestroy
    public void otherMethod() {
        System.out.println("时间：" + df.format(new Date()) + "执行@PreDestroy修饰的otherMethod()方法...7");
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.log("时间：" + df.format(new Date()) + "执行doGet()方法...5");
    }

    @Override
    public void init() throws ServletException {
        // Put your code here
        this.log("时间：" + df.format(new Date()) + "执行init()方法...3");
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.log("时间：" + df.format(new Date()) + "执行service()方法...4");
        super.service(request, response);
    }

}