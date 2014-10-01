package eu.softelo.strategy;

import java.io.File;
import java.util.List;

/**
 * Created by: Damian
 * Date      : 2014-09-30
 */
public interface CompressionStrategy {
    void compress(List<File> fles);
}
