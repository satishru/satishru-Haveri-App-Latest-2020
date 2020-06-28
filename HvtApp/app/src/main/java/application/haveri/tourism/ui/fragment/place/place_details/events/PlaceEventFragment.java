package application.haveri.tourism.ui.fragment.place.place_details.events;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;

import application.haveri.tourism.BR;
import application.haveri.tourism.R;
import application.haveri.tourism.data.model.api.response.haveri_data.Event;
import application.haveri.tourism.data.model.api.response.haveri_data.Place;
import application.haveri.tourism.databinding.FragmentPlaceEventBinding;
import application.haveri.tourism.ui.activity.event.EventDetailActivity;
import application.haveri.tourism.ui.base.BaseFragment;
import application.haveri.tourism.ui.fragment.common.adapter.EventsAdapter;
import application.haveri.tourism.utils.AppConstants;

import javax.inject.Inject;
import javax.inject.Provider;

public class PlaceEventFragment extends BaseFragment<FragmentPlaceEventBinding, PlaceEventFragmentViewModel> implements
        iPlaceEventFragmentContract.iPlaceEventFragmentNavigator,
        EventsAdapter.EventsAdapterListener {

    @Inject
    EventsAdapter eventsAdapter;

    @Inject
    Provider<LinearLayoutManager> layoutManager;

    private FragmentPlaceEventBinding fragmentPlaceEventBinding;
    private PlaceEventFragmentViewModel placeEventFragmentViewModel;
    private Place selectedPlace;

    public static PlaceEventFragment newInstance(Place selectedPlace) {
        Bundle args = new Bundle();
        PlaceEventFragment fragment = new PlaceEventFragment();
        args.putSerializable(AppConstants.INTENT_SELECTED_PLACE, selectedPlace);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_place_event;
    }

    @Override
    public PlaceEventFragmentViewModel getViewModel() {
        placeEventFragmentViewModel = new ViewModelProvider(this, factory).get(
                PlaceEventFragmentViewModel.class);
        return placeEventFragmentViewModel;
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        fragmentPlaceEventBinding = getViewDataBinding();
        placeEventFragmentViewModel.setNavigator(this);
        getBundleData();
        if (selectedPlace != null) {
            placeEventFragmentViewModel.setEventData(selectedPlace);
        }
        setEventAdapter();
    }

    private void getBundleData() {
        if (getArguments() != null && getArguments().containsKey(
                AppConstants.INTENT_SELECTED_PLACE)) {
            selectedPlace = (Place) getArguments().getSerializable(
                    AppConstants.INTENT_SELECTED_PLACE);
        }
    }

    private void setEventAdapter() {
        eventsAdapter.setListener(this);
        fragmentPlaceEventBinding.rvEventList.setLayoutManager(layoutManager.get());
        fragmentPlaceEventBinding.rvEventList.setItemAnimator(new DefaultItemAnimator());
        fragmentPlaceEventBinding.rvEventList.addItemDecoration(getHorizontalDivider());
        fragmentPlaceEventBinding.rvEventList.setAdapter(eventsAdapter);
        fragmentPlaceEventBinding.rvEventList.setNestedScrollingEnabled(true);
    }

    /**
     * EventsAdapter.EventsAdapterListener
     *
     * @param event Event
     */
    @Override
    public void onEventClick(Event event) {
        if (isDistrictNotNull()) {
            startActivityWithAnimation(
                    EventDetailActivity.newIntent(getBaseActivity(), event));
        }
    }
}
