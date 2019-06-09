package online.Gx.simpleweather.util;

public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);

}
