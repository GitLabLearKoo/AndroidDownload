package cn.sddman.download.thread;

import android.os.Handler;
import android.os.Message;

import cn.sddman.download.common.Const;
import cn.sddman.download.mvp.v.PlayerView;

public class UpdataUIPlayHandler extends Handler {
    private PlayerView playerView;
    public UpdataUIPlayHandler(PlayerView playerView){
        this.playerView=playerView;
    }
    @Override
    public void handleMessage(Message msg) {
        switch (msg.what) {
            case Const.UI_UPDATE_PLAY_STATION:
                playerView.updateUIPlayStation(msg.arg1, msg.arg2);
                break;
            default:
                break;
        }
    }
}
