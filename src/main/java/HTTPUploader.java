/*
 * ${Classname}
 * 
 * Version 1.0 
 * 
 * 25.04.2017
 * 
 * Karpikova
 */
public class HTTPUploader implements UpLoader {
    public boolean upLoad(String content) {
        System.out.println(content + "downloaded");
        return true;
    }
}
