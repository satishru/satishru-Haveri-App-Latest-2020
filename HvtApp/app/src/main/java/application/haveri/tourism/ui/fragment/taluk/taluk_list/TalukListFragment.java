package application.haveri.tourism.ui.fragment.taluk.taluk_list;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;

import application.haveri.tourism.BR;
import application.haveri.tourism.R;
import application.haveri.tourism.data.model.api.response.haveri_data.Taluk;
import application.haveri.tourism.databinding.FragmentTalukListBinding;
import application.haveri.tourism.ui.base.BaseFragment;
import application.haveri.tourism.ui.fragment.taluk.taluk_list.adapter.TalukListAdapter;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;
import javax.inject.Provider;

public class TalukListFragment extends BaseFragment<FragmentTalukListBinding, TalukListFragmentViewModel> implements
        iTalukListFragmentContract.iTalukListFragmentNavigator,
        TalukListAdapter.TalukListAdapterListener {

    @Inject
    TalukListAdapter talukListAdapter;

    @Inject
    Provider<LinearLayoutManager> mLayoutManager;

    private FragmentTalukListBinding fragmentTalukListBinding;
    private TalukListFragmentCallBack iTalukListFragmentCallBack;
    private TalukListFragmentViewModel talukListFragmentViewModel;

    public interface TalukListFragmentCallBack {
        void openTalukDetailFragment(Taluk taluk);

        void hidePopupDataTitle();
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        iTalukListFragmentCallBack = (TalukListFragmentCallBack) context;
    }

    public static TalukListFragment newInstance() {
        Bundle args = new Bundle();
        TalukListFragment fragment = new TalukListFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_taluk_list;
    }

    @Override
    public TalukListFragmentViewModel getViewModel() {
        talukListFragmentViewModel = new ViewModelProvider(this, factory).get(
                TalukListFragmentViewModel.class);
        return talukListFragmentViewModel;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        fragmentTalukListBinding = getViewDataBinding();
        talukListFragmentViewModel.setNavigator(this);
        talukListFragmentViewModel.startLoadingData(getDistrictData());
        setTalukListAdapter();
    }

    @Override
    public void onResume() {
        super.onResume();
        if (getBaseActivity() != null) {
            if (iTalukListFragmentCallBack != null) {
                iTalukListFragmentCallBack.hidePopupDataTitle();
            }
            getBaseActivity().setToolBarTitle(getString(R.string.title_activity_taluk));
        }
    }

    private void setTalukListAdapter() {
        talukListAdapter.setListener(this);
        fragmentTalukListBinding.rvTalukList.setLayoutManager(mLayoutManager.get());
        fragmentTalukListBinding.rvTalukList.setItemAnimator(new DefaultItemAnimator());
        fragmentTalukListBinding.rvTalukList.addItemDecoration(getVerticalDivider());
        fragmentTalukListBinding.rvTalukList.setAdapter(talukListAdapter);
    }

    /**
     * TalukListAdapter.TalukListAdapterListener
     *
     * @param taluk Taluk Obj
     */
    @Override
    public void onItemClick(Taluk taluk) {
        if (iTalukListFragmentCallBack != null) {
            iTalukListFragmentCallBack.openTalukDetailFragment(taluk);
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        fragmentTalukListBinding.rvTalukList.setAdapter(null);
    }
}
