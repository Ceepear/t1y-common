package net.t1y.cloud2.common.os;

public interface T1CloudCtrl{
    void openKotlinGlobalScope();
    void closeKotlinGlobalScope();
    void openDebug(DebugCtrl debugCtrl);
    void setHttpCtrl(HttpCtrl httpCtrl);
    void closeDebug();
    void close();
    HttpCtrl getHttpCtrl();
    Object getCloudService(String string);
}
