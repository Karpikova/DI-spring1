/*
 * ${Classname}
 * 
 * Version 1.0 
 * 
 * 25.04.2017
 * 
 * Karpikova
 */
public class FtpUpLoader implements UpLoader {
    public boolean upLoad(String content) {
        System.out.println( content + " uploaded");
        return true;
    }
}
