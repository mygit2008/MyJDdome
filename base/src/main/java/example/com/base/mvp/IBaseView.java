package example.com.base.mvp;

/**
 * @author zhangjunyou
 * @date 2018/6/12
 * @description
 * @Copyright 版权所有, 未经授权不得转载其他 .
 */

public interface IBaseView {
    void showLoading();

    void hideLoading();

    void serverFail(String msg);
}
