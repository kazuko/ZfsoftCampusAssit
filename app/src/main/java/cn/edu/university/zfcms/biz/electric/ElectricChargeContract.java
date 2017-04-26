package cn.edu.university.zfcms.biz.electric;

import android.graphics.Bitmap;

import cn.edu.university.zfcms.app.mvp.BasePresenter;
import cn.edu.university.zfcms.app.mvp.BaseView;
import cn.edu.university.zfcms.storage.entity.ElectricCharge;

/**
 * Created by hjw on 2016/04/18 0018.
 */
public interface ElectricChargeContract {
    interface View extends BaseView<Presenter>{
        void showInquirySuccess(ElectricCharge electricCharge);
        void showInquiryError(String msg);
        void showLoading(boolean visible);
        void showCheckCode(Bitmap bitmap);
    }

    interface Presenter extends BasePresenter {
        void loadElectricInquiryResult(String checkCode);
        void loadCheckCode();
    }
}
