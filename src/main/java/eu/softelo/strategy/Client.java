package eu.softelo.strategy;

import java.util.Collections;

/**
 * Created by: Damian
 * Date      : 2014-09-30
 */
public class Client {

    public static void main(String[] args) {
        CompressionContext ctx = new CompressionContext();
        ctx.setCompressionStrategy(new ZipCompressionStrategy());
        ctx.createArchive(Collections.EMPTY_LIST);
    }
}