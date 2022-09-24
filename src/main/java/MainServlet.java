import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;


import java.io.IOException;


@WebServlet(name = "TestServlet", urlPatterns = "/testservlet")
public class MainServlet implements Servlet {

    private static Logger logger = LoggerFactory.getLogger(MainServlet.class);
    private transient ServletConfig servletConfig;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException { //каждый раз, когда идет обращение к сервлету


        System.out.println("asdasdsad");
        this.servletConfig = servletConfig;
    }

    @Override
    public ServletConfig getServletConfig() {
        return servletConfig;
    }

    @Override  //основной метод, занимающийся обработкой запросов
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        logger.info("new request");
        res.getWriter().println("Hello from Servlet");
        logger.info("it's worked");

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
