package org.esa.s2tbx.gdal.writer.ui;

import org.esa.lib.gdal.activator.GDALDriverInfo;
import org.esa.snap.utils.StringHelper;

import javax.swing.filechooser.FileFilter;
import java.io.File;

/**
 * @author Jean Coravu
 */
public class ExportDriversFileFilter extends FileFilter {
    private final String description;
    private final GDALDriverInfo driverInfo;

    public ExportDriversFileFilter(String description, GDALDriverInfo driverInfo) {
        this.description = description;
        this.driverInfo = driverInfo;
    }

    @Override
    public boolean accept(File fileToAccept) {
        if (fileToAccept.isDirectory()) {
            return true;
        }
        return StringHelper.endsWithIgnoreCase(fileToAccept.getName(), this.driverInfo.getExtensionName());
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    public GDALDriverInfo getDriverInfo() {
        return driverInfo;
    }
}
