package com.github.tvbox.osc.util;

import android.util.Base64;

public class HawkConfig {

    public static boolean FORCE_pause = false;
    public static String APP_ID = "10000";

    public static String Your_app_id = "";
    public static String Your_channel_id = "";
    public static String zb_vpn = "0";
    public static final String BASE_URL_ENC = "aHR0cDovL2RkLjIxMDkudG9w";
    public static String MMM_MMM = new String(Base64.decode(HawkConfig.BASE_URL_ENC.getBytes(), Base64.DEFAULT));
    public static String API_KEY = "59a49aa6162bbb486150ba2188b48766";
    public static final String SOURCES_FOR_SEARCH = "checked_sources_for_search";
    public static final String DOH_URL = "doh_url";
    public static final String API_URL = "api_url";
    public static final String API_URL2 = "api_url2";
    public static final String SHOW_PREVIEW = "show_preview";
    public static final String HOME_API = "home_api";
    public static final String JSON_URL = "json_url";
    public static final String JSON_URL2 = "json_url2";
    public static final String IJK_CODEC = "ijk_codec";
    public static final String HOME_SHOW_SOURCE = "show_source";
    public static final String PLAY_TYPE = "play_type";
    public static final String DEBUG_OPEN = "debug_open";
    public static final String API_HISTORY = "api_history";
    public static final String EPG_URL = "epg_url";
    public static final String LIVE_URL = "live_url";
    public static final String LIVE_HISTORY = "live_history";
    public static final String DEFAULT_PARSE = "parse_default";
    public static final String PIC_IN_PIC = "pic_in_pic";
    public static final String PARSE_WEBVIEW = "parse_webview";
    public static final String PLAY_SCALE = "play_scale";
    public static final String PLAY_RENDER = "play_render";
    public static final String PLAY_TIME_STEP = "play_time_step";
    public static final String HOME_REC = "home_rec";
    public static final String SEARCH_VIEW = "search_view";
    public static final String LIVE_CHANNEL = "last_live_channel_name";
    public static final String LIVE_CHANNEL_REVERSE = "live_channel_reverse";
    public static final String LIVE_CROSS_GROUP = "live_cross_group";
    public static final String LIVE_CONNECT_TIMEOUT = "live_connect_timeout";
    public static final String LIVE_SHOW_NET_SPEED = "live_show_net_speed";
    public static final String LIVE_SHOW_TIME = "live_show_time";
    public static boolean hotVodDelete;
    public static final String SUBTITLE_TEXT_SIZE = "subtitle_text_size";
    public static final String SUBTITLE_TIME_DELAY = "subtitle_time_delay";
    public static final String THEME_SELECT = "theme_select";
    public static final String REMOTE_TVBOX = "remote_tvbox_host";
    public static final String IJK_CACHE_PLAY = "ijk_cache_play";
}
