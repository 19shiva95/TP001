package configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class conf_data_prov {
    Properties p;
    FileInputStream f;

    public conf_data_prov(String Lang) throws IOException {
        System.out.println("Lang is :"+Lang);

        p=new Properties();
        try {
            switch(Lang.toLowerCase()) {
                case "english" :
                    f=new FileInputStream("D:\\Apps data\\datascience\\p1\\src\\config\\config_url_english.properties");
                break;
                case "russian" :
                    f=new FileInputStream("D:\\Apps data\\datascience\\p1\\src\\config\\config_url_russian.properties");
                    break;
                default:
                    System.out.println("Lang not found :"+Lang);
                    break;
            }
            p.load(f);
        }
        catch(Exception e) {

        }

    }

}
