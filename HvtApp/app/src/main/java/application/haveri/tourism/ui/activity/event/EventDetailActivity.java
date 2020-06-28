package application.haveri.tourism.ui.activity.event;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.lifecycle.ViewModelProvider;

import application.haveri.tourism.BR;
import application.haveri.tourism.HaveriApplication;
import application.haveri.tourism.R;
import application.haveri.tourism.data.model.api.response.haveri_data.District;
import application.haveri.tourism.data.model.api.response.haveri_data.Event;
import application.haveri.tourism.databinding.ActivityEventDetailBinding;
import application.haveri.tourism.ui.base.BaseActivity;
import application.haveri.tourism.utils.Language;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;

import application.haveri.tourism.utils.AppConstants;

/**
 * To Show event details
 */
public class EventDetailActivity extends BaseActivity<ActivityEventDetailBinding, EventDetailActivityViewModel>
        implements iEventDetailActivityContract.iEventDetailActivityNavigator {

    private ActivityEventDetailBinding activityEventDetailBinding;
    private EventDetailActivityViewModel eventDetailActivityViewModel;
    private District district;
    private Event selectedEvent;
    private YouTubePlayer currentYouTubePlayer;

    public static Intent newIntent(Activity activity, Event selectedEvent) {
        Intent intent = new Intent(activity, EventDetailActivity.class);
        intent.putExtra(AppConstants.INTENT_SELECTED_EVENT, selectedEvent);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        return intent;
    }

    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_event_detail;
    }

    @Override
    public EventDetailActivityViewModel getViewModel() {
        eventDetailActivityViewModel = new ViewModelProvider(this, factory).get(
                EventDetailActivityViewModel.class);
        return eventDetailActivityViewModel;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityEventDetailBinding = getViewDataBinding();
        setToolBar(activityEventDetailBinding.layoutToolbar.toolbar, 0, true);
        getBundleData();
        eventDetailActivityViewModel.setNavigator(this);
        eventDetailActivityViewModel.setEventData(selectedEvent, district);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        exitActivityWithAnimation();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            exitActivityWithAnimation();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void getBundleData() {
        district = HaveriApplication.getInstance().getDistrict();
        if (getIntent().getExtras() != null) {
            if (getIntent().hasExtra(AppConstants.INTENT_SELECTED_EVENT) && getIntent().getSerializableExtra(
                    AppConstants.INTENT_SELECTED_EVENT) != null) {
                selectedEvent = (Event) getIntent().getSerializableExtra(
                        AppConstants.INTENT_SELECTED_EVENT);
                setToolBarTitle();
            }
        }
    }

    private void setToolBarTitle() {
        if (selectedEvent != null) {
            setToolBarTitle(
                    eventDetailActivityViewModel.getSelectedLanguage() == Language.EN.getValue() ?
                            selectedEvent.getEventNameEn() :
                            selectedEvent.getEventNameKn());
        }
    }

    @Override
    public void playVideo() {
        activityEventDetailBinding.ivThumb.setVisibility(View.INVISIBLE);
        activityEventDetailBinding.btnPlay.setVisibility(View.GONE);
        activityEventDetailBinding.youtubePlayerView.setVisibility(View.VISIBLE);

        //activityEventDetailBinding.youtubePlayerView.enableBackgroundPlayback(false);
        activityEventDetailBinding.youtubePlayerView.getYouTubePlayerWhenReady(
                youTubePlayer -> {
                    currentYouTubePlayer = youTubePlayer;
                    currentYouTubePlayer.loadVideo(selectedEvent.getEventVideo(), 0);
                });
    }

    @Override
    public void navigateToMap() {
        if (selectedEvent != null) {
            if (currentYouTubePlayer != null) {
                currentYouTubePlayer.pause();
            }
            handleMapViewAndNavigation(selectedEvent.getEventLatitude(),
                    selectedEvent.getEventLongitude(), true);
        }
    }
}
