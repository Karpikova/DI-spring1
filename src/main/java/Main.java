import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

/*
 * ${Classname}
 * 
 * Version 1.0 
 * 
 * 25.04.2017
 * 
 * Karpikova
 */
public class Main {
    private static DownLoader downLoader;
    private static UpLoader upLoader;
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

       // downLoader = new FttpDownLoader();
        downLoader = (DownLoader) context.getBean("downLoader");
        //upLoader = new FtpUpLoader();
        upLoader = (UpLoader) context.getBean("upLoader");
        String content = downLoader.downLoad("");
        upLoader.upLoad(content);
    }
}
