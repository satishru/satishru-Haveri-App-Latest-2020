package application.haveri.tourism.ui.activity.splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.lifecycle.ViewModelProvider;

import com.google.firebase.iid.FirebaseInstanceId;

import application.haveri.tourism.BR;
import application.haveri.tourism.R;
import application.haveri.tourism.databinding.ActivitySplashBinding;
import application.haveri.tourism.ui.activity.home.HomeActivity;
import application.haveri.tourism.ui.base.BaseActivity;
import application.haveri.tourism.ui.fragment.error.ErrorBottomSheetFragment;
import application.haveri.tourism.utils.AppLogger;
import application.haveri.tourism.utils.NetworkUtils;
import application.haveri.tourism.utils.ViewAnimationUtils;

/**
 * Splash Screen
 * <p>
 * https://github.com/android10/Android-CleanArchitecture/tree/master/data
 */
//TODO Create Maps Key For Both Dev and Production
public class SplashActivity extends BaseActivity<ActivitySplashBinding, SplashViewModel> implements
        iSplashActivityContract.iSplashNavigator,
        ErrorBottomSheetFragment.ErrorBottomSheetFragmentCallBack {

    private SplashViewModel mSplashViewModel;
    private String fcm_token;

    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_splash;
    }

    @Override
    public SplashViewModel getViewModel() {
        mSplashViewModel = new ViewModelProvider(this, factory).get(SplashViewModel.class);
        return mSplashViewModel;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySplashBinding activitySplashBinding = getViewDataBinding();
        mSplashViewModel.setNavigator(this);
        activitySplashBinding.tvSplash.setText(getString(R.string.title_app_name));
        setAnimation();
        getFirebaseToken();
    }

    private void getFirebaseToken() {
        FirebaseInstanceId.getInstance().getInstanceId()
                .addOnCompleteListener(task -> {
                    if (!task.isSuccessful()) {
                        AppLogger.d("FCM InstanceId Failed %s", task.getException());
                        //return;
                    } else {
                        if (task.getResult() != null) {
                            // Get new Instance ID token
                            fcm_token = task.getResult().getToken();
                            AppLogger.d("FCM TOKEN %s", fcm_token);
                        }
                    }
                    startLoadingData();
                });
    }

    private void startLoadingData() {
        mSplashViewModel.startLoading();
        showLoader(true);
    }

    private void setAnimation() {
        ViewAnimationUtils.scaleAnimateView(getViewDataBinding().ivSplashIcon,
                ViewAnimationUtils.SCALE_DURATION_300);
        Animation animFadeIn = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade_in);
        getViewDataBinding().tvSplash.startAnimation(animFadeIn);
        ViewAnimationUtils.scaleAnimateView(getViewDataBinding().tvSplash,
                ViewAnimationUtils.SCALE_DURATION_300);
    }

    /**
     * iSplashActivityContract.iSplashNavigator CallBacks
     */
    @Override
    public void openHomeActivity() {
        Intent intent = HomeActivity.newIntent(SplashActivity.this);
        new Handler().postDelayed(() -> {
            if (!isFinishing()) {
                startActivityWithAnimation(intent);
                finish();
            }
        }, 300);
    }

    @Override
    public void openErrorDialog(int drawable, String errorMessage) {
        ErrorBottomSheetFragment errorBottomSheetFragment = ErrorBottomSheetFragment.newInstance(
                drawable, errorMessage);
        errorBottomSheetFragment.show(getSupportFragmentManager(),
                errorBottomSheetFragment.getTag());
        errorBottomSheetFragment.setCancelable(false);
    }

    @Override
    public String getFcmToken() {
        return fcm_token;
    }

    @Override
    public boolean isNetWorkConnected() {
        return NetworkUtils.isNetworkConnected(this);
    }
    /*iSplashActivityContract.iSplashNavigator CallBacks Ends*/

    /**
     * ErrorBottomSheetFragment.ErrorBottomSheetFragmentCallBack
     */
    @Override
    public void onRetryButtonClick() {
        mSplashViewModel.startLoading();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        showLoading(false);
    }
}
