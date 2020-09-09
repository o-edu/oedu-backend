package net.oedu.backend.server.info;


import io.netty.channel.Channel;
import net.oedu.backend.base.upload.UploadFile;
import net.oedu.backend.data.entities.user.UserSession;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebsocketInfo {

    protected WebsocketInfo() {
        throw new RuntimeException("NOT_A_INSTANCE_CLASS");
    }

    public static final Map<Channel, UserSession> CHANNEL_USER_MAP = new HashMap<>();
    public static final Map<UserSession, Channel> USER_CHANNEL_MAP = new HashMap<>();
    public static final List<Channel> CHANNELS = new ArrayList<>();
    public static final Map<Channel, UploadFile> FILE_UPLOAD_MAP = new HashMap<>();
}
