package com.alibaba.datax.plugin.unstructuredstorage.reader;

import java.io.IOException;

/**
 * @author: 百岁（baisui@qlangtech.com）
 * @create: 2022-10-17 16:13
 **/
public abstract class UnstructuredReader {

    //private static final Logger LOG = LoggerFactory.getLogger(UnstructuredReader.class);

    public abstract boolean hasNext() throws IOException;

    public abstract String[] next() throws IOException;

}
