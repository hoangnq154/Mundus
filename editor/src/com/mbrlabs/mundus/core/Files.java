package com.mbrlabs.mundus.core;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

/**
 * @author Marcus Brummer
 * @version 12-12-2015
 */
public class Files {

    public static final String HOME_DIR = FilenameUtils.concat(FileUtils.getUserDirectoryPath(), ".mundus/");
    public static final String LOGS_DIR = FilenameUtils.concat(HOME_DIR, "logs/");
    public static final String MODEL_CACHE_DIR = FilenameUtils.concat(HOME_DIR, "model_cache/");

    public static final String HOME_DATA_FILE = FilenameUtils.concat(HOME_DIR, "home.kryo");

}
