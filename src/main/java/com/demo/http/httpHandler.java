package com.demo.http;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.HttpHeaderValues;
import io.netty.util.AsciiString;

public class httpHandler extends SimpleChannelInboundHandler<FullHttpRequest> {

    private AsciiString contentType = HttpHeaderValues.TEXT_PLAIN;
    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, FullHttpRequest fullHttpRequest) throws Exception {

    }
}
