package org.pytorch.demo.objectdetection;

import android.content.Intent;
import android.net.Uri;

import androidx.documentfile.provider.DocumentFile;

import java.io.File;
import java.util.logging.Logger;

public class ValidationAnalyst {

    Logger log;
    DocumentFile imagesFolder;
    DocumentFile labelsFolder;

    public ValidationAnalyst(DocumentFile df) {
        log = Logger.getLogger("ValAnalyst");
        imagesFolder = df.findFile("images");
        labelsFolder = df.findFile("labels");
        if(imagesFolder != null && labelsFolder != null) {
            log.info("Images: "+imagesFolder.listFiles().length);
            log.info("Labels: "+labelsFolder.listFiles().length);
        }else {
            log.info("Error getting images and labels folder.");
        }
    }

}
