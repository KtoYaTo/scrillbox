import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Every after 5 sec get screenshot and save in Dropbox
 * @autor Gavrilov Vasily
 */
public class Main
{
    public static void main (String[] args)
    {
        String ACCESS_TOKEN = "sl.AlC9iilpPiZykJXideAQFuT59EllVMy01mOKEjHwfA8vb_hK0t3qe-ah42sfstzBOcvqx_JxL4ouKRck6PUvfGZTz4hepjkE0f5j4ffLfVnALfjwyoBb6IdHrcBDXpSc022h0l0";

        DbxRequestConfig config = DbxRequestConfig.newBuilder("dropbox/java-tutorial").build();
        DbxClientV2 client = new DbxClientV2(config, ACCESS_TOKEN);

        try {
            InputStream in = new FileInputStream("/Users/sortedmap/Desktop/exceptions.jpg");
            client.files().uploadBuilder("/picture.jpg")
                    .uploadAndFinish(in);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
