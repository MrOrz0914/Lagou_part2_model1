package server;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Response {

    private OutputStream outputStream;

    public Response(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    public void output(String content) throws IOException {
        outputStream.write(content.getBytes());
    }

    public void outputHtml() throws IOException {
        output(HttpProtocolUtil.getHttpHeader404());
    }
}
