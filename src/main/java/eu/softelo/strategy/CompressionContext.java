package eu.softelo.strategy;

import java.io.File;
import java.util.List;

/**
 * Created by: Damian
 * Date      : 2014-09-30
 */
public class CompressionContext {
    private CompressionStrategy compressionStrategy;

    public void createArchive(List<File> files) {
        compressionStrategy.compress(files);
    }

    public void setCompressionStrategy(CompressionStrategy compressionStrategy) {
        this.compressionStrategy = compressionStrategy;
    }
}
