package eu.softelo.strategy;

import java.io.File;
import java.util.List;

/**
 * Created by: Damian
 * Date      : 2014-09-30
 */
public class ZipCompressionStrategy implements CompressionStrategy {
    @Override
    public void compress(List<File> files) {
        System.out.println("Compressing files to RAR archive");
    }
}